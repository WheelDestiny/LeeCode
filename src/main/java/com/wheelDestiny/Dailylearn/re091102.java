package com.wheelDestiny.Dailylearn;

import java.util.HashSet;
import java.util.Set;

/*
给定一个整数数组，判断是否存在重复元素。

如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
* */
public class re091102 {
    public static void main(String[] args) {
    }
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int a : nums) {
            if(!set.add(a)){
                return true;
            }
        }
        return false;
    }
}
