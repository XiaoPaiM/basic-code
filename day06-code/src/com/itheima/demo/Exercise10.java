package com.itheima.demo;

public class Exercise10 {
    public static void main(String[] args) {
        double area1 = circleArea(5.3, 1.7);
        double area2 = circleArea(11.4, 1.7);

        if (area1 > area2) {
            System.out.println("The area of the first circle is larger.");
        }
        else {
            System.out.println("The area of the second circle is larger.");
        }
    }

    public static double circleArea(double length, double width) {
        return length * width;
    }
}
