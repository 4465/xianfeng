package com.xianfeng.microservice.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("用户实体类")
public class User {

    @ApiModelProperty("自增id")
    private Integer id;

    @ApiModelProperty("用户id")
    private String userId;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("角色权限")
    private String auth;

    @ApiModelProperty("删除标记")
    private Boolean is_delete;

    @ApiModelProperty("创建时间")
    private String create_time;

    @ApiModelProperty("更新时间")
    private String update_time;

    public User(){}

    public User(String userId, String userName, String password, String auth, Boolean is_delete, String create_time, String update_time) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.auth = auth;
        this.is_delete = is_delete;
        this.create_time = create_time;
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", auth='" + auth + '\'' +
                ", is_delete=" + is_delete +
                ", create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                '}';
    }
}
