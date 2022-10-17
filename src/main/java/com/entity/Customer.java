package com.entity;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "customer")
public class Customer
{
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	private String email;
	private String username;
	private String password;
	
	public Customer(int id, String email, String username, String password) 
	{
		this.id = id;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public Customer(String email, String username, String password) 
	{
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public Customer(int id, String email, String username)
	{
		this.id = id;
		this.email = email;
		this.username = username;
	}

	public Customer(String email, String username) 
	{
		this.email = email;
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	@Override
	public String toString() {
		return "Customers [id=" + id +", email="
				+ email + ", username="+username+", password=" + password + "]";
	}

		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}
}