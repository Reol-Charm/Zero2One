package cn.itcast.day24_Stream.homework;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/22 20:46 - 57
 * @version: 1.0
 */

import cn.itcast.day24_Stream.inclass.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 问题：
 * 现在有两个 ArrayList 集合存储队伍当中的多个成员姓名，要求使用Stream方式进行以
 * 下若干操作步骤：
 * 1.第一个队伍只要名字为3个字的成员姓名；
 * 2.第一个队伍筛选之后只要前6个人；
 * 3.第二个队伍只要姓张的成员姓名；
 * 4.第二个队伍筛选之后不要前1个人；
 * 5.将两个队伍合并为一个队伍；
 * 6.根据姓名创建Student对象；
 * 7.打印整个队伍的Student对象信息。
 * <p>
 * 两个队伍（集合）的代码如下：
 */

public class Practice09 {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        one.add("陈玄风");
        one.add("梅超风");
        one.add("陆乘风");
        one.add("曲灵风");
        one.add("武眠风");
        one.add("冯默风");
        one.add("罗玉风");
        List<String> two = new ArrayList<>();
        two.add("宋远桥");
        two.add("俞莲舟");
        two.add("俞岱岩");
        two.add("张松溪");
        two.add("张翠山");
        two.add("殷梨亭");
        two.add("莫声谷");
        /*转换为流*/
        Stream<String> s1 = one.stream();
        Stream<String> s2 = two.stream();
        /*1.第一个队伍只要名字为3个字的成员姓名；filter
         * 2.第一个队伍筛选之后只要前6个人；limit
         * 3.第二个队伍只要姓张的成员姓名；filter
         * 4.第二个队伍筛选之后不要前1个人；skip
         * 5.将两个队伍合并为一个队伍；concat
         * 6.根据姓名创建Student对象；map
         * 7.打印整个队伍的Student对象信息。*/
        Stream<String> s3 = s1.filter(str -> str.length() == 3).limit(6);
        Stream<String> s4 = s2.filter(str -> str.startsWith("张")).skip(two.size() - 6);

        Stream<String> concats5 = Stream.concat(s3, s4);
        /**方法引用写法:
         *  ① 原始lambda表达式的业务代码只有一行
         * 	② 原始lambda表达式方法的参数列表和方法引用对应的方法参数列表一致
         * 	③ 原始lambda表达式的参数不允许参与运算*/
//        concats5.map(name -> new Person(name))
        concats5.map(Person::new)
//                .forEach(Person -> System.out.println("Person = " + Person));
                .forEach(System.out::println);
        /*
         Person = Person{name='陈玄风'}
         Person = Person{name='梅超风'}
         Person = Person{name='陆乘风'}
         Person = Person{name='曲灵风'}
         Person = Person{name='武眠风'}
         Person = Person{name='冯默风'}
         Person = Person{name='张翠山'}*/
    }
}

class Student {
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " Student {name='" + name + "'}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

