package com.monster.algorithm.structure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    MyLinkedList myLinkedList;

    @BeforeEach
    void setUp() {
        myLinkedList = new MyLinkedList();
    }

    @Test
    void insert() {
        myLinkedList.insert(0,1);
        assertEquals(myLinkedList.toString(), "1");
        myLinkedList.insert(1,3);
        myLinkedList.insert(2, 5);
        assertEquals(myLinkedList.toString(), "1,3,5");
        myLinkedList.insert(1, 10);
        assertEquals(myLinkedList.toString(), "1,10,3,5");
    }

    @Test
    void remove_head() {
        myLinkedList.insert(0,1);
        myLinkedList.insert(1,3);
        myLinkedList.insert(2, 5);
        myLinkedList.insert(1, 10);
        myLinkedList.remove(0);
        assertEquals(myLinkedList.toString(), "10,3,5");
    }

    @Test
    void remove_middle() {
        myLinkedList.insert(0,1);
        myLinkedList.insert(1,3);
        myLinkedList.insert(2, 5);
        myLinkedList.insert(1, 10);
        myLinkedList.remove(2);
        assertEquals(myLinkedList.toString(), "1,10,5");
    }

    @Test
    void remove_last() {
        myLinkedList.insert(0,1);
        myLinkedList.insert(1,3);
        myLinkedList.insert(2, 5);
        myLinkedList.insert(1, 10);
        myLinkedList.remove(myLinkedList.size - 1);
        assertEquals(myLinkedList.toString(), "1,10,3");

    }
}