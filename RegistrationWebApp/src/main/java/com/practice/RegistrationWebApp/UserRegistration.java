package com.practice.RegistrationWebApp;

import java.util.Arrays;

public class UserRegistration 
{
	private String Uname;
	private String EmailId;
	private String password;
	private byte gender;
	private String[] hobby;
	
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public byte getGender() {
		return gender;
	}
	public void setGender(byte gender) {
		this.gender = gender;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	
	@Override
	public String toString() {
		return "UserRegistration [Uname=" + Uname + ", EmailId=" + EmailId + ", password=" + password + ", gender="
				+ gender + ", hobby=" + Arrays.toString(hobby) + "]";
	}
	


}   
