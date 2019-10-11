package com.monster.algorithm;

import java.util.Random;

public class Utils {

    public static int[] randomNumber(int count) {
        int[] randomArray = new int[count];
        for (int i = 0; i < count; i++) {
            randomArray[i] = randomNumber();
        }
        printArray(randomArray);
        return randomArray;
    }

    private static int randomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static void printArray(int[] a) {
        StringBuilder sb = new StringBuilder("Array is : ");
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i != a.length - 1) {
                sb.append(",");
            }
        }
        print(sb.toString());
    }

    public static void print(Object object) {
        System.out.println(object);
    }
}
