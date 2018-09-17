package me.reolcharm.http.request.apipractice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "getHeader", value = "/MethodOfGetHttp")
public class MethodOfGetHttp extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("--------获取请求行数据---------");

        String method = request.getMethod();
        String contextPath = request.getContextPath();
//request.contextPath = /day02
//request.getServletPath() = /MethodOfGetHttp
//request.getRequestURI() = /day02/MethodOfGetHttp --> URI: Uniform Resource Identifier
//request.getRequestURL() = http://localhost/day02/MethodOfGetHttp
        System.out.println("-----------------" + contextPath);
        System.out.println("request.getServletPath() = " + request.getServletPath());
        System.out.println("request.getRequestURI() = " + request.getRequestURI());
        System.out.println("request.getRequestURL() = " + request.getRequestURL());
        System.out.println("request.getRemoteAddr() = " + request.getRemoteAddr());

        System.out.println("--------获取请求头数据---------");
        String referer = request.getHeader("referer");
        System.out.println("referer = " + referer);
        /* referer 防盗链*/
        if (referer != null) {
            if (referer.contains("/day02")) {
                System.out.println("防盗链...");
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("Welcome! Let's see something!");
            } else {
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("Went to the Real websites to see freedom.");
            }
        }
        System.out.println("--------获取请求体数据---------");
        /* 一: 获取到提交参数(请求体)中所有的键值对*/
         /* 1. 获取所有参数的map集合*/
        Map<String, String[]> parameterMap = request.getParameterMap();
        Set<String> keySet = parameterMap.keySet();
        /* 遍历 name 集合, 获取到 Map 中的每一个 key*/
        for (String name : keySet) {
//            Big Wrong!
           /* String value = request.getParameter(name);
            System.out.println("name = " + name);
            System.out.println("value = " + value);*/

           /* 2. 通过 key 找对应的 value(String[])*/
            String[] values = parameterMap.get(name);
            /* 打印 key*/
            System.out.println("name = " + name);
            for (String value : values) {
                /* 打印 value */
                System.out.println("value = " + value);
            }
        }
        /* 二: 获取所有请求的参数名称 */
        Enumeration<String> enumeration = request.getParameterNames();
        while(enumeration.hasMoreElements()){
            String name = enumeration.nextElement();
            System.out.println("enumeration.nextElement() = " + enumeration.nextElement());
            Iterator<String> stringIterator = enumeration.asIterator();
            System.out.println("stringIterator.next() = " + stringIterator.next());
//          /* 通过 name 在请求体中找对应的 value*/
            System.out.println("request.getParameter(name) = " + request.getParameter(name));
        }

    }

    /**
     * @Description:
     * @Param: [request, response]
     * @return: void
     * @Author: ReolCharm
     * @Date: 2018/9/16 0016
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
