package org.zinaliev.puzzles.queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircularQueueTest {

    @Test
    public void testLcCircularQueue() {
        LcCircularQueue queue = new LcCircularQueue(4);

        assertTrue(queue.enQueue(3));
        assertTrue(queue.enQueue(9));
        assertTrue(queue.enQueue(5));
        assertTrue(queue.enQueue(1));

        assertFalse(queue.enQueue(1));

        assertTrue(queue.deQueue());
        assertTrue(queue.deQueue());

        assertFalse(queue.isEmpty());
        assertFalse(queue.isEmpty());

        assertEquals(1, queue.Rear());
        assertEquals(1, queue.Rear());

        assertEquals(5, queue.Front());
        assertTrue(queue.deQueue());

        assertEquals(1, queue.Front());
        assertEquals(1, queue.Rear());

        assertTrue(queue.deQueue());
        assertFalse(queue.deQueue());
    }

}