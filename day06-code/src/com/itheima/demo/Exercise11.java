package com.itheima.demo;

public class Exercise11 {
    public static void main(String[] args) {
        int[] array = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99};
        traverse(array);
        System.out.println(max(array));
        System.out.println(exists(11, array));
    }

    public static void traverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
            }
            else {
                System.out.print(arr[i] + ",");
            }
        }
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static boolean exists(double n, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }
}
