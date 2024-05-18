package com.betterjobs.datastructure.map;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * LinkedHashMap
 *   数组 + 双向链表 实现
 *  - key和value都不允许为null
 *  - 不允许key重复
 *  - 有序
 *  - 初始化需要指定大小，每次容量增加 2倍，扩容Time complexity: O(n)
 *  - 线程不安全
 */
public class MyLinkedHashMap {

    public Map<String,String> create() {
        Map<String,String> data = new LinkedHashMap<String, String>(100);
        data.put("1", "1");
        data.put("3", "3");
        data.put("2", "2");
        data.put("5", "5");
        data.put("4", "4");
        return data;
    }

    public void put(String key, String value) {
        create().put(key, value);
    }
}
