package com.xianfeng.microservice.user.service;

import com.xianfeng.microservice.user.dao.UserDao;
import com.xianfeng.microservice.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getUserByUid(Integer uid){
        return userDao.getUserByUid(uid);
    }

    public Integer addUsers(List<User> list){
        return userDao.addUsers(list);
    }

    public Integer updateUserByUid(User user){
        return userDao.updateUserByUid(user);
    }

    public Integer deleteUserByUid(List<String> uids){
        return userDao.deleteUserByUid(uids);
    }
}
