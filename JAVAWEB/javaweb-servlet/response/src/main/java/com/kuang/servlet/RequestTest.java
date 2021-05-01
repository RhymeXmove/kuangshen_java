package com.kuang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uername = "kuangshen";
        String password = "123456";
        System.out.println("进入了这个请求");
        String username2 = req.getParameter("username");
        String password2 = req.getParameter("password");

        if (uername.equals(username2) && password.equals(password2)){
            resp.sendRedirect("./success.jsp");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
