package com.monster.algorithm.sort;

import com.monster.algorithm.Utils;

public class BubbleSort implements Sort {

    private int sortCount = 0;
    @Override
    public String sort(int[] array) {
        int lastExchangeIndex = 0;
        int sortBorder = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < sortBorder; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSorted = false;
                    lastExchangeIndex = j;
                }
            }
            sortBorder = lastExchangeIndex;
            if (isSorted) {
                break;
            }
            sortCount++;
        }
        System.out.println("排序次数：" + sortCount);
        return Utils.getStringFromArray(array);
    }
}
