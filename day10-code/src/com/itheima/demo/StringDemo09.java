package com.itheima.demo;

import java.util.Scanner;

public class StringDemo09 {
    public static void main(String[] args) {
        //键盘键入一个整数金额
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入一个整数金额：");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            }
            else {
                System.out.println("金额无效！");
            }
        }
        String moneyStr = "";
        while (true) {
            //从右往左获取数据
            int ge = money % 10;
            //获取对应的中文大写
            String capitalNumber = getCapitalNumber(ge);
            //拼接字符串
            moneyStr = capitalNumber + moneyStr;
            //去掉刚刚获取的数据
            money /= 10;
            if (money == 0) {
                break;
            }
        }
        //补零
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }

//        System.out.println(moneyStr);

        String result = "";
        //插入单位
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result + c + arr[i];
        }
        System.out.println(result);
    }

    //查表法
    public static String getCapitalNumber(int number) {
        //定义字符串数组，让数字跟大写的中文产生一个对应的关系
        String[] arr = new String[]{"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        //返回结果
        return arr[number];
    }
}
