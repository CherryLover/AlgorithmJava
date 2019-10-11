package com.monster.algorithm;

import com.monster.algorithm.structure.MyArray;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Algorithm World");
        MyArray myArray = new MyArray(5);
        myArray.insert(0, 5);
        myArray.insert(1, 8);
        myArray.insert(2,9);
        myArray.insert(3,1);
        myArray.insert(4,4);
        myArray.insert(5,7);
        myArray.insert(6,2);
//        myArray.insert(2, 10);
//        myArray.insert(0, 3);
//        myArray.insert(2, 2);
        myArray.out();
    }
}