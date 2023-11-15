package com.itheima.demo;

public class Exercise01 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[0];
        }
        System.out.println(sum);
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 3 == 0) count++;
        }
        System.out.println(count);
    }

}
