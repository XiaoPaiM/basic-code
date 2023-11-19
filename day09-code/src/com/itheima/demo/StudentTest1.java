package com.itheima.demo;

public class StudentTest1 {
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

        Student stu4 = new Student(4, "赵六", 23);
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            System.out.println("当前id重复，请修改id后再进行添加！");
        }
        else {
            int count = getCount(arr);
            if (count == arr.length) {
                Student[] newArr = createNewArr(arr);
                newArr[count] = stu4;
                printArr(newArr);

            }
            else {
                arr[count] = stu4;
                printArr(arr);
            }
        }
    }

        //遍历所有学生的信息
    public static void printArr(Student[] arr) {
        for (Student stu : arr) {
            if (stu != null) {
                System.out.println(stu.getId() + "，" + stu.getName() + "，" + stu.getAge());
            }
        }
    }

    //创建一个新的数组，长度=old array +1
    public static Student[] createNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        return newArr;
    }

    //判断数组中元素的状态值
    public static int getCount(Student[] arr) {
        //定义一个计数器用来统计
        int count = 0;
        for (Student student : arr) {
            if (student != null) {
                count++;
            }
        }
        return count;
    }

    //判断学生id是否存在
    public static boolean contains(Student[] arr, int id) {
        for (Student stu : arr) {
            if (stu != null) {
                int sId = stu.getId();
                if (sId == id) {
                    return true;
                }
            }
        }
        return false;
    }
}
