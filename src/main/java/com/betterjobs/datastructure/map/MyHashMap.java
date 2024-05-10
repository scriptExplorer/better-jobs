package com.betterjobs.datastructure.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 哈希表 当 HashMap 内数组长度达到 64 且链表长度达到 8 时，链表会转换为红黑树以提升查找性能。
 *   - 数组实现: 多个buckets，每个bucket是一个数组，
 *      通过index = hash(key) % capacity来确定key的位置
 *   - 类似于数组扩容，哈希表扩容需将所有键值对从原哈希表迁移至新哈希表，非常耗时
 *  - key和value都不允许为null
 *  - 不允许key重复
 *  - 无序
 *  - 初始化需要指定大小，每次容量增加 2倍，扩容Time complexity: O(n)
 *  - 线程不安全
 *
 */
public class MyHashMap {

    public Map<String,String> create() {
        Map<String,String> data = new HashMap<String,String>(100);
        data.put("1", "1");
        data.put("3", "3");
        data.put("2", "2");
        data.put("5", "5");
        data.put("4", "4");
        return data;
    }

    /**
     * add data to map
     * Time complexity: O(1)
     * @param key
     * @param value
     */
    public void add(String key, String value) {
        Map<String,String> data = create();
        data.put(key, value);
    }

    /** delete data from map by key
     * Time complexity: O(1)
     * @param key
     */
    public void delete(String key) {
        Map<String, String> data = create();
        data.remove(key);
    }

    /**
     * get data from map by key
     * Time complexity: O(1)
     * @param key
     * @return
     */
    public String get(String key) {
        Map<String, String> data = create();
        return data.get(key);
    }



}
