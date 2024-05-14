package com.betterjobs.datastructure.tree;

public class BinaryTree {
    public static void main(String[] args) {
        System.out.println("Binary Tree");
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
    }
}
