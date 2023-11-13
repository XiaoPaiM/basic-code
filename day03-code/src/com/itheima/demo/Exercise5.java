package com.itheima.demo;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入我们自己的衣服时髦度：");
        int myFashion =sc.nextInt();
        System.out.println("请输入相亲对象衣服的时髦度：");
        int girlFashion=sc.nextInt();

        boolean result=myFashion >girlFashion;

        System.out.println(result);
    }
}
