package com.spring;

public class Employee {

	private static int count=0;
	
	private int id ;
	private String name;
	private int age;
	private String designation;
	private double salary;
	
	public Employee() {
		this.id = ++count;
		System.out.println("Default Employee Object created with id : "+this.id);
	}

	public static int getCount() {
		return count;
	}
	
	public  int getId() {
		return id;
	}

	public static void setCount(int count) {
		Employee.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", designation=" + designation + ", salary="
				+ salary + "]";
	}
	
	
	
	
	
}
