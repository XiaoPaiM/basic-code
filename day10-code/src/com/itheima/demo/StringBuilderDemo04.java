package com.itheima.demo;

import java.util.Scanner;

public class StringBuilderDemo04 {
    public static void main(String[] args) {
        int len = getString().substring(1).replace("A", "Q").length();
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").append("bbb").append("ccc").append("ddd");
        System.out.println(sb);
        System.out.println(len);
    }

    public static String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        return sc.next();
    }
}
