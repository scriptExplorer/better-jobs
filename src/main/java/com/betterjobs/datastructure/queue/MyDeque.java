package com.betterjobs.datastructure.queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 双向队列（double-ended queue）
 * - 两端都可以进出的队列
 * - 基于linkedlist实现  无界队列
 *  *    - 由于需要存储指针，所以空间复杂度会高一些。
 *  *    - 排列有序，允许值重复
 *  *    - 查询速度慢， 添加删除快
 *  *    - 初始化不需要指定大小，无扩容代价
 *  *    - 线程不安全
 *  *    - 底层双向链表实现
 *
 */
public class MyDeque {
    /**
     * create Deque
     * @return
     */
    public Deque<String> create() {
        Deque<String> nums = new LinkedList<String>();
        nums.add("1");
        nums.add("3");
        nums.add("2");
        nums.add("5");
        nums.add("4");
        return nums;
    }

    /**
     * add data to first of the Deque
     * Time complexity: O(1)
     * @param value
     */
    public void addFirst(String value) {
        Deque<String> nums = create();
        nums.addFirst(value);
//        nums.offerFirst(value) //not throw exception
    }

    /**
     * add data to last of the Deque
     * Time complexity: O(1)
     * @param value
     */
    public void addLast(String value) {
        Deque<String> nums = create();
        nums.addLast(value);
//        nums.offerLast(value); //not throw exception
    }

    /**
     * pull data from first of the Deque
     * Time complexity: O(1)
     */
    public void pollFirst() {
        Deque<String> nums = create();
        nums.pollFirst();
    }

    /**
     * pull data from last of the Deque
     * Time complexity: O(1)
     */
    public void pollLast() {
        Deque<String> nums = create();
        nums.pollLast();
    }

    public void test() {
        Deque<String> nums = create();
        System.out.println(nums);
    }

}
