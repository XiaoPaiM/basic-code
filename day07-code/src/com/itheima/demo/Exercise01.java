package com.itheima.demo;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the price: ");
        double price = sc.nextDouble();

        System.out.print("Please enter the month: ");
        int month = sc.nextInt();

        System.out.print("Please enter the grade: ");
        int seat = sc.nextInt();

        if (month >= 5 && month <= 10) {
            price = getPrice(price, seat, 0.9, 0.85);
        }
        else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            price = getPrice(price, seat, 0.7, 0.65);
        }
        else {
            System.out.println("键盘录入的月份不合法！");
        }
        System.out.println("Total price is " + price);

    }

    public static double getPrice(double price, int seat, double v0, double v1) {
        if (seat == 0) {
            price *= v0;
        }
        else if (seat == 1) {
            price *= v1;
        }
        else {
            System.out.println("没有这个舱位!");
        }
        return price;
    }
}
