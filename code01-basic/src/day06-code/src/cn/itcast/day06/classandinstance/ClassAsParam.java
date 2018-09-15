package cn.itcast.day06.classandinstance;


public class ClassAsParam {
    public static void main(String[] args) {
        cn.itcast.day06.classandinstance.Phone theOne = new cn.itcast.day06.classandinstance.Phone();
        theOne.color = "RED";
        theOne.price = 2345;
        asParam(theOne);
    }

    public static void asParam(cn.itcast.day06.classandinstance.Phone oneClass) {
        oneClass.color = "Another Red.";
        oneClass.sendMassage();
        System.out.println(oneClass.color);
        System.out.println("---------------");
    }

}
