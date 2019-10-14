package com.monster.algorithm.structure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {


    @Test
    public void test_enqueue() {
        MyQueue queue = new MyQueue(10);
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(5);
        assertEquals(queue.toString(), "1,3,5");
    }

    @Test
    public void test_dequeue() {
        MyQueue queue = new MyQueue(10);
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(7);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertEquals(queue.toString(), "7");
    }

    @Test
    public void test_enqueue_more() {
        MyQueue queue = new MyQueue(5);
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(7);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);
        assertEquals(queue.toString(), "7,11,12,13");
    }

}