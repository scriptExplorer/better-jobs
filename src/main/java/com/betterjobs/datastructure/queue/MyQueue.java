package com.betterjobs.datastructure.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue(单边数据结构)
 * - 基于linkedlist实现 无界队列
 *    - 由于需要存储指针，所以空间复杂度会高一些。
 *    - 排列有序，允许值重复
 *    - 查询速度慢， 添加删除快
 *    - 初始化不需要指定大小，无扩容代价
 *    - 线程不安全
 *    - 底层双向链表实现
 */
public class MyQueue {
    public static Queue create() {
        Queue<String> nums = new LinkedList<String>();
        nums.add("1");
        nums.add("3");
        nums.add("2");
        nums.add("5");
        nums.add("4");
        return nums;
    }

    /**
     * add data to queue
     * Time complexity: O(1)
     * @param value
     */
    public static void offer(String value) {
        Queue<String> nums = create();
        nums.offer(value);
    }

    /**
     * pull data from queue
     * Time complexity: O(1)
     * @return
     */
    public static String poll() {
        Queue<String> nums = create();
        return nums.poll();
    }

    /**
     * get data from queue
     * Time complexity: O(1)
     * @return
     */
    public static String peek() {
        Queue<String> nums = create();
        return nums.peek();
    }


}
