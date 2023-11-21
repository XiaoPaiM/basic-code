package com.itheima.demo;

public class StringDemo08 {
    public static void main(String[] args) {
        String s1 = "张三李四王五赵六";
        System.out.println(reverser(s1));
    }

    public static String reverser(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            //基本数据类型 变量 = 对象.成员方法();
            char c = str.charAt(i);
            result = result + c;
        }
        return result;
    }
}
