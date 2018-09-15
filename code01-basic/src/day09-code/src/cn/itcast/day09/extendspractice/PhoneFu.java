package cn.itcast.day09.extendspractice;

/*
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/19 10:59
 * @version: 1.0
 */

class PhoneFu {
    private String name;
    private int price;

    public PhoneFu() {
    }

    public PhoneFu(String name, int price) {
        this.setName(name);
        this.setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void method() {
        System.out.println("fuMethod");
    }
}
