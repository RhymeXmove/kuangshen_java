package com.shan.dao;


import com.shan.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();
}
