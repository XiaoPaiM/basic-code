package com.itheima.demo;

import java.util.Random;
import java.util.Scanner;

public class StringExercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        char[] arr = str.toCharArray();
        randomCharArray(arr);
        String result = new String(arr);
        System.out.println(result);
    }

    public static void randomCharArray(char[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; ) {
            int index = r.nextInt(arr.length);
            System.out.println(index);
            char c = arr[i];
            if (i != index) {
                arr[i] = arr[index];
                arr[index] = c;
                i++;
            }
        }
    }
}
