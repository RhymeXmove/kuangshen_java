package com.sqljdbc;

import com.utils.JdbcUtils;
import com.utils.JdbcUtils_DBCP;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSelect {

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = JdbcUtils_DBCP.getConnection(); //获取数据库连接
            st = conn.createStatement();
            String sql = "select id,username,address from user";

            rs = st.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getObject("id"));
                System.out.println(rs.getObject("username"));
                System.out.println(rs.getObject("address"));
                System.out.println("=====================================");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils_DBCP.release(conn, st, rs);
        }
    }
}
