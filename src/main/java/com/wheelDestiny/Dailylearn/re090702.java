package com.wheelDestiny.Dailylearn;

import java.util.ArrayList;
import java.util.List;

/*
*给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
* 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
* */
public class re090702 {
    public static void main(String[] args) {
        String s = reverseWords("Let's take LeetCode contest");
        System.out.println(s);
    }

    public static String reverseWords(String s) {
        String[] ss = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (String s1 : ss) {
            s1 = new StringBuilder(s1).reverse().toString();
            res.append(s1).append(" ");
        }
        return res.toString().substring(0,res.length()-1);
    }
}
