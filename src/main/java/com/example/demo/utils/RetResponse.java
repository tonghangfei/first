package com.example.demo.utils;

import org.springframework.stereotype.Component;

@Component
public class RetResponse {
    private final static String SUCCESS="成功";
    private final static String FAILED="失败";
    
    public static<T> RetResult<T> makeOKRsp(){
    	return new RetResult<T>().setCode(RetCode.SUCCESS).setMsg(SUCCESS);
    }
    
    public static<T> RetResult<T> makeOKRsp(T date){
    	return new RetResult<T>().setCode(RetCode.SUCCESS).setMsg(SUCCESS).setData(date);
    }   
    
    public static<T> RetResult<T> makeOKRsp(int code,String msg,T date){
    	return new RetResult<T>().setCode(code).setMsg(msg).setData(date);
    } 

    public static<T> RetResult<T> makeFailRsp(){
    	return new RetResult<T>().setCode(RetCode.FAIL).setMsg(FAILED);
    }
    
    public static<T> RetResult<T> makeFailRsp(T date){
    	return new RetResult<T>().setCode(RetCode.FAIL).setMsg(FAILED).setData(date);
    }   
    
    public static<T> RetResult<T> makeFailRsp(int code,String msg,T date){
    	return new RetResult<T>().setCode(code).setMsg(msg).setData(date);
    }
}

