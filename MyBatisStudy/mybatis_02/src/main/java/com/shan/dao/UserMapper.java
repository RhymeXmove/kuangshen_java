package com.shan.dao;

import com.shan.pojo.User;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {
    List<User> getUserList();

    List<User> getUserLike(String key);

    User getUserById(int id);

    User getUserByIdandName(HashMap<String, Object> map);

    int addUser(User user);

    //万能的map
    int addUser2(HashMap<String, Object> map);

    int updUser(User user);

    int deleteUser(int id);

}
