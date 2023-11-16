package com.itheima.demo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        int[] arr = createNumber();
        System.out.println("================================");
        System.out.println(Arrays.toString(arr));
        System.out.println("================================");
        int[] userInputArr = userInputNumber();
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < userInputArr.length - 1; i++) {
            for (int j = 0; j < userInputArr.length - 1; j++) {
                if (arr[i] == userInputArr[j]) {
                    redCount++;
                    break;
                }
            }
        }
        int blueNumber = userInputArr[userInputArr.length - 1];
        if (blueNumber == arr[arr.length - 1]) {
            blueCount++;
        }

//根据红球的个数以及篮球的个数来判断中奖情况
        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜你，中奖1000万");
        }
        else if (redCount == 6) {
            System.out.println("恭喜你，中奖500万");
        }
        else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你，中奖3000");
        }
        else if (redCount == 5 || redCount == 4 && blueCount == 1) {
            System.out.println("恭喜你，中奖200");
        }
        else if (redCount == 4 || redCount == 3 && blueCount == 1) {
            System.out.println("恭喜你，中奖10");
        }
        else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
            System.out.println("恭喜你，中奖5");
        }
        else {
            System.out.println("谢谢参与，谢谢惠顾");
        }
    }

    public static int[] userInputNumber() {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码：");
            int redNumber = sc.nextInt();
            if (redNumber >= 1 && redNumber <= 33) {
                boolean flag = contains(arr, redNumber);
                if (!flag) {
                    arr[i] = redNumber;
                    i++;
                }
                else {
                    System.out.println("当前红球号码已经存在，请重新输入：");
                }
            }
            else {
                System.out.println("超出范围！");
            }
        }
        System.out.println("请输入蓝球号码：");
        while (true) {
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;
            }
            else {
                System.out.println("超出范围，请重新输入：");
            }
        }
        return arr;
    }

    public static int[] createNumber() {
        Random r = new Random();
        int[] arr = new int[7];
        for (int i = 0; i < 6; ) {
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                arr[i] = redNumber;
                i++;
            }
        }
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;
        return arr;
    }

    public static boolean contains(int[] arr, int number) {
        for (int j : arr) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }
}
