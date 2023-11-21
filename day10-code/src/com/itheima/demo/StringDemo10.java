package com.itheima.demo;

public class StringDemo10 {
    public static void main(String[] args) {
        String phoneNumber = "13112349468";

        String start = phoneNumber.substring(0, 3);
        System.out.println(start);
        String end = phoneNumber.substring(7);
        System.out.println(end);
        String result =start+"****"+end;
        System.out.println(result);
    }
}
