package com.itheima.demo;

public class Exercise12 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] newArray = copyOfRange(array, 6, 10);
        for (int i = 0; i < newArray.length; i++) {
            if (i == newArray.length - 1) {
                System.out.print(newArray[i]);
            }
            else {
                System.out.print(newArray[i] + ",");
            }
        }
    }

    public static int[] copyOfRange(int[] array, int from, int to) {
        int[] newArray = new int[to - from];
        System.arraycopy(array, from, newArray, 0, newArray.length);
        return newArray;
    }
}
