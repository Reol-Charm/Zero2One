/**
 * @Project: SimpleDesignPatterns
 * @Author: Reolcharm
 * @CreatedTime: 2018-10-19 20:45
 * @Description:
 **/
package me.reolcharm.simple2designpatterns.abstractdecorator;

public class Client {
    public static void main(String[] args) {
        new FoundationalMakeUp(new Girl()).show();
        System.out.println("------------");
//
        new RedLips(new FoundationalMakeUp(new Girl())).show();
    }
}
