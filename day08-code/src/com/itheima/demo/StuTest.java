package com.itheima.demo;

public class StuTest {
    public static void main(String[] args) {
        Stu s = new Stu("张三", 18);
        System.out.println(s.getName());
        System.out.println(s.getAge());

        String name = s.getName();
        System.out.println(name);
        s.setName("李四");
        name = s.getName();
        System.out.println(name);

    }
}
