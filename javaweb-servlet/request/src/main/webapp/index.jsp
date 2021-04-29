<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<div style="text-align: center">
    <form action="${pageContext.request.contextPath}/login" method="post">
        用户名：<input type="text" name="username">
        密码：<input type="password" name="password">
        爱好：<input type="checkbox" name="hobby" value="女孩">女孩
             <input type="checkbox" name="hobby" value="代码">代码
             <input type="checkbox" name="hobby" value="唱歌">唱歌
             <input type="checkbox" name="hobby" value="电影">电影
        <br/>
        <input type="submit" value="提交">
    </form>
</div>
</body>
</html>
