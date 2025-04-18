package com.raviinfotech.springstudentcrud.exception;

public class IdNotFound extends RuntimeException{

	private String msg;

	public IdNotFound(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String getMessage() {
		return msg;
	}
	
	
}
