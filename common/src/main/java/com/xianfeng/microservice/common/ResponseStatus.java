package com.xianfeng.microservice.common;

import lombok.Data;

@Data
public class ResponseStatus {
    private Integer ret_code;

    private String ret_message;

    public ResponseStatus(Integer ret_code, String ret_message){
        this.ret_code = ret_code;
        this.ret_message = ret_message;
    }
}
