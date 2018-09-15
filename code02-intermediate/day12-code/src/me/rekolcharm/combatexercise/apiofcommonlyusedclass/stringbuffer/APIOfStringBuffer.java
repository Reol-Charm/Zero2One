package me.rekolcharm.combatexercise.apiofcommonlyusedclass.stringbuffer;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/29 19:53-44
 * @version: 1.0
 */

public class APIOfStringBuffer {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();

        buf.append("Hello ");
//        insert();
        buf.insert(buf.length(), "World!");

        buf.reverse().reverse();
        System.out.println("buf = " + buf);

//        buf = Hello Wor; )ld!
        buf.replace(9, 9, "; )");
        System.out.println("buf = " + buf);

//        In String, use `replaceAll()` method.
        String str = "Hello Wor; )ld!";
        String s = str.replaceAll(";", "++");
        System.out.println("s = " + s);
        /*下面的片段总是显示: s.regex = Hello Wor++ )ld!的打印结果....原因在于没有存储....而且,String.valueOf(10)对打印结果没有作用...
        s.replaceAll(String.valueOf(10),String.valueOf(11));
//        s.regex = Hello Wor++ )ld!
        System.out.println("s.regex = " + s);*/

        /*将所有的指定字符替换成另一个...*/
        String s1 = s.replaceAll("l", "xx");
        System.out.println("s1 = " + s1);

        System.out.println("s = " + s);
        System.out.println("buf = " + buf);
        buf.replace(9, 12, "");
//        buf = Hello World!
        System.out.println("buf = " + buf);

        String s2 = buf.substring(6);
//        s3 = Worl --->>> [6,10)
        String s3 = buf.substring(6, 10);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        /*indexOf() */
        if (buf.indexOf("ll") == -1) {
            System.out.println("没有找到制定的内容.");

        } else {
            System.out.println("索引值位置是: " + buf.lastIndexOf("l"));
            System.out.println("索引值位置是: " + buf.lastIndexOf("r"));
        }

        String string = buf.toString();
        /*StringBuffer 的内容可以修改. 代码性能较高.*/
        /*buf = Hello World!012345678910*/
        for (int i = 0; i < string.length() - 1; i++) {
            buf.append(i);
        }
        System.out.println("buf = " + buf);
    }
}
