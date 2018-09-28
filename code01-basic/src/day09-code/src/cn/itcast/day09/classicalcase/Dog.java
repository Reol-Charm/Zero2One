package cn.itcast.day09.classicalcase;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/20 19:55
 * @version:         1.0
 *
 */

class Animal {
    String name = "animal";

    public void print(Animal a) {
        System.out.println("动物:" + a.name);
    }
}

class Dog extends Animal {
    String name = "dog";

    //    谁调用, 就是谁的变量
    @Override
    public void print(Animal a) {
        System.out.println("狗:" + a.name);
    }

//    @Override 报错!
    public void print(Dog a) {
        System.out.println("狗:" + a.name);
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.print(new Animal());
    }
}