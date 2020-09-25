package com.wheelDestiny.Dailylearn;

import java.util.*;

/*
给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
* */
public class re091002 {
    public static void main(String[] args) {
    }
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int count = 0;
        for(int start = 0; count < nums.length; start++){
            int current = start;
            int prev = nums[start];
            do{
                int next = (current + k)%nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            }while (start != current);
        }
    }

}
