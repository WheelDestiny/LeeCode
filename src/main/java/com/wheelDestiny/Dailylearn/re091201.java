package com.wheelDestiny.Dailylearn;

import java.util.*;

/*
给定两个数组，编写一个函数来计算它们的交集。
* */
public class re091201 {
    public static void main(String[] args) {
        intersect1(new int[]{4,9,5},new int[]{9,4,9,8,4});

    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return intersect(nums2,nums1);
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num,count);
        }
        int[] intersection = new int[nums1.length];

        int index = 0;
        for (int num : nums2) {
            int count = map.getOrDefault(num,0);
            if(count>0){
                intersection[index++] = num;
                count--;
                if(count>0){
                    map.put(num,count);
                }else {
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOf(intersection,index);
    }
    public static int[] intersect1(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0,j = 0,k = 0;
        while (i<nums1.length&&j<nums2.length){
            if(nums1[i]>nums2[j]){
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else {
                nums1[k++] = nums1[i++];
                j++;
            }
        }
        return Arrays.copyOf(nums1,k);

    }
}
