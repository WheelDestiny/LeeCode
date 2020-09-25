package com.wheelDestiny.Dailylearn;

import java.util.HashSet;
import java.util.Set;

/*
给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

说明：

你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
* */
public class re091103 {
    public static void main(String[] args) {
        singleNumber(new int[]{1,2,1,2,4});
    }
    public static int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        shellSort(nums);
        for (int i = 1; i < nums.length-1; i++) {
            if(nums[0]!=nums[1]){
                return nums[0];
            }else if(nums[i]!=nums[i-1]&&nums[i]!=nums[i+1]){
                return nums[i];
            }else if(nums[nums.length-1]!=nums[nums.length-2]){
                return nums[nums.length-1];
            }
        }
        return 0;
    }
    public static void shellSort(int[] target){
        int h = 1;
        while (h<target.length/3){
            h = h*3 + 1;
        }
        int inner = 0,outer = 0;
        int temp = 0;
        while (h>0){
            for (outer = h;outer <target.length; outer++){
                temp = target[outer];
                inner = outer;
                while (inner >h-1&&target[inner-h]>=temp){
                    target[inner] = target[inner-h];
                    inner-=h;
                }
                target[inner]=temp;
            }
            h = (h-1)/3;
        }
    }
}
