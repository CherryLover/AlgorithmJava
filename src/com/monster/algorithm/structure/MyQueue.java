package com.monster.algorithm.structure;

public class MyQueue {
    private int[] queueArray;
    private int front = 0;
    private int rear = 0;

    public MyQueue(int capacity) {
        queueArray = new int[capacity];
    }

    public void enqueue(int data) {
        if (rearIndex() == rear) {
            throw new RuntimeException("队列已满");
        }
        queueArray[rear] = data;
        rear = rearIndex();

    }

    public void dequeue() {
        if (front == rear) {
            throw new RuntimeException("队列已空");
        }
        front = frontIndex();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = front; i != rear; i = (i +1) % queueArray.length) {
            sb.append(queueArray[i]).append(",");
        }
        String string = sb.toString();
        string = string.substring(0, string.length() - 1);
        return string;
    }

    private int rearIndex() {
        return (rear + 1) % queueArray.length;
    }

    public int frontIndex() {
        return (front + 1) % queueArray.length;
    }
}
