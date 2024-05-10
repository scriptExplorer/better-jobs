package com.betterjobs.datastructure.map;

import java.util.Hashtable;

/**
 * Hashtable
 *
 *  - key和value都不允许为null
 *  - 不允许key重复
 *  - 无序
 *  - 初始化需要指定大小，每次容量增加 2倍，扩容Time complexity: O(n)
 *  - 线程安全
 *
 *
 * 当哈希冲突比较严重时，哈希表的时间复杂度会退化至 O(n)
 *  当哈希函数设计得比较好、容量设置比较合理、冲突比较平均时，时间复杂度是 O(1)
 *  我们使用编程语言内置的哈希表时，通常认为时间复杂度是O(1)
 *
 *  相关Hash算法：
 *  - MD5 和 SHA-1 已多次被成功攻击，因此它们被各类安全应用弃用。
 *  - SHA-2 系列中的 SHA-256 是最安全的哈希算法之一，仍未出现成功的攻击案例，因此常用在各类安全应用与协议中。
 *  - SHA-3 相较 SHA-2 的实现开销更低、计算效率更高，但目前使用覆盖度不如 SHA-2 系列。
 *
 *
 */
public class MyHashtable {

    /** create Hashtable
     *
     * @return
     */
    public Hashtable<String, String> create() {
        Hashtable<String, String> data = new Hashtable<String, String>();
        data.put("1", "1");
        data.put("3", "3");
        data.put("2", "2");
        data.put("5", "5");
        data.put("4", "4");
        return data;
    }

}
