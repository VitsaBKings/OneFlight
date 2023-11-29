package com.uap.oneflight.model;

import java.util.Date;

public class PassportDetails {
	String passportType = ""; 
	String countryCode = "";
	String passportNumber = "";
	String firstName = ""; 
	String middleName = "";
	String lastName = "";
	String nationality = "";
	String sex = "";
	String placeOfBirth = "";
	String issuingAuthority = "";
	Date dateOfBirth = null;
	Date validUntil = null;
	int phoneNumber = 0;
	
	public String getPassportType() {
		return passportType;
	}
	public void setPassportType(String passportType) {
		this.passportType = passportType;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationality() {
		return nationality; 
	}
	public void setNationility(String nationality) {
		this.nationality = nationality; 
	}
	public String getSex() {
		return sex; 
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth; 
	}
	public String getIssuingAuthority() {
		return issuingAuthority;
	}
	public void setIssuingAuthority(String issuingAuthority) {
		this.issuingAuthority = issuingAuthority;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public LocalDate getValidUntil() {
		return validUntil;
	}
	public void setValidUntil(LocalDate validUntil) {
		this.validUntil = validUntil;
	}
}
