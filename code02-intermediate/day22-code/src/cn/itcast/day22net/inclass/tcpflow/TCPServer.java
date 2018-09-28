package cn.itcast.day22net.inclass.tcpflow;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/18 15:01
 * @version: 1.0
 */

public class TCPServer {
    public static void main(String[] args) throws IOException {
        /*Creat the Server.*/
        ServerSocket serverSocket = new ServerSocket(6666);
        /*get the instance of client.*/
        Socket socket = serverSocket.accept();

        /*Get net InputStream.*/
        InputStream is = socket.getInputStream();

        /*Set the filepath store the upload.*/
//        File file = new File("upload", "tookbyReol.jpg");
        File file = new File("G:\\AllTheExercise\\Magic\\employ-code\\day22-code\\src\\cn\\itcast\\day22net\\inclass\\upload");
        /*judge whether it is a directory or not.*/
        if (!file.exists()) {
//            todo mkdir() 与 mkdirs() 的区别
            file.mkdirs();
        }
        /*creat local OutputStream, to write the source to filepath.bind the destination.*/
        FileOutputStream fos = new FileOutputStream(new File(file, "NiceSky.jpg"));

        /*Write the upload files (read) from client to destination .*/
        int len;
        byte[] bytes = new byte[1024];
        while ((len = is.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }

        /*finish the upload, then return the respond*/
        OutputStream os = socket.getOutputStream();
        os.write("Upload successful! ".getBytes());

        socket.close();
        fos.close();
    }
}
