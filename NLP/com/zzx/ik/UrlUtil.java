package com.zzx.ik;

import java.io.UnsupportedEncodingException;

public class UrlUtil {
    private final static String ENCODE = "GBK"; 

    public static String getURLDecoderString(String str) {
        String result = "";
        if (null == str) {
            return "";
        }
        try {
            result = java.net.URLDecoder.decode(str.replaceAll("%", "%25"), ENCODE);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String getURLEncoderString(String str) {
        String result = "";
        if (null == str) {
            return "";
        }
        try {
            result = java.net.URLEncoder.encode(str, ENCODE);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "测试1";
        String result=getURLEncoderString(str);
        System.out.println(result);
        System.out.println(getURLDecoderString(result));
        
    }

}