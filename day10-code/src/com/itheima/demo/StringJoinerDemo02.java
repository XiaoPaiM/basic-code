package com.itheima.demo;

import java.util.StringJoiner;

public class StringJoinerDemo02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        //创建对象
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i]+"");
        }
        System.out.println(sj);
    }
}
