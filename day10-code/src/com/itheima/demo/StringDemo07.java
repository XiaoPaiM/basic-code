package com.itheima.demo;

public class StringDemo07 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        String str = arrayToString(arr);
        System.out.println(str);
    }

    public static String arrayToString(int[] arr) {
        if (arr == null) {
            return "";
        }
        if (arr.length == 0) {
            return "[]";
        }
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                result = "[" + arr[i] + ",";
            }
            else if (i < arr.length - 1) {
                result = result + arr[i] + ",";
            }
            else{
                result = result + arr[i] + "]";
            }
        }
        return result;
    }
}
