package com.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dao.MyRepo2;

@Entity 
@Table(name="status_table")
public class manager {
	
	@Override
	public String toString() {
		return "manager [id=" + complaintid + ", assignee=" + assignee +"]";
	}
	@Id
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Column(name="complaintid")
	private int complaintid;
	@Column(name="assignee")
	private String assignee;
	
	
	
	
	public manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public manager( int complaintid, String assignee) {
		super();
		this.complaintid = complaintid;
		this.assignee = assignee;
		
		
	}
	
}

