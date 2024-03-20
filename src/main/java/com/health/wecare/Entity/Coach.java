package com.health.wecare.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Coach {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String password;
  private String dob;
  private String gender;
  private String speciality;
  private Long number;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getSpeciality() {
	return speciality;
}
public void setSpeciality(String speciality) {
	this.speciality = speciality;
}
public Long getNumber() {
	return number;
}
public void setNumber(Long number) {
	this.number = number;
}
public Coach(Integer id, String name, String password, String dob, String gender, String speciality, Long number) {
	super();
	this.id = id;
	this.name = name;
	this.password = password;
	this.dob = dob;
	this.gender = gender;
	this.speciality = speciality;
	this.number = number;
}
public Coach() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Coach [id=" + id + ", name=" + name + ", password=" + password + ", dob=" + dob + ", gender=" + gender
			+ ", speciality=" + speciality + ", number=" + number + "]";
}
  
  
}
