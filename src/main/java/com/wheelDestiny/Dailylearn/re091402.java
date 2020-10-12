package com.wheelDestiny.Dailylearn;

import java.util.HashMap;

/*
给定一个 n × n 的二维矩阵表示一个图像。

将图像顺时针旋转 90 度。

说明：

你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
* */
public class re091402 {
    public static void main(String[] args) {

        rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
    public static void rotate(int[][] matrix) {
        //第一步，先按左上到右下的中心线翻转
        //第二步，按竖中心线左右翻转
        if (matrix.length==1){
            return;
        }

        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 1+i; j < matrix[1].length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[1].length/2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[1].length-1-j];
                matrix[i][matrix[1].length-1-j] = tmp;
            }
        }


    }
}
