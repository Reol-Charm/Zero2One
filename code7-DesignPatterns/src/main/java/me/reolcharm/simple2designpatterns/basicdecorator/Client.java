/**
 * @Project: SimpleDesignPatterns
 * @Author: Reolcharm
 * @CreatedTime: 2018-10-19 20:45
 * @Description:
 **/
package me.reolcharm.simple2designpatterns.basicdecorator;

import me.reolcharm.simple2designpatterns.abstractdecorator.FoundationalMakeUp;

public class Client {
    public static void main(String[] args) {
        new Decorator01(new Girl()).show();
        System.out.println("------------");
        new Decorator02(new Decorator01(new Girl())).show();
//        二次打扮: 粉饰(女孩的素颜)
        System.out.println("------------");
        new FoundationalMakeUp(new Girl()).show();
    }
}
