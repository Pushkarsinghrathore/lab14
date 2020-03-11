package com.capgemini.lab6;

public class NameException extends Exception{

	String msg;
	
	public NameException(String s) {
		super();
		this.msg=s;
	}
	@Override
	public String getMessage() {
		return msg;
	}
	
}
