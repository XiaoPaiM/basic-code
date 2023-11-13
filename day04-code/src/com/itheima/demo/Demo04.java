package com.heima.demo;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1 -> System.out.println("一");
            case 2 -> System.out.println("二");
            case 3 -> System.out.println("三");
            default -> System.out.println("没有这种选项");
        }
    }
}
