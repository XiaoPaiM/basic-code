package com.itheima.demo;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        getScores();
    }

    public static void getScores() {
        Scanner sc = new Scanner(System.in);
        int[] scoreArr = new int[6];
        for (int i = 0; i < scoreArr.length; ) {
            System.out.println("请第" + (i + 1) + "位评委打分：");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scoreArr[i] = score;
                i++;
            }
            else {
                System.out.println("该评分不对！");
                System.out.println("请该评委重新打分！");
            }
        }
        int max = getMax(scoreArr);
        int min = getMin(scoreArr);
        int sum = getSum(scoreArr);
        int avg = (sum - max - min) / (scoreArr.length - 2);

        System.out.println("选手的得分：" + avg);
    }

    public static int getSum(int[] scoreArr) {
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum += scoreArr[i];
        }
        return sum;
    }

    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] > max) {
                max = scoreArr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] < min) {
                min = scoreArr[i];
            }
        }
        return min;
    }
}
