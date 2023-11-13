package com.itheima.demo;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int number = sc.nextInt();
        System.out.println(number%10);
        System.out.println(number/10%10);
        System.out.println(number/100%10);
        System.out.println("个位是"+number%10+" ，十位是"+number/10%10+" ，百位是"+number/100%10);
    }
}
