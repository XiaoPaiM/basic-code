package com.heima.demo;

public class Exercise12 {
    public static void main(String[] args) {
        int height = 88444300;
        int thickness = 1;
        int count = 0;
        while (thickness <= height) {
            thickness *= 2;
            count++;
            System.out.println(thickness);
        }
        System.out.println(count);
    }
}
