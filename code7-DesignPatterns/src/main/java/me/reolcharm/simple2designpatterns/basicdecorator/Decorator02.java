/**
 * @Project: SimpleDesignPatterns
 * @Author: Reolcharm
 * @CreatedTime: 2018-10-19 21:33
 * @Description:
 **/
package me.reolcharm.simple2designpatterns.basicdecorator;

/**
 * 装饰2：穿上漂亮衣服
 */
public class Decorator02 implements Showable {
    private Showable showable;
    /*构造传入 装饰对象 */

    public Decorator02(Showable showable) {
        this.showable = showable;
    }

    @Override
    public void show() {
        System.out.print("二次打扮：");
        showable.show();
    }
}
