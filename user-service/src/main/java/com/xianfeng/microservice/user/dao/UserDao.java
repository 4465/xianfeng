package com.xianfeng.microservice.user.dao;

import com.xianfeng.microservice.common.Wrapper;
import com.xianfeng.microservice.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    /**
     * 根据uid查询用户信息
     * @param uid
     * @return
     */
    public List<User> getUserByUid(Integer uid);

    public Integer addUsers(List<User> list);

    public Integer updateUserByUid(User user);

    public Integer deleteUserByUid(List<String> uids);

}
