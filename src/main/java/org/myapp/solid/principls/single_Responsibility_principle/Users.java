package org.myapp.solid.principls.single_Responsibility_principle;

//Follows SRP: Separation of concerns.
public class Users {
	
	private Integer id;
	private String name;
	private String email;

	public Users(Integer id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

// Getter methods...
}
