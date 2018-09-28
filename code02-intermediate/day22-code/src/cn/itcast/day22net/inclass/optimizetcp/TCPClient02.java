package cn.itcast.day22net.inclass.optimizetcp;

import java.io.*;
import java.net.Socket;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/18 15:01
 * @version: 1.0
 */

public class TCPClient02 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.21.22", 8848);
        FileInputStream fis = new FileInputStream(new File(
                "D:\\ReKol\\Pictures\\网站上的壁纸", "御用壁纸.jpg"));

        OutputStream os = socket.getOutputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }
        System.out.println("发送成功。");
        /*  第一步优化
            Debug!解决:上传完文件,给服务器写一个结束标记
            void shutdownOutput() 禁用此套接字的输出流。
            对于 TCP 套接字，任何以前写入的数据都将被发送，并且后跟 TCP 的正常连接终止序列。
         */
             socket.shutdownOutput();

        InputStream is = socket.getInputStream();

        byte[] bytes1 = new byte[5];
        int len1 = is.read(bytes1);
//        ��Ls�9�c\�V�G%\s4L	Ok, I know it.
//        StringIndexOutOfBoundsException: offset 0, count -1, length 1024
        System.out.println(new String(bytes, 0, len1) + "\t" + "Ok, I know it.");

        socket.close();
        fis.close();
    }
}
