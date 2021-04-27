package com.sqljdbc.transaction;

import com.utils.JdbcUtils;

import java.lang.reflect.ParameterizedType;
import java.sql.*;

public class TestTransaction {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            conn = JdbcUtils.getConnection();
            //关闭数据库自动提交，自动会开启事务
            conn.setAutoCommit(false);  //开启事务

            String sql1 = "UPDATE ACCOUNT SET money=money-100 where name='A'";
            st = conn.prepareStatement(sql1);
            st.executeUpdate();

            int x = 1/0; //模拟出错，失败自动回滚

            String sql2 = "UPDATE ACCOUNT SET money=money+100 where name='B'";
            st = conn.prepareStatement(sql2);
            st.executeUpdate();

            //事务完毕，提交事务
            conn.commit();
            System.out.println("transaction finished");
        } catch (SQLException e) {
            try {
                conn.rollback(); //回滚
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            JdbcUtils.release(conn,st,rs);
        }
    }
}
