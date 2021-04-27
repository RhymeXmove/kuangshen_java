package com.sqljdbc;

import com.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestLogin {
    public static void main(String[] args) {
        login(" 'or '1=1", " 'or '1=1");
    }

    public static void login(String username, String password) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = JdbcUtils.getConnection(); //获取数据库连接
            st = conn.createStatement();
            String sql = "select username,address from user where username='" + username + "' and address='"+password+"'";

            rs = st.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getObject("username"));
                System.out.println(rs.getObject("address"));
                System.out.println("=====================================");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.release(conn, st, rs);
        }
    }
}
