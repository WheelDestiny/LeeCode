package com.wheelDestiny.Dailylearn;

import java.util.HashMap;
import java.util.Map;

/*
判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。

数字 1-9 在每一行只能出现一次。
数字 1-9 在每一列只能出现一次。
数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。

* */
public class re091401 {
    public static void main(String[] args) {

    }
    public boolean isValidSudoku(char[][] board) {
        /**
         * 1，枚举子数独
         *  box_index = (row/3)*3 + columns/3
         * 2，确保每行每列中都没有重复项
         */
        //init data
        HashMap<Integer,Integer> [] rows = new HashMap[9];
        HashMap<Integer,Integer> [] columns = new HashMap[9];
        HashMap<Integer,Integer> [] boxes = new HashMap[9];

        for (int i = 0; i < 9 ; i++) {
            rows[i] = new HashMap<Integer, Integer>();
            columns[i] = new HashMap<Integer, Integer>();
            boxes[i] = new HashMap<Integer, Integer>();
        }
        //validate a board
        for (int i = 0; i < 9 ; i++) {
            for (int j = 0; j < 9 ; j++) {
                char num = board[i][j];
                if (num != '.'){
                    int n = (int)num;
                    int box_index = (i/3)*3+j/3;

                    //keep the current cell value
                    rows[i].put(n,rows[i].getOrDefault(n,0)+1);
                    columns[j].put(n,columns[j].getOrDefault(n,0)+1);
                    boxes[box_index].put(n,boxes[box_index].getOrDefault(n,0)+1);

                    //check if this value has been already seen before
                    if (rows[i].get(n) > 1 || columns[j].get(n) > 1 || boxes[box_index].get(n)>1){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
