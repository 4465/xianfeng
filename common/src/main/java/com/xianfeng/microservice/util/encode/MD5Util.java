package com.xianfeng.microservice.util.encode;

import java.security.MessageDigest;

public class MD5Util {
    /**
     * 加盐方式MD5加密
     * @param str
     * @return buffer.toString()
     */
    public static String encoder(String str){
        try{
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] result = digest.digest(str.getBytes());
            StringBuffer buffer = new StringBuffer();

            for(byte b:result){
                int number = b&0xff;
                String s = Integer.toHexString(number);
                if(s.length() == 1){
                    buffer.append("0");
                }
                buffer.append(s);
            }
            //标准MD5加密后的结果
            return buffer.toString();
        } catch (Exception e){
            e.printStackTrace();
            return "";
        }
    }
}
