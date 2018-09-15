package it.cast.day20.homework;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/14 19:55
 * @version: 1.0
 */

public class Practice629 {
    public static void main(String[] args) throws IOException {
//        practice06();
//        practice07();
//        practice08();
        practice09();
    }

    /*练习一:字节输入流使用
    描述:
    在D盘下有一个文本文件test.txt(里面的内容由数字和字母组成)
    定义一个方法统计test.txt文件中’a’字符出现的次数。
    比如a字符在文件中出现了10次则调用方法传入a后，方法内部输出：a出现10次
    */
/*操作步骤:
1.	创建字节输入流对象，循环从文件中读取一个字节
2.	定义一个整数变量用来统计字符出现的次数。
3.	将读取的字节转换字符跟传入的字符进行比较，相同则计数加一。
4.	输出结果。
*/
    private static void practice09() throws IOException {
//        File f = new File("G:\\AllTheExercise\\Magic\\employ-code\\day20-code\\src\\it\\cast\\day20\\homework\\test.txt");
        File f = new File("D:\\a.txt");
        /*1.1 */
        FileInputStream fis = new FileInputStream(f);
        /*1.2 */
        int len;
        /*3. */
        int count = 0;
        while ((len = fis.read()) != -1) {
            if ("a".equals((char) len + "")) {
                count++;
            }
        }
        System.out.println("a" + "出现了" + count + "次");
        fis.close();
        /*public static void main(String[] args) throws IOException {
		// 调用方法
		calcuteCount('a');
	}
	/*
	* 统计字符在文件中出现的次数
	*/

    }
/*Answer:*/
    public static void calcuteCount(char ch) throws IOException {
        // 创建字节输入流
        final FileInputStream fis = new FileInputStream("d:/test.txt");
        try (fis) {
            // 定义一个计数变量，统计字符出现的次数
            int count = 0;
            // 循环读取数据
            int len;
            while ((len = fis.read()) != -1) {
                // 判断字符c和外界传入的字符是否相同
                if (len == ch) {
                    count++;
                }
            }
            System.out.println(ch + "出现了" + count + "次");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /*练习八:IO对象Properties结合使用,设置properties文件
    描述:
    我有一个文本文件score.txt，我知道数据是键值对形式的，但是不知道内容是什么。
    请写一个程序判断是否有"lisi"这样的键存在，如果有就改变其实为"100"
    score.txt文件内容如下：
    zhangsan = 90
    lisi = 80
    wangwu = 85
    */
    private static void practice08() throws IOException {
        /*创建空的 Properties 对象， */
        Properties pro = new Properties();
        /*向属性集添加键值对元素*/
        pro.setProperty("zhangsan", "90");
        pro.setProperty("lisi", "80");
        pro.setProperty("wangwu", "85");
        /*打印属性集*/
//        {lisi=80, zhangsan=90, wangwu=85}
        System.out.println(pro);

        /*3. 遍历集合，获取到每一个key*/
        Set<String> propertySet = pro.stringPropertyNames();
        for (String key : propertySet) {
            String value = pro.getProperty(key);
            /*4. 判断当前的 key 是否为 "lisi"，如果是就把"lisi"的值设置为100*/
            if ("lisi".equals(key)) {
                pro.setProperty("lisi", "100");
            }
            /*5.把集合中所有的信息，重新存储到文件中*/
            pro.store(new FileOutputStream("G:\\AllTheExercise\\Magic\\employ-code\\day20-code\\src\\it\\cast\\day20\\homework\\score.txt"), "First Property operation.");
        }

        /*将 属性集元素 写入 "score.txt"*/
//        FileReader fr = new FileReader("score.txt");
        /*创建 Reader 对象*/
//        pro.load(fr.read(pro));

    }

    /*练习七:字符输出流写出字符数据
    项目需求：请用户从控制台输入信息，程序将信息存储到文件Info.txt中。
    可以输入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束。
    */
    private static void practice07() throws IOException {
        FileWriter fw = new FileWriter("G:\\AllTheExercise\\Magic\\employ-code\\day20-code\\src\\it\\cast\\day20\\homework\\Info.txt");
        Scanner sc = new Scanner(System.in);
        /*可以输入多条信息，每条信息存储一行*/
        while (true) {
            System.out.println("请输入：");
            String inp = sc.nextLine();
            /*”886”时，程序结束*/
            if ("886".equals(inp)) {
                fw.write(inp.toCharArray());
//                fw.write(inp);
                break;
            }
            /*将输入的内容写入文件中*/
            fw.write(inp.toCharArray());
            fw.write(System.lineSeparator());
        }
        fw.close();

//       wrong!!! 思路不清晰，审题不明。
        /* *//*1. 创建字符输出流对象，写入“Info.txt"*//*
        FileReader fr = new FileReader(inp);
        *//*2. 创建字符输入流对象，*//*
         *//*2. 定义有效字节字符个数*//*
        int len = 0;
        *//*3. 创建字符数组缓冲区*//*
        char[] chars = new char[10];
        *//*4. 将字符写入文件中*//*
        while ((len = fr.read(chars)) != -1) {
            fw.write(chars);
        }
        fw.close();
        fr.close();*/
    }

    /*练习六:字节流复制文件
描述:利用字节流将E盘下的a.png图片复制到D盘下(文件名保存一致)
要求：
一次读写一个字节的方式
*/
    /*1. 读取 D:\ReKol\Pictures\头像 下的图片文件，
     * 2. 写入 E:\ 下 */
    private static void practice06() throws IOException {
        /*1. 创建输入流对象，绑定源路径下文件*/
        FileInputStream fis = new FileInputStream("D:\\ReKol\\Pictures\\头像\\百折不挠空银子丶.JPG");
        /*2. 创建输出流对象，绑定目标路径文件。*/
        FileOutputStream fos = new FileOutputStream("E:\\百折不挠空银子丶.JPG");
        /*3. 读取源文件的所有字节*/
        /*3.1 声明变量存储有效字节*/
        int len;
        /*3.2 声明字节数组存储所有字节*/
        byte[] bytes = new byte[1024];
        /*3.3 遍历所有后跳出*/
        while ((len = fis.read(bytes)) != -1) {
            /*4. 将读取的字节写入目标路径文件*/
            fos.write(bytes, 0, len);
        }
        /*5. 后开先关。
         * 先读后写， 保证内存不再往硬盘里write，再去关闭read流
         * 保证循环内output的动作结束， 再去关闭input*/
        fos.close();
        fis.close();
    }

}
