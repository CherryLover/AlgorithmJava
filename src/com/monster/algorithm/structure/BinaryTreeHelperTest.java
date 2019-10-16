package com.monster.algorithm.structure;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeHelperTest {

    @Test
    public void test_create_binaryTree() {
        Integer[] sampleArray = {3, 2, 9, null, null, 10, null, null, 8, null, 4};
        BinaryTreeHelper.TreeNode binaryTree = BinaryTreeHelper.getInstance().createBinaryTree(new LinkedList<>(Arrays.asList(sampleArray)));
        assertEquals(binaryTree.data, 3);
    }

    @Test
    public void test_binaryTree_preOrder() {
        Integer[] sampleArray = {3, 2, 9, null, null, 10, null, null, 8, null, 4};
        BinaryTreeHelper instance = BinaryTreeHelper.getInstance();
        BinaryTreeHelper.TreeNode binaryTree = instance.createBinaryTree(new LinkedList<>(Arrays.asList(sampleArray)));
        String out = instance.preOrder(binaryTree);
        assertEquals(out, "3,2,9,10,8,4,");
    }

    @Test
    public void test_binaryTree_middleOrder() {
        Integer[] sampleArray = {3, 2, 9, null, null, 10, null, null, 8, null, 4};
        BinaryTreeHelper instance = BinaryTreeHelper.getInstance();
        BinaryTreeHelper.TreeNode binaryTree = instance.createBinaryTree(new LinkedList<>(Arrays.asList(sampleArray)));
        String out = instance.middleOrder(binaryTree);
        assertEquals(out, "9,2,10,3,8,4,");
    }

    @Test
    public void test_binaryTree_postOrder() {
        Integer[] sampleArray = {3, 2, 9, null, null, 10, null, null, 8, null, 4};
        BinaryTreeHelper instance = BinaryTreeHelper.getInstance();
        BinaryTreeHelper.TreeNode binaryTree = instance.createBinaryTree(new LinkedList<>(Arrays.asList(sampleArray)));
        String out = instance.postOrder(binaryTree);
        assertEquals(out, "9,10,2,4,8,3,");
    }

    @Test
    public void test_binaryTree_levelOrder() {
        Integer[] sampleArray = {3, 2, 9, null, null, 10, null, null, 8, null, 4};
        BinaryTreeHelper instance = BinaryTreeHelper.getInstance();
        BinaryTreeHelper.TreeNode binaryTree = instance.createBinaryTree(new LinkedList<>(Arrays.asList(sampleArray)));
        String out = instance.levelOrder(binaryTree);
        assertEquals(out, "3,2,8,9,10,4,");
    }

}