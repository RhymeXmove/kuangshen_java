package com.sqljdbc;

import java.sql.*;

public class JdbcFirstDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver"); //固定写法，加载驱动

        //2.用户信息url
        String url = "jdbc:mysql://localhost:3306/test01?useUnicode=true&characterEncoding=utf8&useSSL=false";
        String name = "root";
        String password = "123456";

        //3.连接成功, 数据库对象 Connection  代表数据库
        Connection connection = DriverManager.getConnection(url, name, password);

        //4.执行SQL的对象 Statement 执行SQL的对象
        Statement statement = connection.createStatement();

        //5.执行SQL的对象 去执行 SQL ，可能存在结果， 查看返回对象
        String sql = "SELECT * FROM user";

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            System.out.println("id=" + resultSet.getObject("id"));
            System.out.println("username=" + resultSet.getObject("username"));
            System.out.println("address=" + resultSet.getObject("address"));
            System.out.println("=====================================");
        }

        //6.释放连接
        resultSet.close();
        statement.close();
        connection.close();

    }
}
