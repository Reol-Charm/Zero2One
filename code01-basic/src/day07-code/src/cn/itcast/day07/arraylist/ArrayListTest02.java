package cn.itcast.day07.arraylist;

import java.util.ArrayList;

/**
 * @Description:对象添加到集合
 * @Author: Rekol
 * @CreateDate: 2018/7/16 16:39
 * @version: 1.0
 */
class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class ArrayListTest02 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("Hello", 1);
        Student two = new Student("Woorld", 2);
        list.add(one);
        list.add(two);

        for (int i = 0; i < list.size(); i++) {//`list.fori` generate automatically
            Student s = list.get(i);//Definite a new Student variable to store the address value of Student.
            System.out.print("s.getName() = " + s.getName());
            System.out.println();
            System.out.println("list = " + list);//存储类的地址值.
            System.out.println("s.getAge() = " + s.getAge());
        }
    }
}
