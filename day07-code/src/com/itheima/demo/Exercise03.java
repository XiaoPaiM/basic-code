package com.itheima.demo;

import java.util.Random;

public class Exercise03 {
    public static void main(String[] args) {
        System.out.println(verification());
    }
    public static StringBuilder verification() {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                chs[i] = (char) ('a' + i);
            }
            else {
                chs[i] = (char) ('A' + i - 26);
            }
        }

        StringBuilder result = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            result.append(chs[randomIndex]);
        }
        int number = r.nextInt(10);
        result.append(number);
        return result;
    }
}
