package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="feedback")
public class engineer {

	
	@Override
	public String toString() {
		return "engineer [id=" + complaintid + ", status=" + status  + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	private int complaintid;
	
	private String status;
	
	
	public engineer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public engineer(int complaintid, String status) {
		super();
		this.complaintid = complaintid;
		this.status = status;
		
	}
	
	
}
