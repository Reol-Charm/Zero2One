package cn.itcast.day18.oncourse.lambdaexpression;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/10 9:11
 * @version: 1.0
 */

public class LambdaPractice {
    public static void main(String[] args) {
        Person[] arr = {
                new Person(22, "2"),
                new Person(11, "1"),
                new Person(33, "3")};

        /*Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/
        Arrays.sort(arr, (o1, o2) -> o1.getAge() - o2.getAge());
        Arrays.sort(arr, LambdaPractice::compare);
//        [Person{age=11, name='1'}, Person{age=22, name='2'}, Person{age=33, name='3'}]
        System.out.println(Arrays.toString(arr));
    }

    private static int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }


}

