package papare4exam.javeee15secondexam.test01;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/23 18:22 - 19:11
 * @version:         1.0
 *
 */
/*5..定义Person类, 包含以下成员:

        成员属性:

        name (姓名)：String类型;

        height (身高) ：double类型;

        weight (体重) ：int类型，

        属性使用private修饰。

        成员方法:

        1).get/set方法

        2).无参无返回值的非静态showBMI()方法, 打印对象的姓名,体重,身高和体质指数:

        体质指数=体重÷(身高*身高);*/

import java.util.ArrayList;

class Person {
    private String name;
    private double height;
    private int weight;
//    public double bmi = weight / (height * height);

    public Person() {
    }

    public Person(String name, double height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /*打印对象的姓名,体重,身高和体质指数:

        体质指数=体重÷(身高*身高);*/
    public void showBMI() {
        System.out.println("name: " + getName()
                + "weight: " + getWeight()
                + "height" + getHeight()
                + "BMi: " + weight / (height * height));
    }
}

        /*2.定义Test类：在main()方法中，按以下要求编写代码:

                1） 分别实例化三个Person对象，三个对象分别为："小秋",1.72,72、"小红",1.58,44、"小白",1.80,55;

                2） 创建一个ArrayList集合，这个集合里面存储的是Person类型，分别将上面的三个Person对象添加到集合中


3）遍历这个集合，将集合中姓名为小白的对象，体重增加10kg，然后调用这个对象的showBMI方法展示这个对象的属性和体质指数.
        */

public class Test05 {
    public static void main(String[] args) {
        Person p1 = new Person("小秋", 1.72, 72);
        Person p2 = new Person("小红", 1.58, 44);
        Person p3 = new Person("小白", 1.80, 55);

        ArrayList<Person> plist = new ArrayList<Person>();

        plist.add(p1);
        plist.add(p2);
        plist.add(p3);

        for (int i = 0; i < plist.size(); i++) {
//            if(plist.get(i) == plist.get(plist.size() - 1)) {}
//            if(i == 2){
            if (plist.get(i).getName().equals("小白")) {
                plist.get(i).setWeight(65);
                plist.get(i).showBMI();
            }
        }
    }
}
