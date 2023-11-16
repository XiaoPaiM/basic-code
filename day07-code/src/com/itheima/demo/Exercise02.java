package com.itheima.demo;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入起始位：");
        int start = sc.nextInt();
        System.out.print("请输入终止位：");
        int stop = sc.nextInt();

        int count = 0;
        for (int i = start; i <= stop; i++) {
            boolean prime = true;

            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
