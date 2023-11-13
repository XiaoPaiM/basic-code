package com.itheima.demo;

import java.util.Random;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int random = r.nextInt(100) + 1;
//        System.out.println("random: " + random);
        while (true) {
            System.out.println("Please enter an integer:");
            int number = sc.nextInt();

            if (number == random) {
                System.out.println("Celebrate you!");
                break;
            }
            else if (number > random) {
                System.out.println("Larger!");
            }
            else {
                System.out.println("Small!");
            }
        }
    }
}
