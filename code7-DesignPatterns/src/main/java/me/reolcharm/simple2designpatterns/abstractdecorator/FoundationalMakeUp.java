/**
 * @Project: SimpleDesignPatterns
 * @Author: Reolcharm
 * @CreatedTime: 2018-10-19 21:45
 * @Description:
 **/
package me.reolcharm.simple2designpatterns.abstractdecorator;

/**
 * @Param:
 * @Return:
 * @Author: Reolcharm
 * @Date: 2018/10/19-21:53
 * @Description: 第一层打扮：粉底
 */
public class FoundationalMakeUp extends BaseDecorator {

    public FoundationalMakeUp(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("粉底底饰(");
        /*子类没有去找父类*/
        showable.show();
        System.out.print(")");
    }
}
