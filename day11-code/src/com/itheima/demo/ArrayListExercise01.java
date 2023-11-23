package com.itheima.demo;

import java.util.ArrayList;

public class ArrayListExercise01 {
    public static void main(String[] args) {
        //创建集合的对象
        ArrayList<String> list = new ArrayList<>();
        //添加元素list.add(E s);
        list.add("张三");
        list.add("李四");
        list.add("赵六");
        //打印集合
        System.out.println(list);
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (i == 0) {
                System.out.print("[");
            }
            if (i == list.size() - 1) {
                System.out.print(s + "]");
            }
            else {
                System.out.print(s + ", ");
            }
        }
    }
}
