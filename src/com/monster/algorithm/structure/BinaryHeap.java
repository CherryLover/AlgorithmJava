package com.monster.algorithm.structure;

public class BinaryHeap {
    public String upAdjust(int[] array) {
        int childIndex = array.length - 1;
        int parentIndex = getParentIndex(array, childIndex);
        while (parentIndex >= 0) {
            if (array[parentIndex] > array[childIndex]) {
                int switchNumber = array[parentIndex];
                array[parentIndex] = array[childIndex];
                array[childIndex] = switchNumber;
                childIndex = parentIndex;
                parentIndex = getParentIndex(array, childIndex);
            }
        }
        return getStringFromArray(array);
    }

    /**
     * 找到当前节点（有子节点）中 两个子节点的最值，后并与之交换。直至堆顶
     * @param array
     * @param parentIndex
     * @param length
     * @return
     */
    public String downAdjust(int[] array, int parentIndex, int length) {
        int temp = array[parentIndex];
        int childIndex = 2 * parentIndex + 1;
        while (childIndex < length) {
            if (childIndex + 1 < length && array[childIndex + 1] < array[childIndex]) {
                childIndex++;
            }
            if (temp <= array[childIndex]) {
                break;
            }
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = 2 * parentIndex + 1;
        }
        array[parentIndex] = temp;
        return getStringFromArray(array);
    }


    /**
     * 从最后一个非叶子节点开始下沉。
     * 下沉是指：堆顶元素从上向下与子节点进行交换；
     *
     * @param array
     * @return
     */
    public String buildHeap(int[] array) {
        // TODO: i = array.length - 2 / 2 是根据整个二叉堆数量计算的
        for (int i = (array.length - 2) / 2; i >= 0; i--) {
            downAdjust(array, i, array.length);
        }
        return getStringFromArray(array);
    }

    /**
     * 小灰算法书中的代码，用于校验是否正确
     *
     * @param array array
     * @return 打印值
     */
    public String adjustRight(int[] array) {
        int childIndex = array.length - 1;
        int parentIndex = (childIndex - 1) / 2;
        int temp = array[childIndex];
        while (childIndex > 0 && temp < array[parentIndex]) {
            array[childIndex] = array[parentIndex];
            childIndex = parentIndex;
            parentIndex = (childIndex - 1) / 2;
        }
        array[childIndex] = temp;
        return getStringFromArray(array);
    }

    private int getParentIndex(int[] array, int childIndex) {
        if (array.length % 2 == 0) {
            return (childIndex - 2) / 2;
        } else {
            return (childIndex - 1) / 2;
        }
    }

    private String getStringFromArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i != array.length - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
