package com.heima.demo;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入起始值：");
        int start = sc.nextInt();
        System.out.println("请输入终止值：");
        int stop = sc.nextInt();
        int count =0;
        for (int i = start; i <= stop; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
