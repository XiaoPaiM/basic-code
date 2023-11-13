package com.heima.demo;

public class Exercise1 {
    public static void main(String[] args) {
        boolean isLightGreen = false;
        boolean isLightYellow = true;
        boolean isLightRed = true;
        if (isLightGreen) {
            System.out.println("允许通行");
        }
        else if (isLightYellow) {
            System.out.println("禁止通行");
        }
        else if (isLightRed) {
            System.out.println("不要命就闯");
        }
    }
}
