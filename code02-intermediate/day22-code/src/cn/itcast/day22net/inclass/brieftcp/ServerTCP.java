package cn.itcast.day22net.inclass.brieftcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/18 12:41
 * @version: 1.0
 */

public class ServerTCP {
    public static void main(String[] args) throws IOException {
        /*creat server and set the port.*/
//        BindException: Address already in use: NET_Bind
        ServerSocket socket = new ServerSocket(/*63343*/8877);
        /*accept the instance of client*/
        Socket s1 = socket.accept();

        /*call the getInputStream(), get the instance of net I/O*/
        InputStream is = s1.getInputStream();

        /*use the net I/O, read in the message from client.*/
        byte[] bytes = new byte[1024];
        /*read() has a block effect. and only can */
        int len = is.read(bytes);
        System.out.println("I got the message from Client. And it is: " + new String(bytes,0,len));
////        ConnectException: Connection refused: connect
//        byte[] bytes = new byte[1024];
//        int len;
//        while ((len = is.read(bytes)) != -1) {
//            System.out.println("The message from Client is that: " + new String(bytes,0,len));
//        }

        /*After got the message and read it, return the client another message.*/

        /*Still using the instance of client's I/O, to write it.*/
        OutputStream os = s1.getOutputStream();
        /*call the write() to write the byte[] or int.*/
        os.write("Hello? client?".getBytes());

        /*close I/O*/
        s1.close();

    }
}
