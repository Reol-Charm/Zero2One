package cn.itcast.day22net.inclass.tcpflow;

import java.io.*;
import java.net.Socket;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/18 15:01
 * @version: 1.0
 */

public class TCPClient {
    public static void main(String[] args) throws IOException {
        /*1. creat Client socket*/
        Socket socket = new Socket("127.0.0.1", 6666);
        /*2. creat local InputStream, bind the local file.*/
        FileInputStream fis = new FileInputStream(new File(
                "D:\\ReKol\\Pictures\\网站上的壁纸", "tookbyReol.jpg"));
        /*3. socket call the getOutputStream(), to write files to Server.*/
        OutputStream os = socket.getOutputStream();
        /*4. Read local files and write it to Server.*/
//        int len;
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            /*4.2 write the local files to Server.*/
            os.write(bytes, 0, len);
        }

        /*5. Read the respond from Server.*/
        InputStream is = socket.getInputStream();
        byte[] bytes1 = new byte[1024];
        int len1 = is.read(bytes1);
        System.out.println(new String(bytes, 0, len1) + "\t" + "Ok, I know it.");

        /*6. close socket*/
        socket.close();
        fis.close();
    }
}
