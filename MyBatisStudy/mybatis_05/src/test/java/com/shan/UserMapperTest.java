package com.shan;


import com.shan.dao.UserMapper;
import com.shan.pojo.User;
import com.shan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void getUserList(){
        //获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserById(){
        //获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        sqlSession.close();
    }

    @Test
    public void addUser(){
        //获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int a = mapper.addUser(new User(11,"华强哥","huaqiang"));
        System.out.println(a);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updUser(){
        //获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updUser(9,"王五","123456");
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void delUser(){
        //获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.delUser(9);
        sqlSession.commit();
        sqlSession.close();
    }

}
