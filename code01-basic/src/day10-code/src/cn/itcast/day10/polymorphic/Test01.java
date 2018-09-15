package cn.itcast.day10.polymorphic;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/21 21:25
 * @version:         1.0
 *
 */

    /**
由于多态特性的支持，showAnimalEat方法的Animal类型，是Cat和Dog的父类类型，父类类型接收子类对象，当
然可以把Cat对象和Dog对象，传递给方法。
当eat方法执行时，多态规定，执行的是子类重写的方法，那么效果自然与showCatEat、showDogEat方法一致，
所以showAnimalEat完全可以替代以上两方法。
不仅仅是替代，在扩展性方面，无论之后再多的子类出现，我们都不需要编写showXxxEat方法了，直接使用
showAnimalEat都可以完成。
所以，多态的好处，体现在，可以使程序编写的更简单，并有良好的扩展。*/
public class Test01 {
    public static void main(String[] args) {
//        polymorphic format:
        Animal c = new Cat();
        c.eat();
        Animal d = new Dog();
        d.eat();
        System.out.println("---------------");
        showAnimalEat(new Dog());
        showAnimalEat(c);
    }

    public static void showAnimalEat(Animal a) {//Automatic type conversion(cast) inside.
        a.eat();
    }

}
