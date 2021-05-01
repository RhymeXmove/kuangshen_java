<%--
  Created by IntelliJ IDEA.
  User: shanxin
  Date: 2021/4/30
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <h1>当前有人<span><%=this.getServletConfig().getServletContext().getAttribute("onlineCount")%></span>在线</h1>
  </body>
</html>
