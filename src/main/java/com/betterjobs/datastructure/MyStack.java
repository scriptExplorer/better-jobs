package com.betterjobs.datastructure;

import java.util.Stack;

/**
 * 后进先出
 */
public class MyStack {

    public Stack<Integer> create() {
        Stack<Integer> nums = new Stack<>();
        nums.push(1);
        nums.push(3);
        nums.push(2);
        nums.push(5);
        nums.push(4);
        return nums;
    }

    /**
     * push data to stack at top
     * Time complexity: O(1)
     * @param value
     */
    public void push(int value) {
        Stack<Integer> nums = create();
        nums.push(value);
    }

    /**
     * add data to stack end
     * Time complexity: O(1)
     * @param value
     */
    public void add(int value) {
        Stack<Integer> nums = create();
        nums.add(value);
    }

    /**
     * pop data from stack
     * Time complexity: O(1)
     * @return
     */
    public int pop() {
        Stack<Integer> nums = create();
        return nums.pop();
    }

    /**
     * access data from stack top
     * Time complexity: O(1)
     * @return
     */
    public int peek() {
        Stack<Integer> nums = create();
        return nums.peek();
    }

    
}
