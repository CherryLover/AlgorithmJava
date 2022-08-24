package com.monster.algorithm;

public class Utils {

    public static String getStringFromArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i != array.length - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static void print(Object object) {
        System.out.println(object);
    }
}
