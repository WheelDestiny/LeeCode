package com.wheelDestiny.Dailylearn;


public class re083101 {

    public static void main(String[] args) {
        re083101 re083101 = new re083101();
        System.out.println(re083101.reverseWords(" aaa  bbb ccc "));

    }

    public String reverseWords(String s) {
        s=s.trim();
        String[] s1 = s.split("\\s+");
        for (int i = 0; i < s1.length/2; i++) {
            String tmp = s1[i];
            s1[i] = s1[s1.length-1-i];
            s1[s1.length-1-i] = tmp;
        }
        String res = String.join(" ",s1);
        return res;


    }
}
