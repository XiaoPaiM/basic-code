package com.itheima.demo;

public class Exercise04 {
    public static void main(String[] args) {
        int []array={1,2,3,4,5};
        int [] newArray=new int[array.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i]=array[i];
        }
        for (int j : newArray) {
            System.out.println(j);
        }
    }
}
