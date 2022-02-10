package com.csscorp.exceptions.userdefined;

public class InsufficientExperienceException extends Exception{

	private String errorMsg="Insufficient Experience for the post";

	public InsufficientExperienceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InsufficientExperienceException(String errorMsg) {
		super();
		this.errorMsg = errorMsg;
	}

	@Override
	public String getMessage() {
		
		return this.errorMsg;
	}
	
	
}
