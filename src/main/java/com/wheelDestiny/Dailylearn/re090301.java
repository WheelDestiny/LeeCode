package com.wheelDestiny.Dailylearn;

import java.util.Arrays;

/*
* 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。

函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。

说明:
返回的下标值（index1 和 index2）不是从零开始的。
你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。

* */
public class re090301 {
    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2, 6, 11, 16, 20}, 8);
        System.out.println(ints[0]+"!"+ints[1]);

    }
    /*
    * 二分法
    * */
    public static int[] twoSum(int[] numbers, int target) {
        /*
        *有序数据，先考虑二分法，left=0，right=length-1，mid=(left+right)>>1
        * 且只有唯一答案
        * 固定一个值，对其他值进行遍历，直到找到答案。
        * 和
        *  */
        for (int i = 0; i <numbers.length ; i++) {
            int left=i+1,right=numbers.length-1;
            while (left<=right){
                int mid = (right-left)/2+left;
                if(numbers[i]+numbers[mid]==target){
                    return new int[]{i+1,mid+1};
                }else if(numbers[i]+numbers[mid]<target){
                    left=mid+1;
                }else if(numbers[i]+numbers[mid]>target){
                    right=mid-1;
                }
            }
        }
        return new int[]{};
    }

    //双指针法
    public static int[] twoSum1(int[] numbers, int target) {
        int left=0,right=numbers.length-1;
        while (left<right){
            if(numbers[left]+numbers[right]==target){
                return new int[]{left+1,right+1};
            }else if(numbers[left]+numbers[right]<target){
                left++;
            }else if(numbers[left]+numbers[right]>target){
                right--;
            }
        }
        return new int[]{};
    }
}
