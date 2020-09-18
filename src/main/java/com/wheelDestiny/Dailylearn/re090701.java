package com.wheelDestiny.Dailylearn;

import java.util.ArrayList;
import java.util.List;

/*
*给定一个非负整数 numRows，生成杨辉三角的第 numRows 行。
* */
public class re090701 {
    public static void main(String[] args) {
        getRow(3).forEach(System.out::print);

    }

    public static List<Integer> getRow(int rowIndex) {
        rowIndex++;
        List<Integer> pre = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        for (int i = 0; i < rowIndex; i++) {
            cur = new ArrayList<>();
            for (int j = 0; j <= i ; j++) {
                //当j等于0或者j等于i，即每行的第一位和最后一位
                if (j==0 || j == i){
                    cur.add(1);
                }else {
                    cur.add(pre.get(j-1)+pre.get(j));
                }
            }
            pre = cur;
        }
        return cur;
    }
}
