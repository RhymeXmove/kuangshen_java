package com.kuang.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlineCountListener implements HttpSessionListener {
    //创建session监听，看你的一举一动
    //一旦创建session就会触发一次这个事践
    public void sessionCreated(HttpSessionEvent se) {
        ServletContext ctx = se.getSession().getServletContext();
        Integer onlineCount = (Integer) ctx.getAttribute("OnlineCount");
        if (onlineCount==null) {
            onlineCount = 1;
        }else {
            int count = onlineCount;
            onlineCount = count + 1;
        }
        ctx.setAttribute("onlineCount", onlineCount);
    }
    //销毁session监听
    public void sessionDestroyed(HttpSessionEvent se) {

    }
}
