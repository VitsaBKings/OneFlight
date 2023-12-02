package com.uap.oneflight.model;

import java.time.LocalDate;

public class PassportDetails {
	String passport_detail_id = "";
	String passport_type = ""; 
	String country_code = "";
	String passport_number = "";
	String first_name = ""; 
	String middle_name = "";
	String last_name = "";
	String nationality = "";
	String sex = "";
	LocalDate date_of_birth = null;
	String place_of_birth = "";
	LocalDate date_of_issue;
	LocalDate valid_until;
	String issuing_authority = "";
	
	public String getPassportDetailId() {
		return passport_detail_id;
	}
	public void setsetPassportDetailId(String passport_detail_id) {
		this.passport_detail_id = passport_detail_id;
	}
	public String getPassportType() {
		return passport_type;
	}
	public void setPassportType(String passport_type) {
		this.passport_type = passport_type;
	}
	public String getCountryCode() {
		return country_code;
	}
	public void setCountryCode(String country_code) {
		this.country_code = country_code;
	}
	public String getPassportNumber() {
		return passport_number;
	}
	public void setPassportNumber(String passport_number) {
		this.passport_number = passport_number;
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
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public LocalDate getDateOfBirth() {
		return date_of_birth;
	}
	public void setDateOfBirth(LocalDate date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getPlaceOfBirth() {
		return place_of_birth;
	}
	public void setPlaceOfBirth(String place_of_birth) {
		this.place_of_birth = place_of_birth;
	}
	public LocalDate getDateOfIssue() {
		return date_of_issue;
	}
	public void setDateOfIssue(LocalDate date_of_issue) {
		this.date_of_issue = date_of_issue;
	}
	public LocalDate getValidUntil() {
		return valid_until;
	}
	public void setValidUntil(LocalDate valid_until) {
		this.valid_until = valid_until;
	}
	public String getIssuingAuthority() {
		return issuing_authority;
	}
	public void setIssuingAuthority(String issuing_authority) {
		this.issuing_authority = issuing_authority;
	}
}
