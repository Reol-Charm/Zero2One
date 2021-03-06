package cn.itcast.day22net.inclass.optimizetcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/18 15:01
 * @version: 1.0
 */

public class TCPServer03 {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(4444);
////            SocketException: Socket is closed
//        Socket socket = serverSocket.accept();
        /*
                第五步优化：使用多线程技术,提高程序的效率
                有一个客户端上传文件,就开启一个线程,完成文件的上传
             */
        /*第六步优化：线程池优化线程任务，防止线程过多。
         * 线程数量设置有讲究。*/
        ExecutorService es = Executors.newFixedThreadPool(3);

        /*第三步优化:
         * 解决 持续上传的问题.*/
        while (true) {
// [58.379s][warning][os,thread] Failed to start thread
//An unrecoverable stack overflow has occurred.
//            ExecutorService es = Executors.newFixedThreadPool(5);
            es.execute(() -> {

                /*5.1步优化，线程中的异常, 只能被 try...catch.*/
                try {
                    Socket socket = serverSocket.accept();
                    System.out.println("服务器连接成功");
                    InputStream is = socket.getInputStream();
                    /*第四步，解决文件重名，文件被覆盖的问题。*/
                    File file = new File(
                            "G:\\AllTheExercise\\Magic\\employ-code\\day22-code\\src\\cn\\itcast\\day22net\\inclass\\upload");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
//           SocketException: Connection reset
//            文件命名中出现该句： /*serverSocket.toString()*/

                    File fileName = new File(System.currentTimeMillis() + "^_^" + new Random().nextInt(9999) + 1 + ".jpg");
                    FileOutputStream fos = new FileOutputStream(file + "\\" + fileName);

                    int len;
                    byte[] bytes = new byte[1024];
                    while ((len = is.read(bytes)) != -1) {
                        fos.write(bytes, 0, len);
                    }
                    System.out.println("接收成功。");

                    OutputStream os = socket.getOutputStream();
                    os.write("Upload successful! ".getBytes());
                    System.out.println("回写成功。");
                    socket.close();
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//
//                    /*5.1步优化，线程中的异常, 只能被 try...catch.*/
//                    try {
//                        Socket socket = serverSocket.accept();
//
//                        InputStream is = socket.getInputStream();
//                        /*第四步，解决文件重名，文件被覆盖的问题。*/
//                        File file = new File(
//                                "G:\\AllTheExercise\\Magic\\employ-code\\day22-code\\src\\cn\\itcast\\day22net\\inclass\\upload");
//                        if (!file.exists()) {
//                            file.mkdirs();
//                        }
////           SocketException: Connection reset
////            文件命名中出现该句： /*serverSocket.toString()*/
//
//                        File fileName = new File(System.currentTimeMillis() + "^_^" + new Random().nextInt(9999) + 1 + ".jpg");
//                        FileOutputStream fos = new FileOutputStream(file + "\\" + fileName);
//
//                        int len;
//                        byte[] bytes = new byte[1024];
//                        while ((len = is.read(bytes)) != -1) {
//                            fos.write(bytes, 0, len);
//                        }
//
//                        OutputStream os = socket.getOutputStream();
//                        os.write("Upload successful! ".getBytes());
//
//                        socket.close();
//                        fos.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }).start();
        }
    }
}
