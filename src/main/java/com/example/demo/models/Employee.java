package com.example.demo.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee implements Person {
	
	@Value("Rajesh")
	private String name;
	
	@Value("25")
	private int age;
	
	@Value("30000")
	private int salary;
	
	@Value("Tester")
	private String designation;
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", designation=" + designation + "]";
	}
	
}
