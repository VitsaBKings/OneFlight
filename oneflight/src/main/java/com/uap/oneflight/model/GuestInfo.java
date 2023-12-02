package com.uap.oneflight.model;

import java.time.LocalDate;

public class GuestInfo {
	String id = "";
	String email = ""; 
	String password = "";
	String first_name = "";
	String middle_name = "";
	String last_name = "";
	LocalDate birthday = null; 
	int phone_number = 0;
	int passport_detail_id = 0;
	String role = "";
	boolean status = true;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return first_name;
	}
	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddleName() {
		return middle_name;
	}
	public void setMiddleName(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLastName() {
		return last_name;
	}
	public void setLastName(String last_name) {
		this.last_name = last_name;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public int getPhoneNumber() {
		return phone_number;
	}
	public void setPhoneNumber(int phone_number) {
		this.phone_number = phone_number;
	}
	public int getPassportDetailId() {
		return passport_detail_id;
	}
	public void setPassportDetailId(int passport_detail_id) {
		this.passport_detail_id = passport_detail_id;
	}
	 public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	} 
}
