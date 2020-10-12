package com.wheelDestiny.Dailylearn;

/*
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
* */
public class re091601 {
    public static void main(String[] args) {

    }
    public int reverse(int x) {
        //这道题的翻转不难，主要在于对溢出的处理
        int ans = 0;
        while (x != 0){
            int pop = x%10;
            //如果当前ans大于Max/10,并且后续还需要再进一位时，这就说明一定会溢出
            //当 ans=Max/10，并且下一位的添加大于7时，这时一定会溢出，2^31-1的个位数是7
            if(ans > Integer.MAX_VALUE/10||(ans == Integer.MAX_VALUE/10&& pop >7)){
                return 0;
            }

            //当ans<Min/10 且后续还有一位数据要添加时，一定会溢出
            //当ans=Min/10 且pop<-8，一定会溢出，8是-2^31的个位数
            if(ans<Integer.MIN_VALUE/10||(ans == Integer.MIN_VALUE/10 && pop <-8)){
                return 0;
            }
            ans = ans *10+pop;
            x/=10;
        }
        return ans;
    }
}
