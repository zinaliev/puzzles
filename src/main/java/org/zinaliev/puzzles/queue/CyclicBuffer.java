package org.zinaliev.puzzles.queue;

public class CyclicBuffer {

  private final Object[] items;
  protected int size;
  private int head;
  private int tail;

  public CyclicBuffer(int size) {
    if (size <= 0)
      throw new IllegalArgumentException("size value can not be 0 or negative");

    items = new Object[size];
  }

  public void put(Object item) {
    if (isFull())
      throw new IllegalStateException("buffer is full");

    items[tail] = item;

    size++;
    tail = normalize(head + size);
  }

  public Object get() {
    if (isEmpty())
      throw new IllegalStateException("buffer is empty");

    Object result = items[head];

    size--;
    head = normalize(tail - size);
    return result;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean isFull() {
    return size == items.length;
  }

  private int normalize(int index) {
    return (items.length + index) % items.length;
  }
}
