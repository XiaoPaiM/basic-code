package com.itheima.demo;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        //创建集合的对象
        //泛型：限定集合中存储数据的类型
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<>();
        System.out.println(list1);
        System.out.println(list2);
    }
}
