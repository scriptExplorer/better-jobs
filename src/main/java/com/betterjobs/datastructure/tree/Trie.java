package com.betterjobs.datastructure.tree;

import java.util.List;

/**
 * 又称 prefix tree，是一种有序树，用于保存关联数组，其中的键通常是字符串。
 */
public class Trie {

    /**
     * Time complexity: O(word.length()
     */
    public void addWord(String word) {

    }

    /**
     * Time complexity:  O(word.length()
     */
    public TrieNode searchWord(String word) {
        return null;
    }


    /**
     * Time complexity:  O(word.length()
     */
    public List<TrieNode> searchPrefix(String prefix) {
        return null;
    }

    public class TrieNode {
        public char val;
        public TrieNode[] children = new TrieNode[26];
        public boolean isWord;
        public TrieNode() {}
        public TrieNode(char c) {
            TrieNode node = new TrieNode();
            node.val = c;
        }
    }

}
