package com.heima.demo;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个回文数：");
        int number = sc.nextInt();
        int reverse = 0;
        int temp = number;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println(reverse);
        System.out.println(reverse == number);

    }
}
