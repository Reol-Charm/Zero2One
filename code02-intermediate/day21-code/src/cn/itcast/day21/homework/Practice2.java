package cn.itcast.day21.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/15 19:19
 * @version: 1.0
 */

public class Practice2 {
    public static void main(String[] args) {
//        practice03();
        practice04();

    }

    /*练习四:高效字符流和集合的综合使用
    描述:
    分析以下需求，并用代码实现
        实现一个验证码小程序，要求如下：
        1. 在项目根目录下新建一个文件：data.txt,键盘录入3个字符串验证码，并存入data.txt中，要求一个验证码占一行；
        2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：在控制台提示验证成功，如果不存在控制台提示验证失败
    */
    private static void practice04() {
        Scanner sc = new Scanner(System.in);
        File file = new File("G:\\AllTheExercise\\Magic\\employ-code\\day21-code\\src\\cn\\itcast\\day21\\homework\\date.txt");
        ArrayList<String> list = new ArrayList<>();
//        读取输入的字符串, 并写入文件中.
        /*1. jdk 7 后的写法*/
        try (BufferedWriter bos = new BufferedWriter(
                new FileWriter(file, true));
             BufferedReader bis = new BufferedReader(
                     new FileReader(file))) {
            /*2. 键盘录入3个字符串验证码，并存入data.txt中,要求一个验证码占一行*/
            for (int i = 0; i < 3; i++) {
//                System.out.println("请输入验证码: ");
                System.out.println("请输入第" + (i + 1) + "个验证码: ");
                String s = sc.nextLine();
                bos.write(s);
//                bos.write(s.toCharArray());也可以.
                /*缓冲输出字符流中的特有方法之一*/
                bos.newLine();
                /*将 输入的字符串存储到 ArrayList 中*/
                list.add(s);
            }
//            验证
            System.out.println("请输入需要被校验的验证码: ");
            String line = sc.nextLine();
            /*3. 如果输入的验证码在data.txt中存在*/
            /*读取date中的数据, 并于line判断*/
            int len;
//            字符流中创建char类型 buffer.
            char[] chars = new char[1024];
//            while((len = (int) bis.read(bytes)) != -1){
            while ((len = bis.read(chars)) != -1) {
                /*判断集合中是否有该字符串.*/
                if (list.contains(line)) {
                    System.out.println("验证成功");
                } else {
                    System.out.println("验证失败");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*练习三:高效流文件复制
    描述:利用高效字节输入流和高效字节输出流完成文件的复制。
    要求：
    1.将C盘下的c.png文件复制到D盘下
    2.一次读写一个字节数组方式复制
    */
    private static void practice03() {
        try (BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("C:\\Users\\Rekol\\Pictures\\Screenshots\\屏幕截图(25).png"));
             BufferedOutputStream bos = new BufferedOutputStream(
                     new FileOutputStream("D:\\屏幕截图(25).png"))) {
            /*定义存储返回的有效字节个数*/
            int len;
            /*定义存储读取的指定长度的数据*/
            byte[] bytes = new byte[1024];
            /*循环读取文件*/
            while ((len = bis.read(bytes)) != -1) {
//                1kb, 好像不支持此格式的文件
//                bos.write((char) len);
//                bos.write(len);
                bos.write(bytes, 0, len);
            }
        } catch (IOException i) {

        }
    }
}
