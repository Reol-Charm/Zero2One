package cn.itcast.day19.oncourse;


import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Objects;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/12 13:06
 * @version: 1.0
 */
/*练习四:文件过滤器的使用
描述:
获得指定文件夹下所有的java文件(不考虑子文件夹的)并输出到控制台
*/
public class FilterPractice {
//    private static scaNner scaNner;

    public static void main(String[] args) {
        /*获取文件路径字符串*/
        String input = scaNner.getInput();
        /*获取字符串对应的 File 类对象*/
        File iF = new File(input);
        /*调用方法筛选*/
//        fileFliter(iF);
        fileFliter02(iF);
    }

    private static void fileFliter02(File iF) {
        File[] listArray = iF.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                /*File(File parent, String child)
                pathname 的 File 对象*/
                return new File(dir, name).isDirectory() || name.toLowerCase().endsWith("java");
//                return new File(dir, name).getName().toLowerCase().endsWith(".java") || dir.isDirectory();
            }
        });
        for (File s : listArray) {
            if (s.isDirectory()) {
                fileFliter02(s);
            }
//G:\AllTheExercise\Magic\employ-code\day17-code\src\cn\itcast\day17\oncourse
//G:\AllTheExercise\Magic\employ-code\day17-code\src\cn\itcast\day17
//G:\AllTheExercise\Magic\employ-code\day17-code\src\cn\itcast
//G:\AllTheExercise\Magic\employ-code\day17-code\src\cn
//G:\AllTheExercise\Magic\employ-code\day17-code\src
            System.out.println(s);
        }
    }

    private static void fileFliter(File iF) {
        /*listFile(FileFilter)原理:
         * 1. 对传进来的目录参数进行遍历,
         * 2. 将每一个目录中的文件通过
         * File File(String child, File parent) 构造方法封装成 File 对象.
         * 3. 调用 FileFilter接口的 accept()
         * 4. 返回筛选后的 File[] */

        /*与 File[] listFile(String pathname) 的区别:
         * 都返回的是 File[]
         * 一个是筛选后的 File[], 另一个是全部文件夹及文件的 File对象数组.
         * */

        /*调用 File 类中的过滤器方法, 获得过滤后的 File[]*/
        /*设置过滤规则: 当文件后缀为 ".java" 或者筛选后的文件为文件夹时, 返回true*/
        File[] filefliter = iF.listFiles(new FileFilter() {
            @Override
            public boolean accept(File iF) {
                return iF.getName().toLowerCase().endsWith(".java") || iF.isDirectory();
            }
        });
        for (File file : Objects.requireNonNull(filefliter)) {
            if (file.isFile()) {
                System.out.println(file.getPath());
                /*仍是文件夹的话, 继续过滤文件夹.*/
            } else {
                fileFliter(file);
            }
        }
    }
}
