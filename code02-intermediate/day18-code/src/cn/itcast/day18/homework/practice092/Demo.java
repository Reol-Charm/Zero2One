package cn.itcast.day18.homework.practice092;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/10 18:47
 * @version: 1.0
 */

public class Demo {
    public static void main(String[] args) {
        Goods gds = new Goods(100);
        NetShop02 shopNet = new NetShop02();
        ShopUnderLine shopUnderLine = new ShopUnderLine(gds);
        new Thread(shopNet,"官网");
        new Thread(shopUnderLine,"线下店");
    }
}
