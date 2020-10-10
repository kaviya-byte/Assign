package com.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1Main {

	public static void main(String[] args) {
		// container --> life cycle of the bean
		ApplicationContext context =  new ClassPathXmlApplicationContext("/com/demo1/spring-config.xml");
		Employee employee = (Employee) context.getBean("employee");
		employee.setEmpNo(10);
		employee.setEmpName("Hello");
		System.out.println(employee.getEmpNo());
		System.out.println(employee.getEmpName());
		

	}

}
