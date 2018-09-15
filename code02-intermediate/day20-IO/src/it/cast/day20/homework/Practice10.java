package it.cast.day20.homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/14 23:47
 * @version: 1.0
 */

public class Practice10 {
    public static void main(String[] args) throws IOException {
        practice10();
        practice11();
    }

    /*练习三:字符输出流写出字符数据并存到集合中
    需求说明：从控制台接收3名学员的信息，每条信息存储到一个Student对象中，
    将多个Student对象存储到一个集合中。输入完毕后，将所有学员信息存储到文件Student.txt中。
    每名学员信息存储一行，多个属性值中间用逗号隔开。
    */
    /*分析:
    * 1. */
    private static void practice11() {

    }

    /*练习二:字节输出流写出数据
    描述:
    从控制台循环接收用户录入的学生信息，
    输入格式为：学号-学生名字
    将学生信息保存到D盘下面的stu.txt文件中，
    一个学生信息占据一行数据。
    当用户输入end时停止输入。
    */
    /*分析:
     * 1. 字节或者字符输出流: 向文件中write() 数据
     * 2. 循环输入接收: Scanner 和 write 都在 while 中
     * 3. 输入的字符串 equals "end" 时结束
     * 4. 换行操作
     * 5. todo 可不可以用 属性集 来完成需求?
     * */
    /*步骤:
     * 1. 创建 OutputStream, 绑定输出"stu.txt" 路径
     * 2. 循环接收学生信息, 接收了就写入文件中,
     * 3. 判断跳出*/


    private static void practice10() throws IOException {
//            * 1. 创建 OutputStream, 绑定输出"stu.txt" 路径
        FileOutputStream fos = new FileOutputStream("D:\\stu.txt");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生信息: ");
            String info = sc.nextLine();
            fos.write(info.getBytes());
            fos.write(System.lineSeparator().getBytes());
            if (info.equals("end")) {
                break;
            }
        }
        fos.close();
    }
}
