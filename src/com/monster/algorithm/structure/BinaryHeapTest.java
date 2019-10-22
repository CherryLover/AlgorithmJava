package com.monster.algorithm.structure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryHeapTest {

    @Test
    public void test_upAdjust() {
        int[] array = {1, 3, 2, 6, 5, 7, 8, 9, 10, 0};
        BinaryHeap binaryHeap = new BinaryHeap();
        assertEquals(binaryHeap.upAdjust(array), binaryHeap.adjustRight(array));
    }

    /**
     * 没有测试二叉堆的下沉算法，是因为二叉堆的构建过程就是从最后一个非叶子节点开始不断下沉。
     */
    @Test
    public void test_build() {
        int[] array = {7, 1, 3, 10, 5, 2, 8, 9, 6};
        BinaryHeap binaryHeap = new BinaryHeap();
        String expected = binaryHeap.buildHeap(array);
        System.out.println("after is : " + expected);
    }

}