package cn.itcast.day19.oncourse;

import java.io.File;
import java.io.IOException;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/11 10:40 - 20:10
 * @version: 1.0
 */

public class Filesss {
    public static void main(String[] args) throws IOException {
        show01();
    }

    private static void show01() throws IOException {
        File f01 = new File
                ("G:\\//\\//\\//\\//\\//\\//\\//\\//\\//" +
                        "\\Platform\\abc.txt");
//        f01 = 2018 JavaSE 就业班习题
        System.out.println("f01 = " + f01.getName());
//f01 = D:\ReKol\Documents\AutoSaveFromFeiq\2018 JavaSE
        System.out.println("f01 = " + f01.getAbsolutePath());
//f01 = D:\ReKol\Documents\AutoSaveFromFeiq\2018 JavaSE
        System.out.println("f01 = " + f01.getPath());
//        f01 = 8192
        System.out.println("f01 = " + f01.length());
//true
        System.out.println(f01.exists());
        System.out.println("f01.delete() = " + f01.delete());
        System.out.println(f01.exists());
        System.out.println("----------------------------");

        /*练习一: 创建文件及文件夹*/
        File f02 = new File("G:\\Something4Faster\\HaveFun\\a.txt");
        File f03 = new File(/*HaveFun*/"a.txt");
        /*getPath() 和 getAbsolutePath() 的区别.*/
//        f03 = G:\AllTheExercise\Magic\HaveFun
        System.out.println("f03 = " + f03.getAbsolutePath());
//        f03.getPath() = HaveFun
        System.out.println("f03.getPath() = " + f03.getPath());
//        f02 = G:\Something4Faster
        System.out.println("f02 = " + f02.getParent());

        /*练习二:检查文件是否存在,文件的创建
        描述:检查D盘下是否存在文件a.txt,如果不存在则创建该文件。
         * !f03.exists()*/
        if (/*!*/!f03.exists()) {
            f03.createNewFile();
            System.out.println(f03.exists());
        }
        /*定义父路径*/
        String parent = "G:\\Something4Faster\\HaveFun";
        /*练习三:单级文件夹的创建
        描述:在D盘下创建一个名为bbb的文件夹。
        */
        File f04 = new File("G:\\Something4Faster\\HaveFun", "bbb");
        if (!f04.exists()) {
            f04.mkdir();
            System.out.println("f04.bbb = " + f04.exists());
        }
        System.out.println("==========================");
        /*练习四:多级文件夹的创建
        描述:在D盘下创建一个名为ccc的文件夹，要求如下：
        1.ccc文件夹中要求包含bbb子文件夹
        2.bbb子文件夹要求包含aaa文件夹
        */
        File f05 = new File(parent, "ccc\\bbb\\aaa");
        if (f05.exists() == false) {
            f05.mkdirs();
            System.out.println("f05.mkdirs() = " + f05.exists());
        }
        /*练习五:删除文件和文件夹
        描述:
        将D盘下a.txt文件删除
        将D盘下aaa文件夹删除,要求文件夹aaa是一个空文件夹。
        */
        f03.delete();
        System.out.println("f03.getAbsolutePath() = "
                + f03.getAbsolutePath());
//        false
        System.out.println("f03.exists() = " + f03.exists());
        System.out.println("[][][][][[][][][][][]][][][]");
//        删除单级文件夹
        f04.delete();
        System.out.println("f04.exists() = " + f04.exists());
//
        System.out.println("f05 = " + f05.toString());
//        todo 怎么删除多级文件夹?
        boolean f05Del = f05.delete();
        System.out.println("f05Del = " + f05Del);
        System.out.println("f05 = " + f05.toString());

        /*练习六:获取文件信息:文件名,文件大小,
        文件的绝对路径,文件的父路径
        描述:
        获取D盘aaa文件夹中b.txt文件的文件名，
        文件大小，文件的绝对路径和父路径等信息，并将信息输出在控制台。*/

        /*public File getParentFile() 父文件夹路径, 返回文件对象.
        public String getParent()
        * */
        File file = new File(parent, "b.txt");
        file.createNewFile();
        System.out.println("file.getName() = " + file.getName());
        System.out.println("file.toString() = " + file.toString());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("file.getPath() = " + file.getPath());
        System.out.println("file.getParent() = " + file.getParent());
        System.out.println("file.getParentFile() = " + file.getParentFile());
        System.out.println("file.length() = " + file.length());

        /*描述:
            1.判断File对象是否是文件,是文件则输出：
            xxx是一个文件，否则输出：xxx不是一个文件。
            2.判断File对象是否是文件夹,是文件夹则输出：
            xxx是一个文件夹，否则输出：xxx不是一个文件夹。
            (xxx是文件名或文件夹名)*/
        File f1 = new File(parent);
        if (f1.isFile()) {
            System.out.println("f1.getName() = " + f1.getName());
        } else {
            System.out.println("f1.getName() + \"不是一个文件.\" = " + f1.getName() + "不是一个文件.");
        }
        if (f1.isDirectory()) {
            System.out.println("f1.getName() = " + f1.getName());
        } else {
            System.out.println(f1.getName() + "不是一个文件夹");
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
    /*练习八:文件夹的获取方法
        描述:
        获取指定文件夹下所有的文件，并将所有文件的名字输出到控制台。
        注意：不包含子文件夹下的文件
    * */
        File f2 = new File(parent);
//        s = b.txt
//        s = ccc
        String[] list = f2.list();
        for (String s : list) {
            System.out.println("s = " + s);
        }
//        b.txt
//          ccc
        File[] listFiles = f2.listFiles();
        for (File file1 : listFiles) {
            System.out.println(file1.getName());
        }
    }

}
