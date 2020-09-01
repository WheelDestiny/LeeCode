package com.wheelDestiny.Dailylearn;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

public class re090101 {
    public static void main(String[] args) {
        reverseString(new char[]{'a','b','c','d'});
    }

    public static void reverseString(char[] s) {
        int l=0,r=s.length-1;
        while (l<r){
            char tmp = s[l];
            s[l] = s[r];
            s[r] = tmp;
            l++;
            r--;
        }
    }
}
