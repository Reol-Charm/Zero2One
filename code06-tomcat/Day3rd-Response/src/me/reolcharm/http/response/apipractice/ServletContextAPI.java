package me.reolcharm.http.response.apipractice;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

@WebServlet("/ServletContextAPI")
public class ServletContextAPI extends HttpServlet {
    /*源码:
//    1. Tomcat调用 service() 方法, 并传入 请求和响应 两个参数
   public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
       HttpServletRequest request;
       HttpServletResponse response;
       try {
//    1.2 并向下转型
           request = (HttpServletRequest)req;
           response = (HttpServletResponse)res;
       } catch (ClassCastException var6) {
           throw new ServletException("non-HTTP request or response");
       }
//    1.3 调用本类中的 service() 方法, 传入 HttpServletRequest 和 HttpServletResponse 两个参数.
       this.service(request, response);
   }
//    2. 调用本类中 service() 方法, 方法中进行对 请求方式进行判断.-->这也就是我们要重写的 doGet()/doPost() 方法.
   protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           String method = req.getMethod();
           long lastModified;
           if (method.equals("GET")) {
                this.doGet();
           } else if (method.equals("POST")) {
               this.doPost();
           } else if (){...}
   }
//    2.3 没有覆写 doPost 方法则返回给客户端(浏览器页面) 405 或者 400 的错误.
     protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String protocol = req.getProtocol();
       String msg = lStrings.getString("http.method_post_not_supported");
       if (protocol.endsWith("1.1")) {
           resp.sendError(405, msg);
       } else {
           resp.sendError(400, msg);
       }

   }
    */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*

            ServletContext对象获取：
                1. 通过request对象获取
			        request.getServletContext();
                2. 通过HttpServlet获取
                    this.getServletContext();
         */

        //1. 通过request对象获取
        ServletContext context1 = request.getServletContext();
        //2. 通过HttpServlet获取
        ServletContext context2 = this.getServletContext();
        /* 三种功能, 三个 api*/
        System.out.println("context2 = " + context2);
        System.out.println("context1 = " + context1);
        /* 1. 获取文件对应的MIME格式 */

        String mimeType = context1.getMimeType("index.jsp");
//        null
        System.out.println("mimeType = " + mimeType);

        String mimeType1 = context2.getMimeType("HelloResponse.html");
        System.out.println("mimeType1 = " + mimeType1);

        /* 2. 获取项目真实路径 */
//        realPath = G:\AllTheExercise\Magic\Zero2One
//        \code06-tomcat\out\artifacts\Day3rd_Response_war_exploded\ServletContextAPI.JAVA
        String realPath = context1.getRealPath("ServletContextAPI.JAVA");
        System.out.println("realPath = " + realPath);
        /* 3. 域对象set/get/remove */

        /* 4. 获取流对象*/
//        InputStream is = context1.getResourceAsStream();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
