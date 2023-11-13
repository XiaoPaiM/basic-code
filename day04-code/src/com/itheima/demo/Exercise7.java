package com.heima.demo;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入星期：");
        String whatDay = sc.next();
        switch (whatDay) {
            case "周一", "周二", "周三", "周四", "周五":
                System.out.println("工作日");
                break;
            case "周六", "周日":
                System.out.println("休息日");
            default:
                System.out.println("输入有误！");
                break;
        }
    }
}
