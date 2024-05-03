package com.betterjobs.algo.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {

    public int value = 0;
    public TreeNode left = null;
    public TreeNode right = null;

    public TreeNode(int value) {
        this.value = value;
    }

    /**
     * Time complexity O(n)
     * Space complexity O(n)
     * depth-first traversal
     *
     */

    public static void binarySearchDFS(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.value);
        binarySearchDFS(root.left, result);
        binarySearchDFS(root.right, result);
    }

    /**
     *
     * Time complexity  O(n)
     * Space complexity O(n)
     * breadth-first traversal
     */
    public static List<Integer> binarySearchBFS(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(queue.isEmpty() == false) {
            TreeNode node = queue.poll();
            result.add(node.value);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return result;
    }



    public static void main (String [] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);


        List<Integer> result = new ArrayList<Integer>();
        binarySearchDFS(root, result);
        System.out.println(result);

        System.out.println(binarySearchBFS(root));
    }

}
