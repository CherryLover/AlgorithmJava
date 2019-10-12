package com.monster.algorithm.structure;

public class MyLinkedList {
    private Node head;
    private Node last;
    public int size;

    /**
     * 插入新的元素
     * 头部插入，头部插入时，当 size 为 0 时进行的，插入的节点既是 head 同时也是 last；
     * 尾部插入，尾部插入时，下标为 size - 1，插入后需要设置 前一节点的 next 为当前节点，且当前节点为 last；
     * 中间插入，中间插入时，需要将下一节点设置为当前的 next，并把前一个节点的 next 设为当前节点；
     *
     * 时间复杂度：在不考虑遍历现有元素的情况下，为 1
     * 空间复杂度：n
     * @param index 下标
     * @param data 数据
     */
    public void insert(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出链表长度");
        }
        Node insertNode = new Node(data);
        if (size == 0) {
            last = head = insertNode;
        } else if (index == 0) {
            insertNode.next = head;
            head = insertNode;
        } else if (index == size) {
            last.next = insertNode;
            last = insertNode;
        } else {
            Node preNode = get(index - 1);
            insertNode.next = preNode.next;
            preNode.next = insertNode;
        }
        size++;
    }

    /**
     * 删除头部，删除 head 后，head 的下一节点为 head；
     * 删除尾部，删除 last 后，需要将上一节点的 next 节点设为 last；
     * 删除中部，删除中部时，需要将上一节点的 next 节点设置为 当前节点的 next；
     * 时间复杂度：1
     * 空间复杂度：n
     * @param index 待删除节点下标
     * @return 删除的节点
     */
    public Node remove(int index) {
        Node removeNode = null;
        if (index == 0) {
            removeNode = head;
            head = head.next;
        } else if (index == size - 1) {
            Node preNode = get(index - 1);
            removeNode = preNode.next;
            preNode.next = null;
            last = preNode;
        } else {
            Node removePreNode = get(index - 1);
            removeNode = removePreNode.next;
            removePreNode.next = removeNode.next;
        }
        size--;
        return removeNode;
    }

    /**
     * 获取某一节点
     * 利用 head 的 next 不断找到下一节点。循环的次数限制为找寻的次数
     * @param position 节点值
     * @return 当前节点
     */
    private Node get(int position) {
        Node temp = head;
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        return temp;
    }

    /**
     * 遍历链表
     * 时间复杂度：n
     */
    public void output() {
        System.out.println("LinkList Is: " + toString());
    }

    @Override
    public String toString() {
        Node temp = head;
        StringBuilder sb = new StringBuilder();
        while (temp != null) {
            sb.append(temp.data);
            if (temp.next != null) {
                sb.append(",");
            }
            temp = temp.next;
        }
        return sb.toString();
    }

    private static class Node {
        private Node next;
        private int data;

        Node(int data) {
            this.data = data;
        }
    }
}
