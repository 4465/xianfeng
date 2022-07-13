package com.xianfeng.microservice.user.controller;

import com.xianfeng.microservice.common.Wrapper;
import com.xianfeng.microservice.user.entity.User;
import com.xianfeng.microservice.user.service.UserService;
import com.xianfeng.microservice.util.encode.MD5Util;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(value = "用户相关接口", tags = {"用户相关接口"})
@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @ApiOperation(value = "根据id查询用户，不传查询所有")
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public Wrapper<Map<String,Object>> getUserByUid(@RequestParam(value = "uid", required = false) Integer uid){
        logger.info("用户查询操作");
        logger.info("uid:" + uid);
        Wrapper wrapper = new Wrapper();
        Map map = new HashMap<>();
        try{
            List<User> list =userService.getUserByUid(uid);
            wrapper.setCode(0);
            wrapper.setMessage("查询成功");
            if(list.size() != 0){
                map.put("list",list);
                map.put("sum", list.size());
                wrapper.setResult(map);
            }
            else{
                map.put("list", new ArrayList<>());
                map.put("sum", 0);
                wrapper.setResult(map);
            }

        }catch(Exception e){
            logger.error("" + e);
            wrapper.setCode(999);
            wrapper.setMessage("查询失败");
        }
        return wrapper;
    }

    @ApiOperation(value = "单个或批量添加用户")
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public Wrapper<Map<String, Object>> addUsers(@RequestBody List<User> list){
//        System.out.println(list.toArray().toString());
        logger.info(list.toString());
        for(User user:list){
            user.setPassword(MD5Util.encoder(user.getPassword()));
        }
        Wrapper wrapper = new Wrapper();
        try{
            Integer i = userService.addUsers(list);
            if(i==0){
                wrapper.setCode(998);
                wrapper.setMessage("新增失败");
            }
            else {
                wrapper.setCode(0);
                wrapper.setMessage("新增成功");
            }
        }catch (Exception e){
//            System.out.println(e);
            logger.error("" + e);
            wrapper.setCode(999);
            wrapper.setMessage("新增失败");
        }
        return wrapper;
    }

    @ApiOperation(value = "修改用户信息", notes = "根据uid修改用户信息，修改密码除外")
    @RequestMapping(value = "/user/updateUserById", method = RequestMethod.POST)
    public Wrapper<Map<String,Object>> updateUser(@RequestBody User user){
//        System.out.println(user);
        logger.info(user.toString());
        Wrapper wrapper = new Wrapper();
        try {
            Integer i = userService.updateUserByUid(user);
            if(i==0){
                wrapper.setCode(999);
                wrapper.setMessage("更新失败");
            }else {
                wrapper.setCode(0);
                wrapper.setMessage("更新成功");
            }
        }catch (Exception e){
            System.out.println(e);
            wrapper.setCode(999);
            wrapper.setMessage("更新失败");
        }
        return wrapper;
    }

    @ApiOperation(value = "删除用户", notes = "按照uid删除，支持批量删除")
    @RequestMapping(value = "/user/deleteUserByUid", method = RequestMethod.POST)
    public Wrapper<Map<String, Object>> deleteUserByUid(@RequestBody List<String> uids){
        Wrapper wrapper = new Wrapper();
        logger.info(uids.toString());
//        System.out.println(uids.toString());
        try {
            Integer i = userService.deleteUserByUid(uids);
            if(i==0){
                wrapper.setCode(999);
                wrapper.setMessage("删除失败");
            }else {
                wrapper.setCode(0);
                wrapper.setMessage("删除成功");
            }
        }catch (Exception e){
            logger.error("" + e);
            wrapper.setCode(999);
            wrapper.setMessage("删除失败");
        }
        return wrapper;
    }
}
