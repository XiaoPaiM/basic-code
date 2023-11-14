/*打乱数组中的数据*/
package com.itheima.demo;

import java.util.Random;

public class Exercise06 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Random r = new Random();
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            temp = arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
