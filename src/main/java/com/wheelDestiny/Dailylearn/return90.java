package com.wheelDestiny.Dailylearn;

public class return90 {

    public void rotate(int[][] matrix) {
        int length = matrix.length;

        //先进行左上到右下的对角线翻转（最后一行不需要操作）
        for (int i = 0; i <length -1 ; i++) {
            for (int j = i+1; j < length ; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        //然后在进行左右的镜像翻转
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length/2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][length-j-1];
                matrix[i][length-j-1] = tmp;
            }
        }
    }

}
