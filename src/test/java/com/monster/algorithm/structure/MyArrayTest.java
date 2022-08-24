package com.monster.algorithm.structure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayTest {

    @Test
    void insert() {
        int initSize = 3;
        int realSize = 3 * 3;
        MyArray array = new MyArray(initSize);
        for (int i = 0; i < realSize; i++) {
            array.insert(i, i);
        }
        assertEquals(9, array.size());
        assertEquals(8, array.get(realSize - 1));
    }

    @Test
    void remove() {
        int initSize = 3;
        int realSize = 3 * 3;
        MyArray array = new MyArray(initSize);
        for (int i = 0; i < realSize; i++) {
            array.insert(i, i);
        }
        assertEquals(9, array.size());
        int remove = array.remove(0);
        assertEquals(0, remove);
        assertEquals(1, array.get(0));
        assertEquals(8, array.size());
    }
}