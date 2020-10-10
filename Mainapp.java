package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.service.UserService;

public class Mainapp {

	public static void main(String[] args) {
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("/com/config/spring-config.xml");
		
		UserService userService = (UserService) applicationContext.getBean("hello");
		String str = userService.display("Happy");
		System.out.println(str);

	}

}
