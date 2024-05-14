package com.betterjobs.datastructure.tree;

/**
 * 又称 prefix tree，是一种有序树，用于保存关联数组，其中的键通常是字符串。
 */
public class TreeNode {
    public int val = 0;
    public TreeNode left = null;
    public TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
