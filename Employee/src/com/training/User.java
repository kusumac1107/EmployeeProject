package com.training;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class User {
private  int id;
private  String name;
private  String email;
public User(int id, String name, String email) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
}
public User() {
	
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}
