package cn.itcast.day14.oncourse;

import java.util.HashSet;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/2 18:42
 * @version: 1.0
 */

public class Test {
    public static void main(String[] args) {
//todo 覆写hashcode() 和 equeals()的研究
        /*覆写了 h,e方法后, hashset 不会添加重复元素*/
        HashSet<Student> hs = new HashSet<Student>();
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 18);
        Student s3 = new Student("张三", 20);
        Student s4 = new Student("李四", 18);
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        for (Student s : hs) {
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
