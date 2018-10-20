package com.springboot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.service.AppMessageInterface;

@RestController
public class AppController {
	
	@Autowired
	@Qualifier("appMessage2")
	private AppMessageInterface appMessage;
	
	@Autowired
	@Qualifier("appMessage")
	private AppMessageInterface appMsg;
	
	@RequestMapping(value="/msg", method=RequestMethod.GET)
	public String getMessage(){
		return appMessage.getMessage();
	}
	
	@RequestMapping(value="/msg/m2", method=RequestMethod.GET)
	public String getMessageM2(){
		return appMsg.getMessage();
	}

}
