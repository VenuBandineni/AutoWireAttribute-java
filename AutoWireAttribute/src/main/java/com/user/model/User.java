package com.user.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user")
public class User {
@Value("venu")
String name;
@Value("0007")
int id;

@Autowired
@Qualifier("ktm")

BikeDetails details;

public User() {
	
}
public void toKnowAboutBike() {
	details.nameOfTheBike();
	details.ccOfTheBike();
	details.colorOfTheBike();
}
public User(String name, int id, BikeDetails details) {
	
	this.name = name;
	this.id = id;
	this.details = details;
}
@Override
public String toString() {
	return "User [name=" + name + ", id=" + id + ", details=" + details + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public BikeDetails getDetails() {
	return details;
}
public void setDetails(BikeDetails details) {
	this.details = details;
}

}
