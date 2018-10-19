/**
 * @Project: SimpleDesignPatterns
 * @Author: Reolcharm
 * @CreatedTime: 2018-10-19 21:33
 * @Description:
 **/
package me.reolcharm.simple2designpatterns.abstractdecorator;

/**
 * 装饰2：穿上漂亮衣服
 */
public class RedLips extends BaseDecorator {

    /**构造传入 装饰对象 */
    public RedLips(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("涂口红(");
        showable.show();
        System.out.print(")");
    }
}
