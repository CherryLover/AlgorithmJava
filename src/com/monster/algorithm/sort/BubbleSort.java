package com.monster.algorithm.sort;

import com.monster.algorithm.Utils;

public class BubbleSort implements Sort {

    @Override
    public String sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return Utils.getStringFromArray(array);
    }
}
