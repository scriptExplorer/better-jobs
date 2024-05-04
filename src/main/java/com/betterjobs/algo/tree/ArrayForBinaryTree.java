package com.betterjobs.algo.tree;

import java.util.*;

/**
 * 要求：
 * - 一棵基于数组表示的二叉树，包括以下几种操作。
 * - 给定某节点，获取它的值、左（右）子节点、父节点。
 * - 获取前序遍历、中序遍历、后序遍历、层序遍历序列。
 *
 *   优点与局限性¶
 * 二叉树的数组表示主要有以下优点。
 *
 * 数组存储在连续的内存空间中，对缓存友好，访问与遍历速度较快。
 * 不需要存储指针，比较节省空间。
 * 允许随机访问节点。
 * 然而，数组表示也存在一些局限性。
 *
 * 数组存储需要连续内存空间，因此不适合存储数据量过大的树。
 * 增删节点需要通过数组插入与删除操作实现，效率较低。
 * 当二叉树中存在大量 None 时，数组中包含的节点数据比重较低，空间利用率较低。
 */
public class ArrayForBinaryTree {
    public List<Integer> tree = new ArrayList<Integer>();

    public int leftValue(int index) {
        return value(leftIndex(index));
    }

    public int rightValue(int index) {
        return value(rightIndex(index));
    }

    public int parentValue(int index) {
        return value(parentIndex(index));
    }

    public List<Integer> getPreOrder() {
        List<Integer> result = new ArrayList<Integer>();
        getPreOrder(0, result);
        return result;
    }
    private void getPreOrder(int index, List<Integer> result) {
        if (index <0 || index >= tree.size()) {
            return;
        }
        // order: left -> parent -> right
        result.add(value(index));
        getPreOrder(leftIndex(index), result);
        getPreOrder(rightIndex(index), result);
    }

    public List<Integer> getInOrder() {
        List<Integer> result = new ArrayList<Integer>();
        getInOrder(0, result);
        return result;
    }

    private void getInOrder(int index, List<Integer> result) {
        if (index <0 || index >= tree.size()) {
            return;
        }
        // order: left -> parent -> right
        getInOrder(leftIndex(index), result);
        result.add(value(index));
        getInOrder(rightIndex(index), result);
    }

    public List<Integer> getPostOrder() {
        List<Integer> result = new ArrayList<Integer>();
        getPostOrder(0, result);
        return result;
    }

    private void getPostOrder(int index, List<Integer> result) {
        if (index >= tree.size()) {
            return;
        }
        // order: left -> right -> parent
        getPostOrder(leftIndex(index), result);
        getPostOrder(rightIndex(index), result);
        result.add(value(index));
    }

    private int leftIndex(int index) {
        return 2 * index + 1;
    }

    private int rightIndex(int index) {
        return 2 * index + 2;
    }

    private int parentIndex(int index) {
        return index/2;
    }

    private int value(int index) {
        if (index <0 || index >= tree.size()) {
            throw new IllegalArgumentException("out of index");
        }
        return tree.get(index);
    }

    public static void main (String [] args) {
        ArrayForBinaryTree tree = new ArrayForBinaryTree();
        tree.tree.add(1);
        tree.tree.add(2);
        tree.tree.add(3);
        tree.tree.add(4);
        tree.tree.add(5);
        tree.tree.add(6);
        tree.tree.add(7);

        System.out.println(tree.getPreOrder());
        System.out.println(tree.getInOrder());
        System.out.println(tree.getPostOrder());
    }

}
