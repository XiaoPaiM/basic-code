package com.itheima.demo;

public class Stu {
    private String name;
    private int age;

    public Stu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    ;

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
