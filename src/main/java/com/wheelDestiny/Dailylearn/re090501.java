package com.wheelDestiny.Dailylearn;
/*
*给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的 连续 子数组，并返回其长度。如果不存在符合条件的子数组，返回 0。

* */
public class re090501 {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen1(4,new int[]{2,1,1,2,2,1}));

    }
    public static int minSubArrayLen(int s, int[] nums) {
        /*
        * 通过局部极值比较获得全局极值
        * 双指针
        * 第一个指针确定子数组开头
        * 第二个指针确定子数组结尾
        * */
        int res = nums.length;
        int curr = 0;
        int sum = 0;
        int currsum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            for (int j = i; j < nums.length; j++) {
                currsum += nums[j];
                if (currsum>=s){
                    curr = j-i+1;
                    break;
                }
            }
            currsum = 0;
            res = res>curr?curr:res;
        }
        if (sum<s){
            return 0;
        }
        return res ;
    }

    public static int minSubArrayLen1(int s ,int[] nums){
        //指向队列顶部，即后进入队列的数据
        int top = 0;
        //指向队列底部，即先进入队列的数据
        int low = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while (low<nums.length){
            sum+=nums[low++];
            while (sum>=s){
                min = min>(low-top)?(low-top):min;
                sum-=nums[top++];
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}
