/**
 * @Project: SimpleDesignPatterns
 * @Author: Reolcharm
 * @CreatedTime: 2018-10-19 21:22
 * @Description:
 **/
package me.reolcharm.simple2designpatterns.abstractdecorator;

/**
 * 抽取装饰类的字段和方法
 *
 * @author Reolcharm
 * @descrip 我们把化妆品类给改成抽象类，重写show方法，但不做任何粉饰了，
 * 这里我们留给子类具体的某个化妆品去做装饰吧。
 */
public abstract class BaseDecorator implements Showable {
    protected Showable showable;

    /**
     * 我们观察这种装饰器模式结构，是不是似曾相识呢？没错，其实装饰器模式在JDK里就有很多应用，比如Java IO包里的众多流处理类。
     * new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
     * <p>
     * 当然，流处理类当然要比我们的例子复杂的多，但其基本思想和我们去繁就简的例子异途同归，
     * 这些对象就好像是俄罗斯套娃一样层层包裹，层层装饰，每套一层就会多出一些功能出来，
     * 我们更可以自由搭配，实现不同的组合功能。
     * <p>
     * 所以，不管是女生化妆还是程序员写代码，我们都不可能弄出一个巨大的类然后去搞定所有事情，
     * 如此代码会越堆积越多，难于维护，功能扩展更是举步维艰。
     * 我们都需要有这种设计思想，每个化妆品部件各司其职，不做和自己不相关的事，
     * 然后把部件层层叠加，并根据需求组装成型，以达最终的装饰目的。
     */
    public BaseDecorator(Showable showable) {
        this.showable = showable;
    }

    @Override
    public void show() {
        showable.show();
    }
}
