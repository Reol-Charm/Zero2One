package cn.itcast.day08.string;


/**
 * @Description:     Waiting for more exploration.
 * @Author: Rekol
 * @CreateDate: 2018/7/18 19:36
 * @version: 1.0
 */


public class ManyMethodsInStringClass {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        /*boolean tORF = (str2.equalsIgnoreCase(str1));
        boolean tOrF = str1.equals(str2);
        System.out.println("tOrF = " + tOrF);
        System.out.println(str2.equalsIgnoreCase(str));
        */
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str2.equalsIgnoreCase(str1));//对称性

        System.out.println(str1.length());//5
        System.out.println(str1.concat(str2));//Hellohello

        System.out.println(str1.concat(str2).charAt(6));//e
        System.out.println(str1.concat(str2).indexOf("oh"));//4

        System.out.println(str1.concat(str2).substring(4));//ohello, 左闭右开
        System.out.println(str1.concat(str2).substring(5, 9));//hell
        System.out.println(str1.concat(str2).substring(5, str1.concat(str2).length()));//hell0
        System.out.println(str1.concat(str2).length());     //10,字符串长度为10, 最后一位的索引值为9.
        //转换功能
        char[] str2char = str2.toCharArray();
        for (int i = 0; i < str2char.length; i++) {
            if (i != str2char.length - 1) {
                System.out.print("str2char = " + str2char[i] + "\t");
            } else {
                System.out.print("str2char = " + str2char[i] + "\n");
            }
        }
        System.out.println("---------------------------");

        //转换成字节数组
        byte[] str2byte = str2.getBytes();
        for (int i = 0; i < str2byte.length; i++) {
            System.out.print("str2byte = " + str2byte[i] + "\t");
        }
        System.out.println();

        String replace = str1.concat(str2).replace("ello", "eLLo");
        System.out.println("replace = " + replace);


        String email = "Reol_Frank@163.com";
        String[] s = email.split("@");
        for (int i = 0; i < s.length; i++) {
            if (i != s.length - 1) {
                System.out.print(s[i] + "#");
            } else {
                System.out.print(s[i]);
            }
        }


    }
    public static void getName(){

    }

}
