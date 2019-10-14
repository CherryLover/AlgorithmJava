package com.monster.algorithm.structure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    private MyStack stack = new MyStack(10);

    @Test
    public void test_push_for_stack() {
        stack.push(0);
        stack.push(1);
        stack.push(2);
        assertEquals(stack.toString(), "0,1,2");
    }

    @Test
    public void test_push_and_pop() {
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.push(5);
        System.out.println(stack.toString());
        assertEquals(stack.toString(), "0,1,5");
    }

    @Test
    public void test_pop_all() {
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.push(5);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.toString());
        assertEquals(stack.toString(), "");
    }

    @Test
    public void test_resize_push() {
        MyStack myStack = new MyStack(3);
        myStack.push(1);
        myStack.push(3);
        myStack.push(5);
        myStack.push(7);
        assertEquals(myStack.toString(), "1,3,5,7");
    }
}