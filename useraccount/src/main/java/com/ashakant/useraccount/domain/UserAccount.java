package com.ashakant.useraccount.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
@Table(name="useraccount") 
public class UserAccount {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@NotNull
	//@Column(name="userid")
	private long id;
	
	@NotNull
	@Size(max = 12)
	@Column(name="mobilenumber")
	private String mobilenumber;
	
	@NotNull
	@Column(name="email")
	private String email;
	
	@NotNull
	@Column(name="password")
	private String password;
	
	//@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "userAccount")
	//private UserAgents UserAgents 
	 
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
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
}
