package com.service;

import org.springframework.stereotype.Service;
@Service
public class UserServiceimpl implements UserService {

	@Override
	public String display(String arg) {
		
		return "welcome to service layer";
	}

}
