package org.myapp.solid.principls.single_Responsibility_principle;

//Violates SRP: This class handles both user data and user persistence.
public class User {
	
	private Integer id;
	private String name;
	private String email;

	public User(Integer id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	// Getter methods..........---

	// This method handles user persistence, which is a separate responsibility
	public User saveToDatabase() {
		// Code to save user to database
		return null;
	}
}
