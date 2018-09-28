package cn.itcast.day22.inclass.supplier_consumer;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/19 11:29
 * @version: 1.0
 */

public class SupplierDemo {
    /**
     * 函数式接口作为方法参数传递.
     */
    public static int get(Supplier<Integer> integerSupplier) {
        return integerSupplier.get();
    }

    private static void getConsumer(String name, Consumer<String> con) {
        con.accept(name);
    }

    /**@param str
     * @param con1
     * @param con2 */
    private static void andthenMethod(String str, Consumer<String> con1, Consumer/*Object*/<String> con2) {
        con1.accept(str);
        con2.accept(str);
    }

    public static void main(String[] args) {
//        get(() -> 22);
//        getConsumer("Hello?", o -> System.out.println(o + ""));
        andthenMethod("Java?!", (String str) -> System.out.println(str.toUpperCase().substring(0, 3)),
                (String str) -> System.out.println(str.toLowerCase().substring(0, 2)));

    }
}
