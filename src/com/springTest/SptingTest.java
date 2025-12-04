package com.springTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.Employee;

public class SptingTest {

	
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
		
		/*
		 * Employee bean = context.getBean(Employee.class); // only type name
		 * System.out.println(bean);
		 */
		
		System.out.println("Another Way--> bean id and type name");
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println(emp);
		
		System.out.println("Another Way---> only bean id");
		Employee emp1 = (Employee)context.getBean("emp1");
		System.out.println(emp1);
		
		System.out.println("---------initialisation-------------------------");
		
		System.out.println("Another Way--> bean id and type name");
		Employee emp2 = context.getBean("emp", Employee.class);
		System.out.println(emp2);
	}
	
	
	
	
	
}
