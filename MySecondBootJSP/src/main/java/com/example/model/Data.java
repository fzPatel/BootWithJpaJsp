package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Data
{
@Id
String id;
String pass;
String name;
String address;
String city;



public Data()
{
	
}

public Data(String id,String pass,String name, String address, String city) {
	super();

	this.id = id;
	this.pass = pass;
	this.name = name;
	this.address = address;
	this.city = city;
}




public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getPass() {
	return pass;
}

public void setPass(String pass) {
	this.pass = pass;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

	
	
}
