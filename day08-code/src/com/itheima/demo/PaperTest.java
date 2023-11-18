package com.itheima.demo;

public class PaperTest {
    public static void main(String[] args) {
        Paper p1 = new Paper();
        p1.length = 11.1;
        System.out.println(p1.length);
        Paper p2 = p1;
        p2.length = 22.2;
        System.out.println(p1.length);
        System.out.println(p2.length);
        Paper p3 = p1;
        p1 = null;
//        System.out.println(p1.length);
        System.out.println(p2.length);
        p2 = null;
        System.out.println("P3:" + p3.length);
    }
}
