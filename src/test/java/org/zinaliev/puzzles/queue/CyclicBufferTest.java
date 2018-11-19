package org.zinaliev.puzzles.queue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CyclicBufferTest {

    private CyclicBuffer buffer;

    @Test(expected = IllegalArgumentException.class)
    public void testCtor_ZeroSized_ThrowsException() {
        buffer = new CyclicBuffer(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCtor_NegativeSized_ThrowsException() {
        buffer = new CyclicBuffer(-1);
    }

    @Test(expected = IllegalStateException.class)
    public void testGet_EmptyBuffer_ThrowsIllegalStateException() {

        buffer = new CyclicBuffer(10);

        buffer.get();
    }

    @Test(expected = IllegalStateException.class)
    public void testPut_FullBuffer_ThrowsIllegalStateException() {

        buffer = new CyclicBuffer(1);

        buffer.put(new Object());
        buffer.put(new Object());
    }

    @Test
    public void testPutGet_ReturnsExistingItem() {
        buffer = new CyclicBuffer(1);

        Object item = new Object();

        buffer.put(item);

        assertEquals(item, buffer.get());
    }

    @Test
    public void testFifo_FitInBuffSize() {
        buffer = new CyclicBuffer(2);
        Integer a = 1;
        Integer b = 2;

        buffer.put(a);
        buffer.put(b);

        assertEquals(a, buffer.get());
        assertEquals(b, buffer.get());
    }

    @Test
    public void testFifo_ExceedingBuffSize() {
        buffer = new CyclicBuffer(2);
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;

        buffer.put(a);
        buffer.put(b);

        assertEquals(a, buffer.get());

        buffer.put(c);

        assertEquals(b, buffer.get());
        assertEquals(c, buffer.get());
    }

}