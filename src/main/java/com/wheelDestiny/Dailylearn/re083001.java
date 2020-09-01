package com.wheelDestiny.Dailylearn;

import java.util.Arrays;

public class re083001 {
    public static void main(String[] args) {
        removeDuplicates(new int[]{});
    }

    /*
    *   给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
        不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
    * */
    public static int removeDuplicates(int[] nums) {
        //判断前一个元素和后一个元素是否相等，如果相等则用后面的元素把前面的元素覆盖
        //判断当前元素和最后一个元素是否相等，相等则返回当前的长度
        if (nums == null||nums.length==0) {
            return 0;
        }else {
            int i = 0;
            for (; i < nums.length-1; ) {
                if(nums[i]!=nums[nums.length-1]){
                    if (nums[i]==nums[i+1]){
                        for (int j = i; j < nums.length-1 ; j++) {
                            nums[j]=nums[j+1];
                        }
                    }else {
                        i++;
                    }
                }else {
                    break;
                }
            }
            return i+1;
        }
    }
}
