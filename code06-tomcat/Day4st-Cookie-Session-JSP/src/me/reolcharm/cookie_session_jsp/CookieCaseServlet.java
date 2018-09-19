package me.reolcharm.cookie_session_jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "CookieCaseServlet", value = "/CookieCaseServlet")
public class CookieCaseServlet extends HttpServlet {
    /**
     * @Description: 完成主要业务逻辑: 访问页面后显示不同情况
     * @Param: [request, response]
     * @return: void
     * @Author: ReolCharm
     * @Date: 2018/9/19
     * 案例需求：
     * 1. 访问一个Servlet，如果是第一次访问，则提示：您好，欢迎您首次访问。
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /* 1. 获取 Cookie[] , 遍历后进行跳转.
         * 2. 如果没有获取到 Cookie , 则向页面显示"第一次访问, 欢迎", 并向浏览器发送 cookie
         *    其中 name 为 date, value为 Date 解析后并编码的字符串.
         * 3. 如果获取到 cookie ,则向页面展示获取到的 cookie 值, 向其中覆盖已有的 cookie 值.
         *    重新发送 cookie*/

        /**
         在服务器中的Servlet判断是否有一个名为lastTime的cookie
         1. 有：不是第一次访问
         1. 响应数据：欢迎回来，您上次访问时间为:2018年6月10日11:50:20
         2. 写回Cookie：lastTime=2018年6月10日11:50:01
         2. 没有：是第一次访问
         1. 响应数据：您好，欢迎您首次访问
         2. 写回Cookie：lastTime=2018年6月10日11:50:01
         */
        //设置响应的消息体的数据格式以及编码
        response.setContentType("text/html;charset=utf-8");

        Cookie[] cookies = request.getCookies();
        /* 第一次访问*/
        if (cookies == null || cookies.length == 0) {
            /* 1. 创建 cookie 的 value */
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String str_date = sdf.format(date);
            /* 2. 编码 对日期进行 */
            str_date = URLEncoder.encode(str_date, "utf-8");
            System.out.println("编码后：" + str_date);

            /* 3. 创建新的 cookie */
            Cookie c = new Cookie("last_time", str_date);
            c.setMaxAge(60 * 60 * 24);//一个小时
            /* 4. 发送 cookie*/
            response.addCookie(c);
            /* 5. 向页面回写 */
            response.getWriter().write("<h1>您好，欢迎您首次访问</h1>");
        }

        /* 2. 是第二次及以上访问 */
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                /* 2.1 获取到 cookie 的名称, 方便判断*/
                String dateName = cookie.getName();
                /* 2.2 判断名称是否是：lastTime*/
                if ("last_time".equals(dateName)) {
                    //重新设置 cookie
                    //获取当前时间的字符串，重新设置Cookie的值，重新发送cookie
                    /* 1. 创建 cookie 的 value */
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    String str_date = sdf.format(date);
                    /* 2. 对日期进行编码  */
                    str_date = URLEncoder.encode(str_date, "utf-8");
//                    /* 3. 重新设置 cookie 值*/
                    cookie.setValue(str_date);
                    //4. 设置cookie的存活时间
                    cookie.setMaxAge(60 * 60 * 24);//一个月
                    response.addCookie(cookie);

                    /* 向页面响应  解码, 上次访问时间*/
//                    获取Cookie的value，时间
                    String value = cookie.getValue();
                    value = URLDecoder.decode(value, "utf-8");
                    response.getWriter().write("<h1>欢迎回来，您上次访问时间为:" + value + "</h1>");

                    break;
                }
            }

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        this.doPost(request, response);
    }
}
