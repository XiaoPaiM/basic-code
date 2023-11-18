package com.itheima.demo;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.setName("张三");
        gf1.setAge(18);
        gf1.setSex("女");
        String name = gf1.getName();
        int age = gf1.getAge();
        String sex = gf1.getSex();
        System.out.println(name);
        System.out.println(age);
        System.out.println(sex);
        gf1.eat();
        gf1.sleep();
    }

}
