<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>

<%--
    get:上传文件大小有限制
    post：上传文件大小没有限制
--%>
<form action="${pageContext.request.contextPath}/upload.do" method="post" enctype="multipart/form-data">
    上传用户：<input type="text" name="username"> <br>
    <p><input type="file" name="file1"></p>
    <p><input type="file" name="file2"></p>
    <p><input type="submit"> | <input type="reset"> </p>
</form>
</body>
</html>
