package com.itheima.demo;

public class StringBuilderDemo02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("abcabcabcabcabcabcabcabcab01234567sdsdsds891");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
