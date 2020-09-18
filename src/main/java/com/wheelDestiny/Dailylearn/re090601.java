package com.wheelDestiny.Dailylearn;

import java.util.ArrayList;
import java.util.List;

/*
*给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
* */
public class re090601 {
    public static void main(String[] args) {
        generate(5);

    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows==0){
            return res;
        }
        //对res进行初始化，第一行，1
        res.add(new ArrayList<>());
        res.get(0).add(1);

        //根据行数进行循环
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            //获取上一行数据
            List<Integer> prevRow = res.get(i-1);
            //给当前行数据的第一位赋值
            row.add(1);

            //每行的个数和行号相等
            for (int j = 1; j < i ; j++) {
                //当前列数据为上一行的前一列和当前列的和
                row.add(prevRow.get(j-1)+prevRow.get(j));
            }
            //给最后一位赋值
            row.add(1);
            res.add(row);
        }
        return res;
    }
}
