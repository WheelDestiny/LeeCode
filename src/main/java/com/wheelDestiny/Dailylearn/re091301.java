package com.wheelDestiny.Dailylearn;

import java.util.HashMap;
import java.util.Map;

/*
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
* */
public class re091301 {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        /**
         * 寻找目标数据,用hashmap
         *
         * 将值为k，下标为v，存入hashmap，每次存入数据之前进行判断，看hashmap中是否存在可以和当前要插入的数据求和等于target的数据
         *
         * 遍历一次的原因是加法交换律，a+b=b+a
         */
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int tar = target-nums[i];
            if(map.containsKey(tar)){
                return new int[]{map.get(tar),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
