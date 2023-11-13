package com.heima.demo;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = 1000;
        System.out.println("请输入会员的级别：");
        int vip = sc.nextInt();
        if (vip == 1) {
            System.out.println("实际支付的钱为：" + (price * 0.9));
        } else if (vip == 2) {
            System.out.println("实际支付的钱为：" + (price * 0.8));
        } else if (vip == 3) {
            System.out.println("实际支付的钱为：" + (price * 0.7));
        } else {
            System.out.println("实际支付的钱为：" + price);
        }
    }
}
