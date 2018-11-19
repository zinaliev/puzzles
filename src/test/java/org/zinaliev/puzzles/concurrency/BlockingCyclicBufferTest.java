package org.zinaliev.puzzles.concurrency;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BlockingCyclicBufferTest {

    private BlockingCyclicBuffer buffer = new BlockingCyclicBuffer(1);

    @Test
    public void testGet_EmptyBuffer_BlocksTillItemsIsAdded() throws InterruptedException {
        long sleepMillis = 1500;
        Object a = 123;

        Thread putThread = new Thread(() -> {
            try {
                Thread.sleep(sleepMillis);

                buffer.put(a);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        long getTime = System.currentTimeMillis();

        putThread.start();

        assertEquals(a, buffer.get());

        getTime = System.currentTimeMillis() - getTime;

        assertTrue(getTime > sleepMillis);
    }

    @Test
    public void testPut_FullBuffer_BlocksTillItemIsRemoved() throws InterruptedException {
        long sleepMillis = 1500;
        Object a = 123;

        buffer.put(234);

        Thread getThread = new Thread(() -> {
            try {
                Thread.sleep(sleepMillis);

                buffer.get();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        long putTime = System.currentTimeMillis();

        getThread.start();

        buffer.put(a);

        putTime = System.currentTimeMillis() - putTime;

        assertEquals(a, buffer.get());
        assertTrue(putTime > sleepMillis);
    }
}