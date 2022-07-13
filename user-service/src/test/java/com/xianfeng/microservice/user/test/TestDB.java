package com.xianfeng.microservice.user.test;

import com.xianfeng.microservice.user.entity.User;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestDB {

    public void addUsers(List<User> list){

    }



    public static void main(String[] args) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        List<User> users = new ArrayList<>();
        users.add(new User("000000000", "刘威甫", "liu139342", "0", false, simpleDateFormat.format(new Date()).toString(), simpleDateFormat.format(new Date()).toString()));
        users.add(new User("000000001", "张三", "123456", "1", false, simpleDateFormat.format(new Date()).toString(), simpleDateFormat.format(new Date()).toString()));
        users.add(new User("000000002", "李四", "654321", "0", false, simpleDateFormat.format(new Date()).toString(), simpleDateFormat.format(new Date()).toString()));


    }
}
