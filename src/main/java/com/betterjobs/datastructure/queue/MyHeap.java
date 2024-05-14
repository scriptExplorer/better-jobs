package com.betterjobs.datastructure.queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * PriorityQueue
 * 底层数组实现
 * 初始化时可以指定容量大小
 *
 * 最大堆：父节点比2个子节点大
 *
 * 最小堆： 父节点比2个子节点小 (默认)
 */
public class MyHeap {

    public static PriorityQueue<String> create() {
        // 定义比较器，根据用户ID进行排序
        Comparator<String> userComparator = new Comparator<String>() {
            @Override
            public int compare(String u1, String u2) {
                return Integer.compare(Integer.valueOf(u1), Integer.valueOf(u2));
            }
        };
        PriorityQueue<String> nums = new PriorityQueue<String>(userComparator);//默认最小堆
//        PriorityQueue<String> nums = new PriorityQueue<>(Collections.reverseOrder());//最大堆
        nums.add("4");
        nums.add("1");
        nums.add("2");
        nums.add("3");
        nums.add("5");
        return nums;
    }

    /**
     * 插入元素时需要heapify, 所以时间复杂度为O(log N)
     *
     * @param value
     */
    public static void offer(String value) {
        PriorityQueue<String> nums = create();
        nums.offer(value);
    }

    /**
     * Time complexity: O(1)
     */
    public static String poll() {
        PriorityQueue<String> nums = create();
        return nums.poll();
    }

    public static void main(String[] args) {
        System.out.println("Heap");
        System.out.println(create().peek());
    }
}
