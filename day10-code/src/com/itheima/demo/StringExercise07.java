package com.itheima.demo;

public class StringExercise07 {
    public static void main(String[] args) {
        String s = "Hello World";
        int index = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == ' ') {
                index = i;
                break;
            }
        }
        s = s.substring(index + 1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.print(c);
        }
    }
}
