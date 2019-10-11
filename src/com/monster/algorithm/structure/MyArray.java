package com.monster.algorithm.structure;

import static com.monster.algorithm.Utils.print;

public class MyArray {
    private int[] array;
    private int size;

    public MyArray(int capacity) {
        array = new int[capacity];
        this.size = 0;
    }

    /**
     * 1. 插入新数据时，向右移动原有数据为插入元素腾空位置，后再执行插入
     *
     * @param index   下标
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

    /**
     * 移出当前元素，剩余元素向前移动一位，同时 size - 1
     *
     * @param index 移出位置
     * @return 移出内容
     */
    public int remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("待移出下标超出数组实际长度");
        }
        int removeElement = array[index];
        // 移出数据后数据左移
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return removeElement;
    }

    private void resize() {
        int oldLength = array.length;
        int[] tempArray = new int[(int) (oldLength * 1.5)];
        System.arraycopy(array, 0, tempArray, 0, oldLength);
        array = tempArray;
    }

    public void out() {
        StringBuilder sb = new StringBuilder("Array is : ");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(",");
            }
        }
        print(sb.toString());
    }
}
