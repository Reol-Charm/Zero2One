package it.cast.day20.oncourse;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/14 10:54
 * @version: 1.0
 */

public class DemoFilesOutputStream {
    public static void main(String[] args) throws IOException {
//        FileNotFoundException (系统找不到指定的路径。)
//        FileOutputStream fos = new FileOutputStream("oncourse\\a.txt");
//        (文件名、目录名或卷标语法不正确。)
//        FileOutputStream fos = new FileOutputStream("/*day20-code\\*/a.txt");
        FileOutputStream fos = new FileOutputStream("a.txt", true);
//        NumberFormatException: For input string: "
//"
        fos.write(System.lineSeparator().getBytes());
        fos.write("Hello IO Stream!".getBytes());
        fos.close();



    }

}
