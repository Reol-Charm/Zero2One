package it.cast.day20.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/14 18:41
 * @version: 1.0
 */

public class Practice125 {
    public static void main(String[] args) throws IOException {
        practice01();
//        practice02();
//        practice03();
//        practice04();
//        practic   e05();

    }

    /*练习五:字节输入流一次读取一个字节数组数据
    描述:利用字节输入流读取D盘文件b.txt的内容，文件内容确定都为纯ASCII字符
    ,使用循环读取，一次读取一个字节数组，直到读取到文件末尾，将读取到的字节数组转换成字符串输出到控制台。
    */
    private static void practice05() throws IOException {
        /*1. 创建字节输入流对象*/
        FileInputStream fis = new FileInputStream("D:\\b.txt");
        /*创建字节数组缓冲区 存储读取的字节, 大小自己掌握*/
        byte[] bytes = new byte[2];
        /*定义变量容器，存储有效返回的个数*/
        int len;
        /*2. 调用read（byte[] b）
         *  int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。*/
        while ((len = fis.read(bytes)) != -1) {
            /**/
            System.out.print(new String(bytes, 0, len));
//            I love javav
//            System.out.print(new String(bytes));
            /*shut down*/
            fis.close();
        }
    }

    /*练习四:字节输入流一次读取一个字节数据
    描述:利用字节输入流读取D盘文件a.txt的内容，文件内容确定都为纯ASCII字符
    ,使用循环读取，一次读取一个字节，直到读取到文件末尾。
    将读取的字节输出到控制台
    */
    private static void practice04() throws IOException {
        /*creat instance of the input stream, and bind the input date source*/
        FileInputStream fis = new FileInputStream("D:\\a.txt");
        /*int read()方法        从输入流中读取数据的下一个字节。*/
        int len;
        while ((len = fis.read()) != -1) {
//           a--a-- todo fis.read(System.lineSeparator().getBytes());
            System.out.println((char) 13);
            System.out.print((char) len);
            System.out.print("--");
//            fis.read(System.lineSeparator().getBytes());
        }
        fis.close();
    }


    /*练习三:文件的续写和换行输出
    描述:在D盘下，有一c.txt 文件中内容为：HelloWorld
    在c.txt文件原内容基础上，添加五句 I love java，
    而且要实现一句一行操作(注：原文不可覆盖)。
    利用字节输出流对象往C盘下c.txt文件输出5句：”i love java”
    */
    private static void practice03() throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\c.txt", false);
        fos.write("HelloWorld".getBytes());
        fos.write(System.lineSeparator().getBytes());
        for (int i = 0; i < 5; i++) {
            fos.write("I love java".getBytes());
            fos.write(System.lineSeparator().getBytes());
        }

        fos.close();
    }

    private static void practice02() throws IOException {
        /*练习二:字节输出流写出字节数组数据
描述:利用字节输出流一次写一个字节数组的方式向D盘的b.txt文件输出内容:"i love java"。*/
        FileOutputStream fos02 = new FileOutputStream("D:\\b.txt");
        byte[] b0 = {'I', ' ', 'l', 'o', 'v', 'e', ' ', 'j', 'a', 'v', 'a'};
//        NumberFormatException:For input string: "I love java."
//        byte[] b1 = new byte[]{Byte.parseByte("I love java.")};
        fos02.write(b0);

        /*shut down the stream.*/
        fos02.close();
    }

    private static void practice01() throws IOException {
        File file = new File("day20-IO\\src\\a.txt");
        FileOutputStream fos = new FileOutputStream(file, true);
        /*练习一:字节输出流写出字节数据
描述:利用字节输出流一次写一个字节的方式，向D盘的a.txt文件输出字符‘a’。*/
        fos.write(97);
//         public static String lineSeparator()
        fos.write(System.lineSeparator().getBytes());
        fos.write('a');
        fos.close();
        System.out.println("file.getPath()= " + file.getPath());
        System.out.println("file.getAbsPath()= " + file.getAbsolutePath());
        System.out.println("file.length() = " + file.length());
//        4096
//4096
//文件夹也是占用内存的，虽然很少。当文件夹中有内容时，会有些关联映射。
        System.out.println(new File("G:\\AllTheExercise\\Magic\\Zero2One\\code02-intermediate\\day20-IO").length());
        System.out.println(new File("G:\\Program Files\\Internet Download Manager").length());

        /* 获取父路径.*/
        System.out.println("file.getParent() = " + file.getParent());
    }
}
