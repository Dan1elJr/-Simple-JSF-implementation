package com.luv2code.jsf.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {
	
	
	private String firstname;
	private String lastname;
	
	//create no-arg constructor
	
	public Student () {
		
		
	}
	
	//define getter/setter methods

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	
	
	
}
