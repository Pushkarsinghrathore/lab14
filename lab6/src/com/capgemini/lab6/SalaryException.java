package com.capgemini.lab6;

public class SalaryException extends Exception {
	final String msg;

	public SalaryException(String s) {
		this.msg = s;
	}

	@Override
	public String getMessage() {
		return msg;
	}
}
