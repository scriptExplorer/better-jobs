package com.betterjobs.datastructure.list;

import java.util.Vector;

/**
 * Vector更接近ArrayList，但是是线程安全的
 *  - 特性和ArrayList一样
 *  - 线程安全
 */
public class MyVector {

    public Vector create() {
        Vector<Integer> nums = new Vector<>();
        nums.add(1);
        nums.add(3);
        nums.add(2);
        nums.add(5);
        nums.add(4);
        return nums;
    }

    public int get() {
        Vector<Integer> nums = create();
        return nums.get(0);
    }

}
