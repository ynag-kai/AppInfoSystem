package com.jbit.utils;

import org.springframework.util.DigestUtils;

public class AppUtils {


    /**
     * MD5加密
     * @param str
     * @return
     */
    public static String encoderByMd5(String str){
        if(str==null){
            return null;
        }
        try {
            return DigestUtils.md5DigestAsHex(str.getBytes());
        }catch (Exception e){
            return null;
        }

    }

    public static void main(String[] args) {
        System.out.println(AppUtils.encoderByMd5("123456"));
    }
}
