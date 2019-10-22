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

    @Test
    public void test_bubble_sort_better() {
        int[] array = {3, 4, 2, 1, 5, 6, 7, 8};
        Sort sort = new BubbleSort();
        assertEquals("1,2,3,4,5,6,7,8", sort.sort(array));
    }

    @Test
    void test_cocktailSort() {
        int[] array = {3, 4, 2, 1, 5, 6, 7, 8};
        Sort sort = new CocktailSort();
        assertEquals("1,2,3,4,5,6,7,8", sort.sort(array));
    }
}
