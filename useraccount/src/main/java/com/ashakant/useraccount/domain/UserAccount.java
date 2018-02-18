package com.ashakant.useraccount.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="useraccount") 
public class UserAccount {

	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	//@Column(name="id")
	private String id;  
	
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
	//private UserAgents userAgents; 
	
	public UserAccount() {
		super() ;
	}
	
	public UserAccount(String a_id,String a_mobilenumber,String a_email,String a_password) {
		super() ;
		this.id=a_id ;
		this.mobilenumber=a_mobilenumber;
		this.email=a_email;
		this.password=a_password;
		//this.userAgents=new UserAgents(a_id,"","","","") ;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	 
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
