package com.wheelDestiny.Dailylearn;

/*
*假设按照升序排序的数组在预先未知的某个点上进行了旋转。

( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。

请找出其中最小的元素。

你可以假设数组中不存在重复元素。
* */
public class re090801 {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{5,0,1,2,3,4}));
    }
    public static int findMin(int[] nums) {
        //使用二分法，判断条件为当前值大于后一位的值，后一位的数据即为最小值
        int left = 0,right = nums.length-1;

        while (left<right){
            //
            int mid = left+(right-left)/2;
            if(nums[right]<nums[mid]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }
}
