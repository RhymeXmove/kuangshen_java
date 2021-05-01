package com.kuang.session;

import com.kuang.pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决中文乱码
        resp.setContentType("text/html；charset=utf-8");
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        //得到session
        HttpSession session = req.getSession();
        //给session中存东西
        session.setAttribute("name", new Person("秦疆", 1));
        //获取sessionID
        String id = session.getId();
        //判断session是否是新创建的
        if (session.isNew()) {
            resp.getWriter().write("session创建成功，ID"+id);
        } else {
            resp.getWriter().write("session已经在服务器中存在，ID"+id);
        }



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
