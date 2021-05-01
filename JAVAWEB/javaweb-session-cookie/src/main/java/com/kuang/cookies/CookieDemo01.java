package com.kuang.cookies;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class CookieDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //服务器，告诉你，你来的时间，把这个时间封装成一个信件，你下次带来，我就知道你来了
        //解决中文乱码
        resp.setContentType("text/html");
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        PrintWriter out = resp.getWriter();

        //Cookie，服务器端从客户端获取时
        Cookie[] cookies = req.getCookies();  //这里返回数组，说明cookies可能存在多个
        //判断Cookies是否存在
        if (cookies!=null) {
            //如果cookies存在
            out.write("你上一次访问的时间是：");

            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                //获取cookie的值
                if (cookie.getName().equals("LastLoginTime")) {
                    //获取cookie的名字
                    long l = Long.parseLong(cookie.getValue());
                    Date date = new Date(l);
                    out.print(date.toLocaleString());
                }

            }
        }else {
            out.write("这是你第一次访问本站");
        }
        // 服务器给客户端响应一个cookie
        Cookie cookie = new Cookie("LastLoginTime", System.currentTimeMillis()+"");

        //设置cookie有效期，关闭浏览器不会删除cookie
        cookie.setMaxAge(24*60*60);

        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
