package com.betterjobs.datastructure.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 双向队列（double-ended queue）(双边数据结构)
 * - 两端都可以进出的队列
 * -  基于ArrayDeque实现  无界队列
      - 基于可变长数组实现。
      - 元素存储在一个连续的内存块中。
     * 优点：
      - 固定空间开销：对于小队列，空间利用率较高，不像 LinkedList 需要更多的额外内存。
     * 缺点：
      -  动态扩容：当队列达到容量上限时，需要扩容数组，这会导致一定的性能开销（但在大多数情况下是摊销 O(1)）。

 * - 基于linkedlist实现  无界队列
 *      - 由于需要存储指针，所以空间复杂度会高一些。
 *      - 排列有序，允许值重复
 *      - 查询速度慢， 添加删除快
 *      - 初始化不需要指定大小，无扩容代价
 *      - 线程不安全
 *      - 底层双向链表实现
 *
 */
public class MyDeque {
    /**
     * create Deque
     * @return
     */
    public Deque<String> create() {
        Deque<String> nums = new ArrayDeque<String>();
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
    public void offerFirst(String value) {
        Deque<String> nums = create();
        nums.offerFirst(value); //not throw exception
//        nums.addFirst(value); // throw exception(list method)
    }

    /**
     * add data to last of the Deque
     * Time complexity: O(1)
     * @param value
     */
    public void offerLast(String value) {
        Deque<String> nums = create();
        nums.offerLast(value); //not throw exception
//        nums.addLast(value); // throw exception(list method)
    }

    /**
     * pull data from first of the Deque
     * Time complexity: O(1)
     */
    public void pollFirst() {
        Deque<String> nums = create();
        nums.pollFirst();
//        nums.removeFirst(); // throw exception(list method)
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
