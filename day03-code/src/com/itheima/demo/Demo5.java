package com.itheima.demo;

public class Demo5 {
    public static void main(String[] args) {
        int a = 10;
        a++;
        System.out.println(a);//a==11
        ++a;
        System.out.println(a);//a==12
        a--;
        System.out.println(a);//a==11
        --a;
        System.out.println(a);//a==10
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println();
    }
}
