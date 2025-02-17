package com.example.models;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String name;
	private int age;
	private int salary;
	private String designation;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", designation=" + designation + "]";
	}
	
	
}
