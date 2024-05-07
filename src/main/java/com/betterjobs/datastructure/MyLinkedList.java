package com.betterjobs.datastructure;

import java.util.LinkedList;

/**
 *  LinkedList相比Arraylist的优势在于插入和删除操作的时间复杂度为O(1)
 *  由于需要存储指针，所以空间复杂度会高一些。
 *  初始化不需要指定大小，无扩容代价
 *  Get data by index Time complexity: O(n)
 */
public class MyLinkedList {

    /**
     * create List
     *
     * @return
     */
    public LinkedList<Integer> create() {
        LinkedList<Integer> nums = new LinkedList<Integer>();
        nums.add(1);
        nums.add(3);
        nums.add(2);
        nums.add(5);
        nums.add(4);
        return nums;
    }

    /**
     * add data to list
     * You can add to first or last
     * Time complexity: O(1)
     * @param value
     */
    public void add(int value) {
        LinkedList<Integer> nums = create();
        nums.addLast(value);
    }


    /**
     * get data from list by index
     * Time complexity: O(n)
     * @param index
     * @return
     */
    public int get(int index) {
        LinkedList<Integer> nums = create();
        return nums.get(index);
    }

    /**
     * delete data from list by index
     * Time complexity: O(1)
     * @param index
     */
    public void delete(int index) {
        LinkedList<Integer> nums = create();
        nums.remove(index);
    }

    public static void main(String[] args) {

    }
}
