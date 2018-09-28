package cn.itcast.day21.homework;


import java.io.*;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/15 17:58
 * @version: 1.0
 */

public class Practice1 {
    public static void main(String[] args) throws IOException {
        practice01();

    }

    private static void practice01() throws IOException {
        File file = new File("G:\\AllTheExercise\\Magic\\employ-code\\day21-code\\src\\cn\\itcast\\day21\\homework\\HelloIO.txt");
        System.out.println("===========基本IO流====================");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(file);
        FileReader fr = new FileReader(file);
        FileWriter fw = new FileWriter(file);
        System.out.println("===========(高效)缓冲字节字符流=========");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        System.out.println("=============转换字节字符流=============");
//        FileReader 和 FileWriter extends InputStreamReader 或 OutputStreamWriter
        InputStreamReader isr = new InputStreamReader(fis, "utf-8");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
        System.out.println();
        byte[] bytes = new byte[1024];
//        fis.read(bytes)

    }

}
