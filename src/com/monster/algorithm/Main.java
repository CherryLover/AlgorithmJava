package com.monster.algorithm;

import com.monster.algorithm.structure.MyArray;
import com.monster.algorithm.structure.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Algorithm World");
//        test_my_array();
        test_my_linkedList();
    }

    private static void test_my_linkedList() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.insert(0, 1);
        myLinkedList.insert(1, 3);
        myLinkedList.insert(2, 5);
        myLinkedList.insert(1, 10);
        myLinkedList.output();
        myLinkedList.remove(myLinkedList.size - 1);
        myLinkedList.output();
    }

    private static void test_my_array() {
        MyArray myArray = new MyArray(5);
        myArray.insert(0, 5);
        myArray.insert(1, 8);
        myArray.insert(2,9);
        myArray.insert(3,1);
        myArray.insert(4,4);
        myArray.insert(5,7);
        myArray.insert(6,2);
        myArray.remove(4);
//        myArray.insert(2, 10);
//        myArray.insert(0, 3);
//        myArray.insert(2, 2);
        myArray.out();
    }
}