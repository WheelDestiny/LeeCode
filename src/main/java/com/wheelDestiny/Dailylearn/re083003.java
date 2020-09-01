package com.wheelDestiny.Dailylearn;

public class re083003 {

    public static void main(String[] args) throws InterruptedException {
        re083003 re = new re083003();
        System.out.println(re.longestPalindrome("12321123123"));

    }
    public String longestPalindrome(String s) {
        //参数字符串长度如果小于2，直接返回参数
        int length = s.length();
        if(length<2){
            return s;
        }
        //初始回文最大长度为1
        int bigLen = 1;
        //起始回文子串起始位为0
        int begin = 0;
        // s.charAt(i) 每次都会检查数组下标越界，因此先转换成字符数组
        char[] chars = s.toCharArray();
        // 枚举所有长度大于 1 的子串 charArray[i..j]
        for (int i = 0; i < length-1; i++) {
            for (int j = i+1; j < length; j++) {
                //如果当前子串长度大于当前获得的回文长度，且该子串是回文，重设最大长度和回文子串起始位置
                if(j-i+1>bigLen&&validPalindromic(chars,i,j)){
                    begin=i;
                    bigLen = j-i+1;
                }
            }
        }
        return s.substring(begin,begin+bigLen);
    }

    /**
     * 验证子串 s[left..right] 是否为回文串
     */
    private boolean validPalindromic(char[] charArray, int left, int right) {
        while (left<right){
            if (charArray[left]!=charArray[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
