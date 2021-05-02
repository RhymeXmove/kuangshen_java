package com.shan;

import com.shan.dao.UserMapper;
import com.shan.pojo.User;
import com.shan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
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
    public void getUserLike(){
        //获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserLike("z");
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
        System.out.println(user.toString());
        sqlSession.close();
    }

    @Test
    public void getUserByIdandName(){
        //获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> objectMap = new HashMap<String, Object>();
        objectMap.put("userid", 7);
        objectMap.put("username", "zz");
        User user = mapper.getUserByIdandName(objectMap);
        System.out.println(user.toString());
        sqlSession.close();
    }

    @Test
    public void addUser(){
        //获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.addUser(new User(5, "haha", "123456"));
        if (res!=0){
            System.out.println("success");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void addUser2(){
        //获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> objectMap = new HashMap<String, Object>();
        objectMap.put("userid", 7);
        objectMap.put("username", "zz");
        objectMap.put("passWord", "aa");
        int res = mapper.addUser2(objectMap);
        if (res!=0){
            System.out.println("success");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updUser() {
        //获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.updUser(new User(4, "aa", "123456"));
        if (res!=0){
            System.out.println("success");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser() {
        //获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.deleteUser(5);
        if (res!=0){
            System.out.println("success");
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
