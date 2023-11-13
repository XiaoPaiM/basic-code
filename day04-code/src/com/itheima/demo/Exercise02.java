package com.heima.demo;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的余额：");
        int money = sc.nextInt();

        if (money >= 100) {
            System.out.println("吃网红餐厅");
        } else {
            System.out.println("走，我们去吃沙县小吃！");

        }
    }
}
