package com.ashakant.useraccount.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="useragents")
public class UserAgents {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private String id;
	
	@NotNull
	@Column(name="devicetype")
	private	String	devicetype;
	
	@NotNull
	@Column(name="platform")
	private	String	platform; //browser , android, ios etc 
	
	@NotNull
	@Column(name="version")
	private String 	version;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name = "useraccountid", nullable = false)
	private UserAccount userAccount;
	
	public UserAgents() {
		super() ;
	}
	
	public UserAgents(String a_id,String a_devicetype,String a_platform,String a_version,String a_UserAccountId) {
		super() ;
		this.devicetype=a_devicetype;
		this.platform=a_platform;
		this.version=a_version;
		this.userAccount=new UserAccount(a_UserAccountId,"","","") ;
	}
	
	public UserAccount getUserAccount() {
		return userAccount;
	}
	
	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}
	
	public String get_devicetype() {
		return devicetype;
	}
	
	public void set_devicetype(String _devicetype) {
		this.devicetype = _devicetype;
	}
	
	public String get_platform() {
		return platform;
	}
	
	public void set_platform(String _platform) {
		this.platform = _platform;
	}
	
	public String get_version() {
		return version;
	}
	public void set_version(String _version) {
		this.version = _version;
	}
}
