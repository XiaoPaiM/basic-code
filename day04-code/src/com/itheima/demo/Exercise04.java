package com.heima.demo;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的票号：");
        int number = sc.nextInt();

        if (number >= 0 && number <= 100) {
            if (number % 2 == 0) {
                System.out.println("请坐右边！");
            } else {
                System.out.println("请坐左边！");
            }
        } else {
            System.out.println("不要买假票！");
        }
    }
}
