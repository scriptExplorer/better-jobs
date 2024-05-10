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
