package com.heima.demo;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("支付金额：");
        int money=sc.nextInt();

        if (money>=600){
            System.out.println("支付成功！");
        }else{
            System.out.println("支付失败！");
        }
    }
}
