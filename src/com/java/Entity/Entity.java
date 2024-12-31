package com.java.Entity;

public class Entity {
	
	private int ID;
	private String Name;
	private String City;
	private String Email;
	private String Password;
	

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
	return "ID= " + ID + "| Name= " + Name + "| City= " + City + "| Email= " + Email + "| Password= " + Password;
	}
	
	


}
