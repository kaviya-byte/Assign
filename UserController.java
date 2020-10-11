package com.controller;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

@ControllerAdvice
public class UserController {
	@RequestMapping(value="/first")
	public String lunchBreak(){
		{
			//logic -- service --Dao
			return "success";
		}
	}

}
