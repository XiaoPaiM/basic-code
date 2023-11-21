package com.itheima.demo;

public class StringExercise03 {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "bcdea";
        boolean result = check(strA, strB);
        System.out.println(result);
    }

    public static boolean check(String strA, String strB) {
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if (strA.equals(strB)) {
                return true;
            }
        }
        return false;
    }

    public static String rotate(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            char c = arr[i + 1];
            arr[i + 1] = arr[i];
            arr[i] = c;
        }
        return new String(arr);
    }
}
