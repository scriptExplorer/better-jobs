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
 *
 *   当哈希冲突比较严重时，哈希表的时间复杂度会退化至 O(n)
 *   当哈希函数设计得比较好、容量设置比较合理、冲突比较平均时，时间复杂度是 O(1)
 *   我们使用编程语言内置的哈希表时，通常认为时间复杂度是O(1)
 *
 *   相关Hash算法：
 *   - MD5 和 SHA-1 已多次被成功攻击，因此它们被各类安全应用弃用。
 *   - SHA-2 系列中的 SHA-256 是最安全的哈希算法之一，仍未出现成功的攻击案例，因此常用在各类安全应用与协议中。
 *   - SHA-3 相较 SHA-2 的实现开销更低、计算效率更高，但目前使用覆盖度不如 SHA-2 系列。
 *
 */
public class MyHashMap {

    public HashMap<String,String> create() {
        HashMap<String,String> data = new HashMap<String,String>(100);
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
        HashMap<String,String> data = create();
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
