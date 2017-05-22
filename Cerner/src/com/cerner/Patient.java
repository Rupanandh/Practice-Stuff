package com.cerner;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Patient {
	
	private String firstName,lastName,addressLine1,city,state,country,gender;
	private int age,patientId,phoneNumber,addressLine2;
	private Date DOB;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(int addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public Date getDOB() {
		setDOB(null);
		return DOB;
	}
	public void setDOB(Date dOB) {
		Calendar calendar = Calendar.getInstance();
		TimeZone.setDefault(TimeZone.getTimeZone("IST"));
		DOB=calendar.getTime();
		
	}
	
	
	public Date dateOfBirthConversion(Date dob)
	{
		/*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM//dd/yyyy HH:mm:ss");
		simpleDateFormat.setTimeZone(TimeZone.getDefault());
		System.out.println(simpleDateFormat.format(dob);*/
		return new Date();
	}
	
	
	
	

}
