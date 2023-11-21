package com.itheima.demo;

public class ScannerDemo {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < 1000000; i++) {
            s.append("abc");
        }
        System.out.println(s);
    }
}
