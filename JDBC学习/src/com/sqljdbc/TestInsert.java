package com.sqljdbc;

import com.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = JdbcUtils.getConnection(); //获取数据库连接
            st = conn.createStatement();
            String sql = "INSERT INTO user(id,username,address) VALUES(1724461244,'张三','二仙桥')";

            int i = st.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
                JdbcUtils.release(conn, st, rs);
        }
    }
}
