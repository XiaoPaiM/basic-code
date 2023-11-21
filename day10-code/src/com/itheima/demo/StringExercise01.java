package com.itheima.demo;

import java.util.Scanner;

public class StringExercise01 {
    public static void main(String[] args) {
        //类的实例化
        Scanner sc = new Scanner(System.in);
        String str = checkStr(sc);
        String result = toRomanNumerals(str);
        System.out.printf("Roman numerals: %s", result);
    }

    private static String checkStr(Scanner sc) {
        String str;
        while (true) {
            System.out.println("请输入一串字符串：");
            str = sc.next();
            if (str.length() <= 9) {
                boolean flag = isNumber(str);
                if (flag) {
                    break;
                }
                else {
                    System.out.println("输入的字符串不是纯数字字符串，请重新输入：");
                }
            }
            else {
                System.out.println("输入的字符串长度不对，请重新输入：");
            }
        }
        return str;
    }

    public static boolean isNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static String toRomanNumerals(String str) {
        //查表法
        String[] arr = new String[]{"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        //类的实例化
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //隐形转换
            int index = c - 48;
            sb.append(arr[index]);
        }
        return sb.toString();
    }
}
