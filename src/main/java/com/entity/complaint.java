package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.dao.MyRepo2;

@Entity @Table(name="complaint_table")
public class complaint {
	@Override
	public String toString() {
		return "complaint [id=" + cid + ", name=" + name + ", phone=" + phonenumber + ", email=" + email+ ",pincode=" + pincode
				+"]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String name;
	private int phonenumber;
	private String email;
	private String complaint1;
	private String pincode;
	
	
	
	
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public int getId() {
		return cid;
	}

	public void setId(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComplaint1() {
		return complaint1;
	}

	public void setComplaint1(String complaint1) {
		this.complaint1 = complaint1;
	}

	public complaint() {
		super();
		// TODO Auto-generated constructor stub
	}

	public complaint(String name, int phonenumber, String email ,String complaint1) {
		super();
		this.name = name;
		this.phonenumber = phonenumber;
		this.email= email;
		this.complaint1 = complaint1;
		
	}

	public Integer getcid() {
		// TODO Auto-generated method stub
		return null;
	}
	}
	
	
