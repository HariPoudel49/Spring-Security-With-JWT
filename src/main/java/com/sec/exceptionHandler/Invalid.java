package com.sec.exceptionHandler;

import org.springframework.security.authentication.BadCredentialsException;

public class Invalid extends BadCredentialsException {
	public Invalid (String message){
		super(message);
	}
}
