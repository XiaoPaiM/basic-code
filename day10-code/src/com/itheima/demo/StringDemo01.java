package com.itheima.demo;

public class StringDemo01 {
    public static void main(String[] args) {
        String s1 = "abc";
        System.out.println(s1);

        String s2 = new String();
        System.out.println("@" + s2 + "!");

        //类名 对象名 = new 类名();
        //类名 对象名 = new 构造方法的方法名();
        String s3 = new String("abc");
        System.out.println(s3);

        //类名 对象名 = new 类名();
        //类名 对象名 = new 构造方法的方法名();
        char[] chs = {'a', 'b', 'c', 'd'};
        String s4 = new String(chs);
        System.out.println(s4);

        byte[] bytes = {97, 98, 99, 100};
        //类名 对象名 = new 类名();
        //类名 对象名 = new 构造方法的方法名();
        String s5 = new String(bytes);
        System.out.println("s5: " + s5);

        String s6 = "abc";
        String s7 = new String("abc");
        String s8 = new String("abc");
        System.out.println(s6 == s7);
        System.out.println(s7== s8);
    }
}
