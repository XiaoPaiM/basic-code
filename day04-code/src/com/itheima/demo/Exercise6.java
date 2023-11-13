package com.heima.demo;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        String week = sc.next();
        switch (week) {
            case "周一":
                System.out.println("周一：跑步");
                break;
            case "周二":
                System.out.println("周二：游泳");
                break;
            case "周三":
                System.out.println("周三：慢走");
                break;
            case "周四":
                System.out.println("周四：动感单车");
                break;
            case "周五":
                System.out.println("周五：拳击");
                break;
            case "周六":
                System.out.println("周六：爬山");
                break;
            case "周日":
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("摆烂吧");
                break;
        }
    }
}
