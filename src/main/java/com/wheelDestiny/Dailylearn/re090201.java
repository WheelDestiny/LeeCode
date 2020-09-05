package com.wheelDestiny.Dailylearn;

import java.util.Arrays;
//给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
//1,2,3,4,5,6
public class re090201 {
    public static void main(String[] args) {
        System.out.println(arrayPairSum(new int[]{1,2,3,4,5,6}));
    }
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i%2==0){
                sum += nums[i];
            }
        }
        return sum;
    }
}
