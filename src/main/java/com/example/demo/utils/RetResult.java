package com.example.demo.utils;

import org.springframework.stereotype.Component;

@Component
public class RetResult<T> {
	public int code;
	public String msg;
	private T data;

	public int getCode() {
		return code;
	}

	public RetResult<T> setCode(RetCode retCode) {
		this.code = retCode.code;
		return this;
	}

	public RetResult<T> setCode(int code) {
		this.code = code;
		return this;
	}

	public String getMsg() {
		return msg;
	}

	public RetResult<T> setMsg(String msg) {
		this.msg = msg;
		return this;
	}

	public T getData() {
		return data;
	}

	public RetResult<T> setData(T data) {
		this.data = data;
		return this;
	}

}
