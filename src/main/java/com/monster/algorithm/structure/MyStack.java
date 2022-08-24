package com.monster.algorithm.structure;

public class MyStack {
    int size = 0;
    private int[] stackArray;

    public MyStack(int capacity) {
        stackArray = new int[capacity];
    }

    public void push(int data) {
        if (size == stackArray.length) {
            resize();
        }
        stackArray[size] = data;
        size++;
    }

    private void resize() {
        int[] tempArray = new int[stackArray.length * 2];
        System.arraycopy(stackArray, 0, tempArray, 0, size);
        stackArray = tempArray;
    }

    public void pop() {
        if (size == 0) {
            throw new RuntimeException("当前栈为空");
        }
        stackArray[size - 1] = -1;
        size--;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(stackArray[i]);
            if (i < size - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
