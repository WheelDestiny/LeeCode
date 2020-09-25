package com.wheelDestiny.Dailylearn;

/*
给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
* */
public class re091101 {
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
    public void rotate1(int[] nums, int k) {
        k %= nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums,int start,int end){
        while (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;

        }
    }

}
