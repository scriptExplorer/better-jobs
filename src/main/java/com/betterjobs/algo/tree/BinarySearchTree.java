package com.betterjobs.algo.tree;

public class BinarySearchTree {

    public static TreeNode search_recursion(TreeNode node, int value) {
        if (node == null) {
            return null;
        }
        if (value == node.value) {
            return node;
        }
        if (value < node.value ) {
            return search_recursion(node.left, value);
        } else if (value > node.value) {
            return search_recursion(node.right, value);
        }
        return null;
    }

    /**
     * 二叉搜索树（binary search tree）满足以下条件。
     *
     * 1. 对于根节点，左子树中所有节点的值 < 根节点的值 < 右子树中所有节点的值。
     * 2. 任意节点的左、右子树也是二叉搜索树，即同样满足条件
     *
     * Time complexity O(log N)
     * Space complexity
     */
    public static TreeNode search(TreeNode node, int value) {
        TreeNode targetNode = node;
        while(targetNode != null) {
            if (value < targetNode.value ) {
                targetNode = targetNode.left;
            } else if (value > targetNode.value) {
                targetNode = targetNode.right;
            } else {
                break;
            }
        }
        return targetNode;
    }

    /**
     * 给定一个待插入元素 num ，为了保持二叉搜索树“左子树 < 根节点 < 右子树”的性质
     *
     * 查找插入位置：与查找操作相似，从根节点出发，根据当前节点值和 num 的大小关系循环向下搜索，直到越过叶节点（遍历至 None ）时跳出循环。
     * 在该位置插入节点：初始化节点 num ，将该节点置于 None 的位置。
     *
     */
    public static void insert(TreeNode node, int value) {
        TreeNode parentNode = null;
        TreeNode targetNode = node;
        while (targetNode != null) {
            if (value < targetNode.value) {
                parentNode = targetNode;
                targetNode = targetNode.left;
            } else if (value > targetNode.value) {
                parentNode = targetNode;
                targetNode = targetNode.right;
            } else {
                throw new IllegalArgumentException("already have the value " + value + " in the tree");
            }
        }

        targetNode = new TreeNode(value);
        if (value < parentNode.value) {
            parentNode.left = targetNode;
        } else if (value > parentNode.value) {
            parentNode.right = targetNode;
        }
    }

    public static TreeNode remove(TreeNode node, int value) {
        if (node == null) {
            return null;
        }
        if (value < node.value) {
            node.left = remove(node.left, value);
        } else if (value > node.value) {
            node.right = remove(node.right, value);
        } else {
            if (node.left == null) {
                node = node.right;
            } else if (node.right == null) {
                node = node.left;
            } else {
                TreeNode deleteNode = node.right;
                while(deleteNode.left != null) {
                    deleteNode = deleteNode.left;
                }
                node.value = deleteNode.value;
                node.right = remove(deleteNode, deleteNode.value);
            }
        }
        return node;
    }

    public static void main (String [] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(4);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(14);

        System.out.println(search_recursion(root,7));

        System.out.println(search(root, 7));

//        insert(root, 0);
//        System.out.println(TreeNode.binarySearchBFS(root));



        remove(root, 14);
        System.out.println(BfsAndDfs.binarySearchBFS(root));
    }

}
