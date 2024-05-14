package com.betterjobs.datastructure.map;

import java.util.TreeMap;

/**
 * 基于红黑树实现的，红黑树是一种自平衡的二叉搜索树。红黑树的插入、删除和查找操作的时间复杂度都为 O(log n)。
 *
 * - key有序
 * - 时间复杂度 O(log N): put lowerKey, higerKey, fooorKey, ceilingKey
 *
 */
public class MyTreeMap {

    public TreeMap create() {
        TreeMap<String, String> result = new TreeMap<String, String>();
        result.put("1", "1");
        result.put("3", "3");
        result.put("5", "5");
        result.put("7", "7");
        result.put("9", "9");
        return result;
    }

    /**
     * Time Complexity O(log N)
     */
    public void put(String key, String value) {
        TreeMap<String, String> map = create();
        map.put(key, value);
    }

    /**
     * Time Complexity O(log N)
     */
    public void lowerKey(String key) {
        TreeMap<String, String> map = create();
        map.lowerKey(key);
    }
}
