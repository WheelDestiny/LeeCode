package com.wheelDestiny.Dailylearn;

import java.util.Arrays;

/*
*给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
*
* 必须在原数组上操作，不能拷贝额外的数组。
* 尽量减少操作次数。
* */
public class re090901 {
    public static void main(String[] args) {
        moveZeroes(new int[]{0,0,3,12});

    }
    public static void moveZeroes(int[] nums) {
        if(nums==null){
            return;
        }
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[n++] = nums[i];
            }
        }
        for (int i = n; i < nums.length; i++) {
            nums[i] = 0;
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
