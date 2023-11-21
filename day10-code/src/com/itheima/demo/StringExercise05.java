package com.itheima.demo;

import java.util.Random;

public class StringExercise05 {
    public static void main(String[] args) {
        char[] arr1 = new char[52];
        for (int i = 0; i < arr1.length; i++) {
            if (i < 26) {
                arr1[i] = (char) ('a' + i);
            }
            else {
                arr1[i] = (char) ('A' + i - 26);
            }
        }
        Random r = new Random();
        char[] arr2 = new char[5];
        for (int i = 0; i < arr2.length; i++) {
            int index = r.nextInt(arr1.length);
            arr2[i] = arr1[index];
        }
        int indexLetter = r.nextInt(arr2.length);
        arr2[indexLetter] = (char) (r.nextInt(10) + 48);
        String randomString = new String(arr2);
        System.out.println(randomString);
    }
}
