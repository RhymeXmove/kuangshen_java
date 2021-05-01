<%--
  Created by IntelliJ IDEA.
  User: shanxin
  Date: 2021/4/30
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/servlet/login" method="GET">
    <label>
        <input type="text" name="username">
    </label>
    <input type="submit" value="提交">
</form>
</body>
</html>
