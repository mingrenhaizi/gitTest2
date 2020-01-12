package com.ning.springboot.utils;

import java.util.HashMap;

public class BeanResult extends HashMap<String, Object> {

    public static BeanResult success(){
        BeanResult result = new BeanResult();
        result.put(STATUS,SUCCESS);//保存状态
        return result;
    }

    public static BeanResult success(Object data){
        BeanResult result = new BeanResult();
        result.put(STATUS,SUCCESS);//保存状态
        result.put(DATA,data);
        return result;
    }

    public static BeanResult fail(){
        BeanResult result = new BeanResult();
        result.put(STATUS,FAIL);//保存状态
        return result;
    }

    public static BeanResult fail(String msg){
        BeanResult result = new BeanResult();
        result.put(STATUS,FAIL);//保存状态
        result.put(MSG,msg);//保存错误信息
        return result;
    }

    private static final String SUCCESS = "S";
    private static final String FAIL = "F";
    private static final String DATA = "data";
    private static final String MSG = "msg";
    private static final String STATUS = "status";
}
