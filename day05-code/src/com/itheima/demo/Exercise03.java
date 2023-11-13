package com.itheima.demo;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int square=sc.nextInt();
        int n=1;
        for(int i =1;i*i<=square;i++){
            n=i;
        }
        System.out.println(n);
    }
}
