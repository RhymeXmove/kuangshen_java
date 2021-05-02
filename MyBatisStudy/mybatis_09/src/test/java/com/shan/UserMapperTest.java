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

        System.out.println("==================================================");

        UserMapper mapper2 = sqlSession.getMapper(UserMapper.class);
        List<User> userList2 = mapper2.getUserList();
        for (User user : userList2) {
            System.out.println(user);
        }
        sqlSession.close();
    }


}

