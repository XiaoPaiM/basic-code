package com.itheima.demo;

public class Exercise03 {
    public static void main(String[] args) {
        int[] arr = {33, 5, 22, 34, 54, 32, 99};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("maximum: " + max);
        System.out.println("minimum: " + min);
    }
}
