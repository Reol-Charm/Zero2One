package cn.itcast.day06.classandinstance;

public class ClassAsReturn {
    public static void main(String[] args) {
        Phone storage = getReturnClass(); //实例新的对象存储方法返回值.
        System.out.println();
        storage.call("test");//get one method
        // of Phone;
        System.out.println("storage = " + storage);//地址值一样.
    }

    public static Phone getReturnClass() {
        Phone clret = new Phone();
        clret.color = "Redddd";
        clret.price = 8989;
        clret.call("Reol");
        System.out.println("clret = " + clret);
        return clret;

    }
}
