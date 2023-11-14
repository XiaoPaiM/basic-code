package com.itheima.demo;

public class Exercise05 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5,6,7,8};
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
