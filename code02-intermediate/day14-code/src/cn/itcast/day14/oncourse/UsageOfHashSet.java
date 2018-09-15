package cn.itcast.day14.oncourse;

import java.util.HashSet;

/**
 * @Description: HashSet 存放自定义类型需要覆写hashCode() 和equals() 方法, 才能实现保证集合对象唯一.
 * @Author: Rekol
 * @CreateDate: 2018/8/2 20:54
 * @version: 1.0
 */

public class UsageOfHashSet {
    public static void main(String[] args) {
        HashSet<Student> studentHashSet = new HashSet<>();
        studentHashSet.add(new Student("HE",99));
        studentHashSet.add(new Student("E",2323));
        studentHashSet.add(new Student("DE",939));
        // 重复, 不会被添加.
        studentHashSet.add(new Student("DE",939));

        for(Student student : studentHashSet) {
            System.out.println("student = " + student);
        }
    }

}
