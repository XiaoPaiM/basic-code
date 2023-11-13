package com.itheima.demo;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入数字1：");
        int number1=sc.nextInt();
        System.out.println("请输入数字2：");
        int number2=sc.nextInt();
        boolean result = number1==6 || number2==6 || (number1+number2)%6==0;
        System.out.println(result);
    }


}
