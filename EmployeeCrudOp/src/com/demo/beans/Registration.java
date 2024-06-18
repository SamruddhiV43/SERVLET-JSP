package com.demo.beans;

public class Registration {

	private int id;
	private String name;
	private String uname;
	private String gender;
	private String email;
	private String city;
	public Registration() {
		super();
	}
	public Registration(int id, String name, String uname, String gender, String email, String city) {
		super();
		this.id = id;
		this.name = name;
		this.uname = uname;
		this.gender = gender;
		this.email = email;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Registration [id=" + id + ", name=" + name + ", uname=" + uname + ", gender=" + gender + ", email="
				+ email + ", city=" + city + "]";
	}
	
	
}
