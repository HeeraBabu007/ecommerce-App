package com.mvc.springboot.rest.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserCredential {
	@Id
	int userid;
	String username;
	String password;
	String address;
	long mobile;
	Date dob;
	

	//setter & getter
	
	@Override
	public String toString() {
		return "UserCredential [userid=" + userid + ", username=" + username + ", password=" + password + ", address="
				+ address + ", mobile=" + mobile + ", dob=" + dob + "]";
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
}
