package com.itheima.demo;

public class Exercise01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;
            System.out.println("小老虎在吃第" + i + "个包子。");
        }
        System.out.println("---------------------------------------");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) break;
            System.out.println("小老虎在吃第" + i + "个包子。");
        }
    }
}
