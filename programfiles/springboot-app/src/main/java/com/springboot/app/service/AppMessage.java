package com.springboot.app.service;

import org.springframework.stereotype.Service;

@Service
public class AppMessage implements AppMessageInterface{

	public String getMessage() {
		
		return "Hellooo";
	}

}
