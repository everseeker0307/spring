package com.everseeker.spring.validator.utils;

/**
 * Created by everseeker on 16/8/9.
 */
public class StringUtils {
    //是否为空, 空返回true, 否则false
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }
}
