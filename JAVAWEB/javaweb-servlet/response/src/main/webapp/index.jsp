<html>
<body
<%@ page contentType="text/html; charset=UTF-8"  %>>
<h2>Hello World!</h2>
<%--这里的路径需要寻找到项目的路径--%>
<%--${pageContext.request.contextPath}代表当前的项目--%>
<form action="${pageContext.request.contextPath}/login" method="get">
    用户名:<input type="text" name="username">
    密码:<input type="text" name="password">
    <input type="submit" value="提交">
</form>
</body>
</html>
