package com.betterjobs.datastructure.set;

import java.util.HashSet;
import java.util.Set;

/**
 * 基于HashMap实现
 *  set 和 get 都是O(1)
 *
 * - 不允许重复元素
 * - 允许null
 * - 无序
 * - 用Tree map实现，只不过没有存value
 *
 *
 */
public class MyHashSet {

    public static Set<String> create() {
        HashSet<String> result = new HashSet<String>();
        result.add("1");
        result.add("3");
        result.add("5");
        result.add("7");
        result.add("9");
        return  result;
    }

    /**
     *  Time Complexity O(1)
     * @param value
     */
    public static void put(String value) {
        Set<String> set = create();
        set.add(value);
    }

    /**
     * Time Complexity O(1)
     * @param value
     */
    public boolean contains(String value) {
        Set<String> set = create();
        return set.contains(value);
    }
}
