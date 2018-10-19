/**
 * @Project: SimpleDesignPatterns
 * @Author: Reolcharm
 * @CreatedTime: 2018-10-19 20:43
 * @Description:
 **/
package me.reolcharm.simple2designpatterns.basicdecorator;


/**
 * 装饰1：粉饰素颜。
 */
public class Decorator01 implements Showable {//化妆品粉饰器

    /**
     * 持有某个善于展示的家伙
     */
    Showable showable;


    /**
     * 构造传入要装饰的对象，用成员方法接收，方便增强
     * //构造时注入这个家伙
     */
    public Decorator01(Showable showable) {
        this.showable = showable;
    }

    @Override
    public void show() {
        //化妆品粉饰
        System.out.print("粉饰(");
        //这家伙素面朝天的秀
        /* 等价于 girl.show();*/
        showable.show();
        //粉饰打完收工
        System.out.print(")");
    }

}