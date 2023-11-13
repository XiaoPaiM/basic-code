package com.heima.demo;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the dividend:");
        int dividend = sc.nextInt();
        System.out.println("Please enter the divisor:");
        int divisor = sc.nextInt();
        int quotient = 0;
        int remainder = dividend - divisor;

        while (dividend > divisor) {
            dividend -= divisor;
            remainder = dividend;
            quotient++;
        }
        System.out.println("quotient: " + quotient);
        System.out.println("remainder: " + remainder);

    }
}
