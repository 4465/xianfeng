package com.xianfeng.microservice.util.encode;

import static org.junit.jupiter.api.Assertions.*;

class MD5UtilTest {

    public void encoderTest(){
        String str = "1234";
        String res = MD5Util.encoder(str);

        System.out.println(res);
        System.out.println(res.length());
    }

    public static void main(String[] args) {
        MD5UtilTest md5UtilTest = new MD5UtilTest();
        md5UtilTest.encoderTest();
    }

}