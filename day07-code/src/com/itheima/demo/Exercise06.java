/*加密*/
package com.itheima.demo;

import java.util.Random;

public class Exercise06 {
    public static void main(String[] args) {
        System.out.println(getPassword());
    }

    public static int getPassword() {
        Random r = new Random();
        int[] password = new int[4];
        for (int i = 0; i < password.length; i++) {
            password[i] = r.nextInt(10);
        }

        for (int i = 0; i < password.length; i++) {
            password[i] = (password[i] + 5) % 10;
        }
        for (int i = 0, j = password.length - 1; i < j; i++, j--) {
            int temp = password[i];
            password[i] = password[j];
            password[j] = temp;
        }
        int number = 0;
        for (int i = 0; i < password.length; i++) {
            number = number * 10 + password[i];
        }
        return number;
    }
}
