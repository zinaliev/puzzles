package org.zinaliev.puzzles.concurrency;


import org.zinaliev.puzzles.queue.CyclicBuffer;

/**
 * Blocking wrapper over {@link CyclicBuffer}
 */
public class BlockingCyclicBuffer {

  private final Object syncObj = new Object();
  private final CyclicBuffer buffer;

  public BlockingCyclicBuffer(int size) {
    buffer = new CyclicBuffer(size);
  }

  public Object get() throws InterruptedException {
    synchronized (syncObj) {

      while (buffer.isEmpty()) {
        syncObj.wait();
      }

      syncObj.notifyAll();

      return buffer.get();
    }
  }

  public void put(Object item) throws InterruptedException {
    synchronized (syncObj) {
      while (buffer.isFull()) {
        syncObj.wait();
      }

      buffer.put(item);

      syncObj.notifyAll();
    }
  }
}
