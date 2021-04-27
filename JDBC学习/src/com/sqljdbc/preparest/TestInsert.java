package com.sqljdbc.preparest;

import com.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestInsert {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pst = null;

        try {
            conn = JdbcUtils.getConnection();
            String sql = "INSERT INTO user(id,username,address) VALUES(?,?,?)";
            pst = conn.prepareStatement(sql);  //预编译SQL，重写SQL,然后不执行

            pst.setInt(1, 22);
            pst.setString(2, "wangwu");
            pst.setString(3, "成华大道");

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.release(conn, pst, null);
        }
    }
}
