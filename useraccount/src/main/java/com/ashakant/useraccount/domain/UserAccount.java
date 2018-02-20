package com.ashakant.useraccount.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name="useraccounts") 
public class UserAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private String id; 
	
	@NotNull
	@Column
	private String aadharNum;  
	
	@NotNull
	@Size(max = 12)
	@Column
	private String mobilenumber;
	
	@NotNull
	@Column
	private String email;
	
	@NotNull
	@Column
	private String password;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "useraccount")
	@Column
	private Set<UserAgents> useragents = new HashSet<>();


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getAadharNum() {
		return aadharNum;
	}

	public void setAadharNum(String aadharNum) {
		this.aadharNum = aadharNum;
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

	public Set<UserAgents> getUseragents() {
		return useragents;
	}

	public void setUseragents(Set<UserAgents> useragents) {
		this.useragents = useragents;
	}

	public UserAccount() {
		super() ;
	}
	
	public UserAccount(String a_aadharId,String a_mobilenumber,String a_email,String a_password) {
		super() ;
		this.aadharNum=a_aadharId ;
		this.mobilenumber=a_mobilenumber;
		this.email=a_email;
		this.password=a_password;
	}
	
	
}
