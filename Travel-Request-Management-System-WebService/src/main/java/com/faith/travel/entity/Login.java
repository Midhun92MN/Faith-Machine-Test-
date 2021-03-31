package com.faith.travel.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lId;
	private String username;
	private String password;
	private String userType;

//	@JsonIgnore
//	@OneToOne(mappedBy = "login")
//	private Employee employee;

	// Default Constructor
	public Login() {
		super();
	}

	// Parameterized Constructor
	public Login(int lId, String username, String password, String userType) {
		super();
		this.lId = lId;
		this.username = username;
		this.password = password;
		this.userType = userType;
	}

	// Getters and Setters
	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

}
