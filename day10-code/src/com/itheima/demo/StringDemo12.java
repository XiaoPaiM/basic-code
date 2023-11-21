package com.itheima.demo;

public class StringDemo12 {
    public static void main(String[] args) {
        String talks = "你玩的真好，以后不要再玩了，TMD，MLGB";

        String[] arr = {"TMD", "CNM", "SB", "MLGB"};

        for (int i = 0; i < arr.length; i++) {
            talks = talks.replace(arr[i], "***");
        }

        System.out.println(talks);
    }
}
