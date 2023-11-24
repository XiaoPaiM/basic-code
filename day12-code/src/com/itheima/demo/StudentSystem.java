package com.itheima.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void startStudentSystem() {
        //创建集合的对象
        ArrayList<Student> students = new ArrayList<>();

        //创建学生对象
        Student s1 = new Student("001", "张三", 23, "南京");
        Student s2 = new Student("002", "李四", 24, "北京");
        Student s3 = new Student("003", "王五", 25, "广州");
        Student s4 = new Student("004", "赵六", 26, "深圳");

        //添加学生对象到集合对象里
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        Scanner sc = new Scanner(System.in);
        //loop:
        while (true) {
            //菜单栏
            menu();
            int select = sc.nextInt();
            switch (select) {
                case 1 -> addStudent(students);
                case 2 -> deleteStudent(students);
                case 3 -> updateStudent(students);
                case 4 -> queryStudent(students);
                case 5 -> {
                    System.out.println("感谢使用！");
                    //break loop;
                    System.exit(0);//停止虚拟机运行
                }
                default -> System.out.println("该管理系统没有这项功能，请重新选择！");
            }
        }
    }

    //判断id的唯一性
    public static boolean contains(ArrayList<Student> students, String id) {
       /* Student student;
        //遍历查询该id是否存在
        for (Student value : students) {
            student = value;
            String stuId = student.getId();
            if (stuId.equals(id)) {
                //该学生Id存在，返回True
                return true;
            }
        }
        //该学生Id不存在，返回False*/
        return getIndex(students, id) >= 0;
    }

    public static int getIndex(ArrayList<Student> students, String stuId) {
        for (int i = 0; i < students.size(); i++) {
            String studentsId = students.get(i).getId();
            if (stuId.equals(studentsId)) {
                return i;
            }
        }
        return -1;
    }

    //浏览菜单
    public static void menu() {
        System.out.println("----------------欢迎来到黑马学生管理系统----------------");
        System.out.println("1：添加学生");
        System.out.println("2：删除学生");
        System.out.println("3：修改学生");
        System.out.println("4：查询学生");
        System.out.println("5：退出");
        System.out.println("请输入您的选择：");

    }

    //添加学生信息
    public static void addStudent(ArrayList<Student> students) {
        //创建学生对象
        Student student = new Student();

        Scanner sc = new Scanner(System.in);
        String stuId;
        while (true) {
            System.out.println("请输入要录入学生的Id：");
            stuId = sc.next();
            //判断该学生Id是否存在，如果存在，提示重新输入。
            boolean flag = contains(students, stuId);
            if (flag) {
                //如果该学生Id已经存在，提示用户重新录入其他学生Id。
                System.out.println("该学生Id已经存在，请重新录入其他学生Id：");
            }
            else {
                student.setId(stuId);
                break;
            }
        }
        System.out.println("请输入要录入学生的姓名：");
        String stuName = sc.next();
        student.setName(stuName);


        System.out.println("请输入要录入学生的年龄：");
        int stuAge = sc.nextInt();
        student.setAge(stuAge);

        System.out.println("请输入要录入学生的家庭地址：");
        String stuAddress = sc.next();
        student.setAddress(stuAddress);

        students.add(student);
        System.out.println("该学生的信息成功录入学生管理系统...");
    }

    //删除学生信息
    public static void deleteStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除学生的Id");
        String stuId = sc.next();
        int index = getIndex(students, stuId);
        if (index >= 0) {
            students.remove(index);
            System.out.println("删除成功！");
        }
        else {
            System.out.println("该学生id不存在，即将返回初始菜单。");
        }

    }

    //修改学生信息
    public static void updateStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询学生的id：");
        String stuId = sc.next();
        int index = getIndex(students, stuId);
        if (index == -1) {
            System.out.println("该学生id不存在，即将返回初始菜单。");
            return;
        }

        Student student = students.get(index);
        System.out.println("请重新录入要修改学生的姓名：");
        String stuName = sc.next();
        student.setName(stuName);

        System.out.println("请重新录入要修改学生的年龄：");
        int stuAge = sc.nextInt();
        student.setAge(stuAge);

        System.out.println("请重新录入要修改学生的家庭地址：");
        String stuAddress = sc.next();
        student.setAddress(stuAddress);

        System.out.println("学生信息修改成功！");
    }

    //查询学生信息
    public static void queryStudent(ArrayList<Student> students) {
        int len = students.size();
        Student stu;
        if (len == 0) {
            System.out.println("当前无学生信息，请添加后再查询！");
            return;
        }
        System.out.printf("%5s %5s %5s %5s\n", "id", "姓名", "年龄", "家庭地址");
        for (Student student : students) {
            stu = student;
            System.out.printf("%5s %5s %5d %4s\n", stu.getId(), stu.getName(), stu.getAge(), stu.getAddress());
        }
    }
}
