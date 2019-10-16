package com.monster.algorithm.structure;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeHelper {

    private BinaryTreeHelper() {
    }

    public static BinaryTreeHelper getInstance() {
        return Holder.single;
    }

    /**
     * 利用递归调用不断的调用当前方法去二叉树节点
     */
    public TreeNode createBinaryTree(LinkedList<Integer> linkedList) {
        if (linkedList == null || linkedList.isEmpty()) {
            return null;
        }
        TreeNode node = null;
        Integer data = linkedList.removeFirst();
        if (data != null) {
            node = new TreeNode(data);
            node.left = createBinaryTree(linkedList);
            node.right = createBinaryTree(linkedList);
        }
        return node;
    }

    /**
     * 二叉树的前序调用
     *
     * @param node 节点
     * @return 节点值
     */
    public String preOrder(TreeNode node) {
        StringBuilder sb = new StringBuilder();
        if (node != null) {
            sb.append(node.data).append(",");
            sb.append(preOrder(node.left));
            sb.append(preOrder(node.right));
        }
        return sb.toString();
    }

    /**
     * 二叉树的中序调用
     *
     * @param node 节点
     * @return 节点值
     */
    public String middleOrder(TreeNode node) {
        StringBuilder sb = new StringBuilder();
        if (node != null) {
            sb.append(middleOrder(node.left));
            sb.append(node.data).append(",");
            sb.append(middleOrder(node.right));
        }
        return sb.toString();
    }

    /**
     * 二叉树的后序节点
     *
     * @param node 节点
     * @return 节点值
     */
    public String postOrder(TreeNode node) {
        StringBuilder sb = new StringBuilder();
        if (node != null) {
            sb.append(postOrder(node.left));
            sb.append(postOrder(node.right));
            sb.append(node.data).append(",");
        }
        return sb.toString();
    }

    public String levelOrder(TreeNode node) {
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            sb.append(poll.data).append(",");
            if (poll.left != null) {
                queue.offer(poll.left);
            }
            if (poll.right != null) {
                queue.offer(poll.right);
            }
        }
        return sb.toString();
    }

    private static class Holder {
        private static final BinaryTreeHelper single = new BinaryTreeHelper();
    }

    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }
}
