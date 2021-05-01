package com.kuang.cookies;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.Date;

public class CookieDemo03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        PrintWriter out = resp.getWriter();

        //Cookie，服务器端从客户端获取时
        Cookie[] cookies = req.getCookies();  //这里返回数组，说明cookies可能存在多个
        //判断Cookies是否存在
        if (cookies!=null) {
            //如果cookies存在
            out.write("你上一次访问的名字是：");

            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                //获取cookie的值
                if (cookie.getName().equals("name")) {
                    URLDecoder.decode(cookie.getValue(), "UTF-8");
                    out.println(cookie.getValue());
                }

            }
        }else {
            out.write("这是你第一次访问本站");
        }

        Cookie cookie = new Cookie("name","秦疆");
        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
