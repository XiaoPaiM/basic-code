package com.itheima.demo;

import java.util.Scanner;

public class StringDemo06 {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        //统计大小写
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                smallCount++;
            }
            else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            }
            else if (c >= '0' && c <= '9') {
                numberCount++;
            }
        }
        System.out.printf("小写字母的个数为%d，大写字母的个数为%d，数字字符为%d",smallCount,bigCount,numberCount);
    }
}
