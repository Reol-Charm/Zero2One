package cn.itcast.day09.extendspractice;

/* @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/19 11:00
 * @version: 1.0
 */

class PhoneZi extends PhoneFu {
    /*PhoneFu p = new PhoneFu();
    String name ="Apple";
    int price = 8888;*/
    String color;

    public PhoneZi() {
        super();
        System.out.println("This is the first and non-parameter constructor");
    }

    public PhoneZi(String name, int price, String color) {
        super(name, price);
        setColor(color);
        System.out.println("This is the second in PhoneZi");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void show() {
        System.out.println("Use the show() method.");
        System.out.println(getName());
        System.out.println(getPrice());
        super.method();
    }

    @Override
    public void method(){
        System.out.println("Hello, this is subclass's method");
    }


}
