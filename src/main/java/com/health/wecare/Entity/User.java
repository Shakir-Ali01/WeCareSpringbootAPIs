package com.health.wecare.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class User {
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  private Integer id;
	  private String name;
	  private String password;
	  private String dob;
	  private String gender;
	  private String email;
	  private Long number;
	  private String pincode;
	  private String city;
	  private String state;
	  private String country;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public User(Integer id, String name, String password, String dob, String gender, String email, Long number,
			String pincode, String city, String state, String country) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.dob = dob;
		this.gender = gender;
		this.email = email;
		this.number = number;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", dob=" + dob + ", gender=" + gender
				+ ", email=" + email + ", number=" + number + ", pincode=" + pincode + ", city=" + city + ", state="
				+ state + ", country=" + country + "]";
	}
	  
}
