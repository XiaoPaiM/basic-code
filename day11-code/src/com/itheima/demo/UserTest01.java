package com.itheima.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class UserTest01 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<User> user = new ArrayList<>();
        //创建用户对象
        User user1 = new User("1", "张三", "123456");
        User user2 = new User("2", "李四", "123457");
        User user3 = new User("3", "王五", "123458");
        //把元素添加到集合里
        user.add(user1);
        user.add(user2);
        user.add(user3);
        //输入要查询的用户Id
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查询的用户Id：");
        String id = sc.next();
        boolean flag = contains(user, id);
        if (flag) {
            System.out.println("查询的用户存在。");
        }
        else {
            System.out.println("查询的用户不存在。");
        }
    }

    public static boolean contains(ArrayList<User> user, String id) {
        for (int i = 0; i < user.size(); i++) {
            String userId = user.get(i).getId();
            if(id.equals(userId)){
                return true;
            }
        }
        return false;
    }
}
