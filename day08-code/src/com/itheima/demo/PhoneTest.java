package com.itheima.demo;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "小米";
        p.price = 1999.00;

        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.playGame();

        Phone p2=new Phone();
        p2.brand="苹果";
        p2.price=8999.00;
    }
}
