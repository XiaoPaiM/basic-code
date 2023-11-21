package com.itheima.demo;

import java.util.Scanner;

public class StringDemo04 {
    public static void main(String[] args) {
        //正确的用户名和密码
        String correctUsername = "张三";
        String correctPassword = "123456789";

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            //模拟用户的输入
            System.out.println("请输入正确的用户名：");
            String username = sc.next();
            System.out.println("请输入正确的密码：");
            String password = sc.next();

            //验证用户名和密码
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("用户登入成功");
                break;
            }
            else if (i==2) {
                System.out.println("账户"+username+"被锁定，请联系相关人员，客服电话：xxx-xxxx-xxxx");
            }
            else {
                System.out.printf("用户登入失败，用户名或密码有误，您还剩下%d次机会！", 3 - i - 1);
                System.out.println();
            }
        }

    }
}
