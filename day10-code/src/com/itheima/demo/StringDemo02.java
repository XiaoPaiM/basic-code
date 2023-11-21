package com.itheima.demo;

public class StringDemo02 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "Addbc";
        System.out.println(s1 == s2);
        boolean result1 = s1.equals(s2);
        System.out.println(result1);
        boolean result2=s2.equalsIgnoreCase(s1);
        System.out.println(result2);
    }
}
