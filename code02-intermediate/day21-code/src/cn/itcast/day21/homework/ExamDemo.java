package cn.itcast.day21.homework;

import java.io.*;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/15 19:03
 * @version: 1.0
 */

public class ExamDemo {
    public static void main(String[] args) throws IOException {
//        exam03();
        exam04();
//        exam
    }

    private static void exam03() throws IOException {
        BufferedOutputStream bufo = new BufferedOutputStream(new FileOutputStream("itcast\\out.txt"));
        bufo.write("hello 黑马程序员".getBytes());
    }

    private static void exam04() throws IOException {
        File file = new File("G:\\AllTheExercise\\Magic\\employ-code\\day21-code\\src\\cn\\itcast\\day21\\homework\\copy.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
//        FileNotFoundException
//        BufferedWriter bw = new BufferedWriter(new FileWriter("itcast\\copy.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("G:\\AllTheExercise\\Magic\\employ-code\\day21-code\\src\\cn\\itcast\\day21\\homework\\copy.txt"));
        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
        }
        bw.close();
        br.close();
    }
}
