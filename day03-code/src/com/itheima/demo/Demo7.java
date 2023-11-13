package com.itheima.demo;

public class Demo7 {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println("----------------");
        System.out.println(true || true);//true
        System.out.println(false || false);//false
        System.out.println(false || true);//true
        System.out.println(true || false);//true
        System.out.println("----------------");
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
        byte aa = (byte) -129;
        System.out.println(aa);
        int a1 = 300;
        byte a2 = (byte) a1;
        System.out.println(a2);
        int a3=200;
        byte a4=(byte)a3;
        System.out.println(a4);
        int number1 =200;
        int number2=10;
        System.out.println(number1<<2 );
    }
}
