/*解密*/
package com.itheima.demo;

public class Exercise07 {
    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 6};
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] += 10;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 5;
        }
        int number = 0;
        for (int j : arr) {
            number = number * 10 + j;
        }
        System.out.println(number);
    }
}
