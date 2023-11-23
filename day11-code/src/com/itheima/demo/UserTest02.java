package com.itheima.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class UserTest02 {
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
        int index = getIndex(user, id);
        if (index > -1) {
            System.out.println("查询的用户存在。");
            System.out.println("所在索引为：" + index);
        }
        else {
            System.out.println("查询的用户不存在。");
        }
    }

    public static boolean contains(ArrayList<User> user, String id) {
        return getIndex(user, id) >= 0;
    }

    public static int getIndex(ArrayList<User> user, String id) {
        for (int index = 0; index < user.size(); index++) {
            String userId = user.get(index).getId();
            if (id.equals(userId)) {
                return index;
            }
        }
        return -1;
    }
}
