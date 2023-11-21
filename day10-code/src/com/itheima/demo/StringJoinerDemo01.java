package com.itheima.demo;

import java.util.StringJoiner;

public class StringJoinerDemo01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        StringJoiner sj = new StringJoiner(",", "[", "]");
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj);
    }
}
