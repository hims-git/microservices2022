package com.him.firstexample;

import java.util.Date;

public class User {

	private Integer id;
	private Date birthDate;
	private String name;

	
	public User() {
		super();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(Integer id,  String name, Date birthDate) {
		super();
		this.id = id;
		this.birthDate = birthDate;
		this.name = name;
	}
	
	

}
