package com.monster.algorithm.sort;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortTest {

    @Test
    public void test_bubble_sort() {
        int[] array = {5, 8, 6, 3, 9, 2, 1, 7};
        Sort sort = new BubbleSort();
        assertEquals("1,2,3,5,6,7,8,9", sort.sort(array));
    }
}
