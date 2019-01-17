package com.cg.loginException;

public class LoginException extends Exception{
	public static final String MESSAGE1 = "internal error. Try later!!";
	public LoginException() {
		super(MESSAGE1);
		
	}
	
	
	

}
