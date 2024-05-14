package com.betterjobs.datastructure.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * 后进先出(单边数据结构)
 * - 基于Vector实现
 *      - 特性和ArrayList一样
 *          - 排列有序，允许值重复
 *          - 查询速度快， 添加删除慢
 *          - 初始化需要指定大小，扩容Time complexity: O(n)
 *          - 底层数组实现
 *          - 线程安全
 *
 * - 两种实现栈方式
 * 1. 数组实现(Stack)
 *   - 超出容量扩容 Time complexity: O(n)
 *
 * 2. 链表实现(LinkedList)
 *   - 无需扩容，平均效率更稳定
 */
public class MyStack {

    public static Stack<String> create() {
        Stack<String> nums = new Stack<>();
        nums.push("1");
        nums.push("3");
        nums.push("2");
        nums.push("5");
        nums.push("4");
        return nums;
    }

    /**
     * 甲骨文官方推荐使用Deque代替Stack, 因为实现更加合理
     * @return
     */
    public static Deque<String> createStack() {
        Deque<String> nums = new ArrayDeque<>();
        nums.push("1");
        nums.push("3");
        nums.push("2");
        nums.push("5");
        nums.push("4");
        return nums;
    }

    /**
     * push data to stack at top
     * Time complexity: O(1)
     * @param value
     */
    public static void push(String value) {
        Stack<String> nums = create();
        nums.push(value);
    }

    /**
     * add data to stack end
     * Time complexity: O(1)
     * @param value
     */
    public static void add(String value) {
        Stack<String> nums = create();
        nums.add(value);
    }

    /**
     * pop data from stack
     * Time complexity: O(1)
     * @return
     */
    public static String pop() {
        Stack<String> nums = create();
        return nums.pop();
    }

    /**
     * access data from stack top
     * Time complexity: O(1)
     * @return
     */
    public static String peek() {
        Stack<String> nums = create();
        return nums.peek();
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
    }



}
