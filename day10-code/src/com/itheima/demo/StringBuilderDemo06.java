package com.itheima.demo;

public class StringBuilderDemo06 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        String result = arrToString(arr);
        System.out.println(result);
    }

    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            }
            else {
                sb.append(arr[i]).append(",");
            }
        }
            return sb.toString();
    }
}
