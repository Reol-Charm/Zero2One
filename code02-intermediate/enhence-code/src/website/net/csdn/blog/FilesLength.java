package website.net.csdn.blog;

import java.io.File;

/**
 * @Author: Reol Charm
 * @CreateDate: 2018/9/4 10:50
 * @Description:
 */

public class FilesLength {
    public static void main(String[] args) {
        double dirSize = getDirSize(new File("E:\\收藏的电影"));
        System.out.println("dirSize = " + dirSize);
    }
    public static double getDirSize(File file) {
        //判断文件是否存在
        if (file.exists()) {
            //如果是目录则递归计算其内容的总大小
            if (file.isDirectory()) {
                File[] children = file.listFiles();
                double size = 0;
                for (File f : children)
                    size += getDirSize(f);
                return size;
            } else {//如果是文件则直接返回其大小,以“兆”为单位
                double size = (double) file.length() / 1024 / 1024;
                return size;
            }
        } else {
            System.out.println("文件或者文件夹不存在，请检查路径是否正确！");
            return 0.0;
        }
    }
}
