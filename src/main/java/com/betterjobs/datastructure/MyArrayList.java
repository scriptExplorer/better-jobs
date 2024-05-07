package com.betterjobs.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 初始化需要指定大小，扩容Time complexity: O(n)
 */
public class MyArrayList {

    /**
     * Catea List
     *
     * @return
     */
    public static ArrayList create() {
        // 有初始值（注意数组的元素类型需为 int[] 的包装类 Integer[]）
        Integer[] numbers = new Integer[] { 1, 3, 2, 5, 4 };
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
        return nums;
    }

    /**
     *  add data to last of the list
     *  Time complexity: O(1)
     * @param value
     * @return
     */
    public void add(int value) {
        ArrayList<Integer> nums = create();
        nums.add(value);
    }

    /**
     * access list by index
     *  Time complexity: O(1)
     * @param index
     * @return
     */
    public static Integer get(int index) {
        List<Integer> nums = create();
        return nums.get(index);
    }
    

    /**
     *  delete data from list by index
     *  Time complexity: O(n)
     * @param index
     * @return
     */
    public static int delete(int index) {
        ArrayList<Integer> nums = create();
        return nums.remove(index);
    }

    /**
     * Add data to any position of the list
     * Time complexity O(n)
     * @param index
     * @param value
     * @return
     */
    public static int insert(int index, int value) {
        ArrayList<Integer> nums = create();
        nums.add(index, value);
        return value;
    }


    /**
     *  merge two list
     *  Time complexity: O(n)
     * @param list1
     * @param list2
     * @return
     */
    public static List mergeList(List<Integer> list1, List<Integer> list2) {
        List<Integer> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);
        return list;
    }

    public static void main (String [] args) {
        List<Integer> nums = create();
        System.out.println(nums);
        System.out.println(get(2));
        System.out.println(delete(2));
        System.out.println(insert(2, 10));
        List<Integer> nums2 = create();
        System.out.println(mergeList(nums, nums2));
    }
}
