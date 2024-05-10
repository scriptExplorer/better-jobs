package com.betterjobs.datastructure.set;

import java.util.TreeSet;

/**
 * 和HashSet 类似
 *  - 用Tree map实现，只不过没有存value
 *  - 因为需要在有序数据中找到正确位置，所以插入时的复杂度是O(log N)
 *  - 有序
 */
public class MyTreeSet {
    public TreeSet<String> create() {
        TreeSet<String> result =new TreeSet<String>();
        result.add("1");
        result.add("3");
        result.add("5");
        result.add("7");
        result.add("9");
        return result;
    }

    /**
     * Time Complexity O(log N)
     * 添加时需要先进进行搜索，然后插入对的位置
     * @param value
     */
    public void add(String value) {
        TreeSet<String> set = create();
        set.add(value);
    }

    /**
     * TreeSet 是链表实现，所以不支持根据索引查询
     * @param index
     * @return
     */
    public String get(int index) {
        return null;
    }

    /**
     * Time Complexity O(1)
     * @return
     */
    public String getFirst() {
        TreeSet<String> data = create();
        return data.getFirst();
    }


}
