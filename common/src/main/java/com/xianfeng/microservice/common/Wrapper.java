package com.xianfeng.microservice.common;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel(description = "Api返回数据封装成Wrapper对象")
@Data
public class Wrapper<T> {

    private Integer code;

    private String message;

    private T result;

    public Wrapper(){
        super();
    }

    public Wrapper(Integer code, String message, T result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }

    @Override
    public String toString() {
        return "Wrapper{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
