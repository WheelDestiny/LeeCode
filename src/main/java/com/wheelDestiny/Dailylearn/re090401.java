package com.wheelDestiny.Dailylearn;

/*
*给定一个二进制数组， 计算其中最大连续1的个数。
* */
public class re090401 {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{0,0,0,1,1}));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {

        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                // Increment the count of 1's by one.
                count += 1;
            } else {
                // Find the maximum till now.
                sum = Math.max(sum, count);
                // Reset count of 1.
                count = 0;
            }
        }
        Object o;
        o=(Object) null;
        return sum>count?sum:count;
    }

}
