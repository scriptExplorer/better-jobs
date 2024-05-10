package com.betterjobs.datastructure.list;

import java.util.LinkedList;

/**
 *  LinkedList相比Arraylist的优势在于插入和删除操作的时间复杂度为O(1)
 *  由于需要存储指针，所以空间复杂度会高一些。
 *  - 排列有序，允许值重复
 *  - 查询速度慢， 添加删除快
 *  - 初始化不需要指定大小，无扩容代价
 *  - 线程不安全
 *  - 底层双向链表实现
 */
public class MyLinkedList {

    /**
     * create List
     *
     * @return
     */
    public static LinkedList<String> create() {
        LinkedList<String> nums = new LinkedList<String>();
        nums.add("1");
        nums.add("3");
        nums.add("2");
        nums.add("5");
        nums.add("4");
        return nums;
    }

    /**
     * add data to list
     * You can add to first or last
     * Time complexity: O(1)
     * @param value
     */
    public static void add(String value) {
        LinkedList<String> nums = create();
        nums.addLast(value);
    }


    /**
     * get data from list by index
     * Time complexity: O(n)
     * @param index
     * @return
     */
    public static String get(int index) {
        LinkedList<String> nums = create();
        return nums.get(index);
    }

    /**
     * delete data from list by index
     * Time complexity: O(1)
     * @param item
     */
    public static void delete(String item) {
        LinkedList<String> nums = create();
        nums.remove(item);
    }

    public static void main(String[] args) {

    }
}
