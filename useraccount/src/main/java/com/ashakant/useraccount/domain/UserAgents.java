package com.ashakant.useraccount.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="useragents")
public class UserAgents {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id; 
	
	/**
	 * browser or mobile
	 */
	@NotNull
	private	String	devicetype;
	
	@NotNull
	private	String	platform;  
	
	@NotNull
	private String 	osversion;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "useraccounts_id")
	private UserAccount useraccount;  
	
	
	public UserAccount getUseraccount() {
		return useraccount;
	}

	public void setUseraccount(UserAccount useraccount) {
		this.useraccount = useraccount;
	}

	public UserAgents() {
		super() ;
	}
	
	public UserAgents(String a_devicetype,String a_platform,String a_version) {
		super() ;
		
		this.devicetype=a_devicetype;
		this.platform=a_platform;
		this.osversion=a_version;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDevicetype() {
		return devicetype;
	}

	public void setDevicetype(String devicetype) {
		this.devicetype = devicetype;
	}

	/**
	 * chrome/ie , android, ios etc
	 */
	
	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getOsversion() {
		return osversion;
	}

	public void setOsversion(String osversion) {
		this.osversion = osversion;
	}
}
