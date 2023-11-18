package com.itheima.demo;

public class GirlFriend {
    private String sex;
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 50) {
            this.age = age;
        }
        else {
            System.out.println("非法参数");
        }
    }

    public int getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void sleep() {
        System.out.println("My girlfriend is sleeping.");
    }

    public void eat() {
        System.out.println("My girlfriend is eating.");
    }
}
