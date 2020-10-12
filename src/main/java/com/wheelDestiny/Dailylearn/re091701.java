package com.wheelDestiny.Dailylearn;

import java.util.HashMap;
import java.util.Map;

/*
给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。

s = "leetcode"
返回 0

s = "loveleetcode"
返回 2
* */
public class re091701 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabbccd"));

    }
    public static int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap();
        if (s.equals("")||s == null){
            return -1;
        }
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            map.put(s.charAt(i), map.getOrDefault(curr, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
