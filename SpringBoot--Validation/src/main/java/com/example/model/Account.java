package com.example.model;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.*;

public class Account {
	
	@Pattern(regexp="1|X|2")
	private String username;
	
	@NotEmpty
	@Length(min=3, max=10)
	private String password;;
	
	@NotNull
	@Min(18)
	@Max(50)
	private int age;
	
	@Email
	@NotEmpty
	private String email;
	
	@URL
	private String website;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String userName) {
		this.username = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
