package cn.itcast.day22net.inclass.brieftcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/18 13:09
 * @version: 1.0
 */

public class ClientTCP {
    public static void main(String[] args) throws IOException {
        /*creat client, and bind the server's IP and the port.*/
//        String loclhost = "127.0.0.1";
//        ConnectException: Connection refused: connect
        Socket socket = new Socket("127.0.0.1", /*63352*//*63343*/8877);
        /*get the instance of net I/O, to send or write out a message to server.*/
        OutputStream os = socket.getOutputStream();
        /*write the message.*/
        os.write("Hello? Server?".getBytes());

        /*get the instance of net InputStream, read in the return from the Server.*/
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
//        int len;
        int len = is.read(bytes);
//          ConnectException: Connection refused: connect
//        while ((len = is.read(bytes)) != -1) {
            System.out.println("The message from Server is that: " + new String(bytes,0,len));
//        }

        /*close I/O.*/
        os.close();
//        /*close client*/
//        s1.close();
    }
}
