package com.itheima.demo;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入身高1：");
        int height1 = sc.nextInt();

        System.out.println("请输入身高2：");
        int height2 = sc.nextInt();

        System.out.println("请输入身高3：");
        int height3 = sc.nextInt();

        int maxHeight = Math.max(height1, height2);
        int max = Math.max(maxHeight, height3);
        System.out.println(max);
    }
}
