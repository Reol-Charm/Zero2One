package cn.itcast.day19.oncourse;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/11 12:45
 * @version: 1.0
 */

public class FilesMethod02 {
    public static void main(String[] args) throws IOException {

        File f1 = new File("G:\\Platform", "abc.txt");
//        false ----> true
        System.out.println(f1.exists());
        /*如果没有该文件则, 创建该文件.*/
        if (!f1.exists()) {
            f1.createNewFile();
        }
//        true
        System.out.println(f1.exists());
        /*创建文件夹*/
        f1.mkdir();
//        false
        System.out.println(f1.isDirectory());
//        true
        System.out.println(f1.isAbsolute());
//        true
        System.out.println(f1.isFile());
        /*描述:
        键盘录入一个文件路径，根据文件路径创建文件对象，判断是文件还是文件夹
        如果是文件，则输出文件的大小
        如果是文件夹，则计算该文件夹下所有文件大小之和并输出(不包含子文件夹)。
        */
        /*思路:
         * 1.
         * */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        input(f1, s);
    }

    private static void input(File file, String s) {
        
    }

}
