package org.myapp.exception.handaling.custome;

public class ThrowDemo {
	
	public static void validate(int age) {
		if(age < 18) {
			throw new AgeNotValidException("Age of this candidate is less than 18 years.");
		}else {
			System.out.println("Welcome to vote");
		}
	}
	public static void main(String[] args) {
		//validate(10);
		validate(30);
		System.out.println("rest of code");	
	}
}
