package com.heima.demo;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("成绩为：");
        int grade = sc.nextInt();
        if (grade > -0 && grade <= 100) {
            if (grade >= 95 && grade <= 100) {
                System.out.println("送自行车一辆");
            } else if (grade >= 90 && grade <= 94) {
                System.out.println("游乐场一天");
            } else if (grade >= 80 && grade <= 89) {
                System.out.println("变形金刚一个");
            } else {
                System.out.println("七匹狼伺候！");
            }
        }else{
            System.out.println("输入有误！");
        }
    }
}
