package com.betterjobs.datastructure.list;

import java.util.Vector;

/**
 * Vector更接近ArrayList，但是是线程安全的
 *  - 特性和ArrayList一样
 *      - 排列有序，允许值重复
 *      - 查询速度快， 插入删除慢
 *      - 初始化需要指定大小，扩容Time complexity: O(n)
 *      - 底层数组实现
 *  - 线程安全
 */
public class MyVector {

    public static Vector create() {
        Vector<String> nums = new Vector<String>();
        nums.add("1");
        nums.add("3");
        nums.add("2");
        nums.add("5");
        nums.add("4");
        return nums;
    }

    public String get() {
        Vector<String> nums = create();
        return nums.get(0);
    }

    public static void main(String[] args) {
        MyVector myVector = new MyVector();
        System.out.println(myVector.get());
    }
}
