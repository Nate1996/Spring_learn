package com.NATE.mapper;

import com.NATE.pojo.User;

import java.util.List;

public interface UserMapper {

    //查询所有用户
    List<User> selectUser();

    //添加一个用户
    int addUser(User user);

    //通过id删除用户
    int deleteUser(int id);
}
