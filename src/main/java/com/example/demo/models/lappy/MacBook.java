package com.example.demo.models.lappy;

import org.springframework.stereotype.Component;

import jakarta.annotation.Priority;

@Component("mac")
@Priority(value = 1)
public class MacBook implements Laptop {
	
	public String toString() {
		return "Congrats, You have got Apple Mac Book";
	}
}
