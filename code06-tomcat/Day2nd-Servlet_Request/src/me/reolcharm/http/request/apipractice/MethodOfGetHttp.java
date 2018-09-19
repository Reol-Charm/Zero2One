package me.reolcharm.http.request.apipractice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
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
        System.out.println("-----------------");
        System.out.println("contextPath = " + contextPath);
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
                response.getWriter().write("你好啊! Welcome! Let's see something!");
            } else {
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("Went to the Real websites to see freedom.");
            }
        }

        System.out.println("--------获取请求体数据·方法一: Map---------");
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
        System.out.println("------------获取请求参数名称·方法二: Names-------------");
        /* 二: 获取所有请求的参数名称 */
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String name = parameterNames.nextElement();
            System.out.println(name);
            /* 通过遍历得到的 name 去找到对应的 value*/
            String value = request.getParameter(name);
            System.out.println(value);
            System.out.println("--------");
        }
        String value = request.getParameter("username");
        System.out.println("value = " + value);

        /*获取请求体中的数据之流的使用*/
        System.out.println("--------获取请求体中的数据之流的使用-------");
        //1.设置流的编码
        request.setCharacterEncoding("utf-8");
        //获取请求参数username
        String username = request.getParameter("username");
        System.out.println(username);

        BufferedReader reader = request.getReader();
        String line = null;
        while ((line = reader.readLine()) != null) {
//
            System.out.println("line = " + line);
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
