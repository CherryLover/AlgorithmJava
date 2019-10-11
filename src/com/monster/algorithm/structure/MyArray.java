package com.monster.algorithm.structure;

import static com.monster.algorithm.Utils.printArray;

public class MyArray {
    private int[] array;
    private int size;

    public MyArray(int capacity) {
        array = new int[capacity];
        this.size = 0;
    }

    /**
     * 1. 插入新数据时，向右移动原有数据为插入元素腾空位置，后再执行插入
     * @param index 下标
     * @param element 元素
     */
    public void insert(int index, int element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出数组实际长度");
        }
        // 复制待插入位置及其后的数据
        if (size == array.length) {
            resize();
        }
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        // 插入新的数据
        array[index] = element;
        size++;
    }

    private void resize() {
        int oldLength = array.length;
        int[] tempArray = new int[(int) (oldLength * 1.5)];
        System.arraycopy(array, 0, tempArray, 0, oldLength);
        array = tempArray;
    }

    public void out() {
        printArray(array);
    }
}
