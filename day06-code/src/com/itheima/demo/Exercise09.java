package com.itheima.demo;

public class Exercise09 {
    public static void main(String[] args) {
        rectangleArea(12.1, 11.2);
        circleArea(1.5);
    }

    public static void rectangleArea(double length, double width) {
        double result = length * width;
        System.out.println("rectangle area is " + result);
    }

    public static void circleArea(double diameter) {
        double area = diameter * diameter * 3.14;
        System.out.println("circle area is " + area);
    }
}
