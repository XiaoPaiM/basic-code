package com.itheima.demo;

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        //创建集合的对象
        ArrayList<String> list1 = new ArrayList<>();
        boolean result1 = list1.add("张三");
        boolean result2 = list1.add("李四");
        boolean result3 = list1.add("王五");
        boolean result4 = list1.add("赵六");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(list1);
        boolean result5 = list1.remove("张三");
        String str1 = list1.remove(1);
        System.out.println(result5);
        System.out.println(list1);
        System.out.println(str1);
        String str2 = list1.set(0, "孙七");
        System.out.println(str2);
        System.out.println(list1);
        String str3 = list1.get(1);
        System.out.println(str3);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}
