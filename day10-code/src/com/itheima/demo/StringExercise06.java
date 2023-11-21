package com.itheima.demo;

public class StringExercise06 {
    public static void main(String[] args) {
        //两个数字字符串
        String num1 = "20";
        String num2 = "30";
        //数字字符串转数字的载体
        int number1 = 0;
        int number2 = 0;
        //数字字符串转数字的过程
        for (int i = 0; i < num1.length(); i++) {
            char c = num1.charAt(i);
            int number = c - 48;
            number1 = number1 * 10 + number;
        }
        for (int i = 0; i < num2.length(); i++) {
            char c = num2.charAt(i);
            int number = c - 48;
            number2 = number2 * 10 + number;
        }
        //乘积
        int product = number1 * number2;
        //数字转数字字符串
        String numberString = String.valueOf(product);
        System.out.println(numberString);

    }
}
