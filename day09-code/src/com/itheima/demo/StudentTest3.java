package com.itheima.demo;

import java.util.Scanner;

public class StudentTest3 {
    public static void main(String[] args) {
//创建对象数组
        Student[] arr = new Student[3];
        //对象实例化
        Student stu1 = new Student(1, "张三", 20);
        Student stu2 = new Student(2, "李四", 21);
        Student stu3 = new Student(3, "王五", 22);
        //对象的地址值赋给对象数组
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询学生的Id：");
        int sId = sc.nextInt();
        int index = getIndex(arr, sId);
        if (index >= 0) {
            int age = arr[index].getAge() + 1;
            arr[index].setAge(age);
            //遍历All学生信息
            printArr(arr);
        }
        else {
            System.out.println("当前id不存在，修改失败！");

        }

    }

    //判断学生id是否存在
    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            if (student != null) {
                int sId = student.getId();
                if (sId == id) {
                    return i;
                }
            }
        }
        return -1;
    }

    //遍历学生信息
    public static void printArr(Student[] arr) {
        for (Student stu : arr) {
            if (stu != null) {
                System.out.println(stu.getId() + "，" + stu.getName() + "，" + stu.getAge());
            }
        }
    }
}
