package com.wheelDestiny.Dailylearn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

你可以假设除了整数 0 之外，这个整数不会以零开头。

* */
public class re091202 {
    public static void main(String[] args) {

    }
    public int[] plusOne(int[] digits) {
        /**
         *
         * 从最后一位开始+1
         * 如果+1的结果不等于10，直接返回当前数组
         * 如果+1的结果等于10，下一位继续+1并进行判断
         *
         * 如果循环结束全部+1
         * 则需要加一位
         *
         */
        for (int i = digits.length-1; i >=0; i--) {
            digits[i]++;
            digits[i] = digits[i]%10;
            if(digits[i]!=0){
                return digits;
            }
        }
        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;

    }
}
