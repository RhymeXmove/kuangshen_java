<%@ page contentType="text/html; utf-8" language="java" %>
<%@ page import="com.kuang.pojo.People" %>
<html>
<body>
<h2>Hello World!</h2>

<%--
    People people = new People();
    people.setId();
    people.setName();
    people.setAddress();

--%>

<jsp:useBean id="people" class="com.kuang.pojo.People" scope="page"/>

<jsp:setProperty name="people" property="name" value="wangwu"/>
<jsp:setProperty name="people" property="id" value="29"/>
<jsp:setProperty name="people" property="address" value="西安"/>


<%=people.getAddress()%>

姓名：<jsp:getProperty name="people" property="name"/>
id:<jsp:getProperty name="people" property="id"/>
地址：<jsp:getProperty name="people" property="address"/>

</body>
</html>
