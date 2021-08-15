package com.itcoderwy.leetcode;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 *
 */
public class reverse {
    public static void main(String[] args) {
        int num = 1513;
        System.out.println("反转前的值--->"+num);
        int reverse = reverse(num);
        System.out.println("反转后的值--->"+reverse);
    }

    public static int reverse(int num){
        //定义一个临时变量  用于存储整数的末尾值 初始化值为0
        int temp = 0;
        //定义一个返回值变量  初始化值为0
        int reverse = 0;
        while (num != 0){
            //在转化之前先跟32位内存值范围进行比较   在范围内继续执行  不在范围内则返回0
            if(reverse > Integer.MAX_VALUE/10 || reverse < Integer.MIN_VALUE/10) return 0;
            //取余运算  拿到末尾值
            temp = num%10;
            //更新num数值
            num  = num/10;
            //更新返回值
            reverse = reverse * 10 +temp;
        }
        return reverse;
    }
}
