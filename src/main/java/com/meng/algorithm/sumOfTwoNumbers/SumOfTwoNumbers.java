package com.meng.algorithm.sumOfTwoNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * 两数和
 * 给定一个数组,一个标识,如果数组中随机两个数相加等于这个标识,那么返回这两个数的值
 * 下面是返回的一个集合,可能存在多组数据相加都等于标识
 */
public class SumOfTwoNumbers {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        List<int[]> list = twoSum(nums, 5);
        list.forEach(ints -> System.out.println(Arrays.toString(ints)));

    }

    public static List<int[]>  twoSum(int[] nums, int target) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0;j<nums.length;j++){
                if (nums[i]+nums[j] == target){
                    list.add(new int[] { i, j });
                }
            }
        }
        return list;
    }

}
