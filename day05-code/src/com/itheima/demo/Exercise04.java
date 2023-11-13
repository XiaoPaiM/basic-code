package com.itheima.demo;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int prime = sc.nextInt();
        boolean flag=true;
        for (int i = 2; i < prime / 2; i++) {
            if (prime % i == 0) {
                flag=false;
                break;
            }
        }if(flag){
            System.out.println(prime+" is prime.");
        }else{
            System.out.println(prime+" is not prime.");
        }
    }
}
