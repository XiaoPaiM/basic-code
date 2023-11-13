package com.heima.demo;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String noodles=sc.next();
//        String noodles = "兰州拉面";

        switch (noodles) {
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("陕西油泼面");
                break;
            default:
                System.out.println("吃方便面");
                break;
        }
    }
}
