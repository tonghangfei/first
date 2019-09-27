package com.example.demo.utils;

public enum RetCode {
    SUCCESS(200),
	FAIL(500);
	
    public int code;
 
	RetCode(int code){
		this.code = code;
	}
	

    
}
