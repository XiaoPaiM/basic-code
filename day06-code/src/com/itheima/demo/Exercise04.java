package com.itheima.demo;

import java.util.Random;

public class Exercise04 {
    public static void main(String[] args) {
        Random r = new Random();

        int[] array = new int[10];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100) + 1;
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (sum / array.length > array[i]) {
                count++;
            }
        }
        System.out.println("sum: " + sum);
        System.out.println("Avg: " + sum / array.length);
        System.out.println("count: " + count);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }
}
