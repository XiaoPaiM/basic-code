package com.itheima.demo;

public class Exercise12 {
    public static void main(String[] args) {
        int[][] date = new int[4][];
        int[] date0 = {22, 66, 44};
        int[] date1 = {77, 33, 88};
        int[] date2 = {25, 45, 65};
        int[] date3 = {11, 66, 99};
        date[0] = date0;
        date[1] = date1;
        date[2] = date2;
        date[3] = date3;
        int yearSum = 0;
        for (int i = 0; i < date.length; i++) {
            int[] season = date[i];
            int sum = getSum(season);
            yearSum += sum;
            System.out.println("第" + (i + 1) + "个季度的总营业额为：" + sum);
        }
        System.out.println("全年营业额为：" + yearSum);
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
