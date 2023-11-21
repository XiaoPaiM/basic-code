package com.itheima.demo;

import java.util.Scanner;

public class StringDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的身份证号码：");
        String id = sc.next();
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);
        String gender = id.substring(16, 17);
        gender = switch (gender) {
            case "0", "2", "4", "6", "8" -> "女";
            default -> "男";
        };
        System.out.println("人物的信息为：");
        System.out.printf("出生日期：%s年%s月%s日\n", year, month, day);
        System.out.printf("性别为：%s\n",gender);

    }
}
