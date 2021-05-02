package com.shan.dao;


import com.shan.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    @Select("select * from user")
    List<User> getUserList();

    // 方法存在多个参数，所有参数都要添加@Param
    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{pwd})")
    int addUser(User user);

    @Update("update user set name=#{name},pwd=#{pwd} where id=#{id}")
    int updUser(@Param("id") int id,@Param("name") String name,@Param("pwd") String pwd);

    @Delete("delete from user where id=#{uid}")
    int delUser(@Param("uid") int uid);
}
