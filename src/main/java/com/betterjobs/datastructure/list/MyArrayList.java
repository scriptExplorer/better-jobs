package com.betterjobs.datastructure.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * - 排列有序，允许值重复
 * - 查询速度快， 添加删除慢
 * - 初始化需要指定大小，扩容Time complexity: O(n)
 * - 线程不安全
 * - 底层数组实现
 */
public class MyArrayList {

    /**
     * Catea List
     *
     * @return
     */
    public static ArrayList create() {
        // 有初始值（注意数组的元素类型需为 int[] 的包装类 String[]）
        String[] numbers = new String[] { "1", "3", "2", "5", "4"};
        ArrayList<String> nums = new ArrayList<>(Arrays.asList(numbers));
        return nums;
    }

    /**
     *  add data to last of the list
     *  Time complexity: O(1)
     * @param value
     * @return
     */
    public void add(String value) {
        ArrayList<String> nums = create();
        nums.add(value);
    }

    /**
     * access list by index
     *  Time complexity: O(1)
     * @param index
     * @return
     */
    public static String get(int index) {
        List<String> nums = create();
        return nums.get(index);
    }


    /**
     *  delete data from list by index
     *  Time complexity: O(n)
     * @param index
     * @return
     */
    public static String delete(int index) {
        ArrayList<String> nums = create();
        return nums.remove(index);
    }

    /**
     * Add data to any position of the list
     * Time complexity O(n)
     * @param index
     * @param value
     * @return
     */
    public static String insert(int index, String value) {
        ArrayList<String> nums = create();
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
    public static List mergeList(List<String> list1, List<String> list2) {
        List<String> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);
        return list;
    }

    public static void main (String [] args) {
        List<String> nums = create();
        System.out.println(nums);
        System.out.println(get(2));
        System.out.println(delete(2));
        System.out.println(insert(2, "10"));
        List<String> nums2 = create();
        System.out.println(mergeList(nums, nums2));
    }
}
