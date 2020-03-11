package com.capgemini.lab6;

public class AgeException extends Exception {
	String msg;
	public AgeException(String s) {
      super();
      this.msg=s;
	}
	@Override
	public String getMessage() { 
		return msg;
	}
}
