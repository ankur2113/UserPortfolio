package com.Reset.PortfolioStarter.Entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "PortfolioDB")
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int uiD;
	private int age;
	private long uphone;
	private String ufirstName;
	private String ulastName;
	private String gender;
	private String uemail;
	private String uimage;
	
	@Transient
	public static final String SEQUENCE_NAME = "users_sequence";
	
	public int getUiD() {
		return uiD;
	}
	public void setUiD(int uiD) {
		this.uiD = uiD;
	}
	public User() {
		super();
	}
	public User( int uiD,int age, long uphone, String ufirstName, String ulastName, String gender, String uemail,
			String uimage) {
		super();
		this.uiD = uiD;
		this.age = age;
		this.uphone = uphone;
		this.ufirstName = ufirstName;
		this.ulastName = ulastName;
		this.gender = gender;
		this.uemail = uemail;
		this.uimage = uimage;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getUphone() {
		return uphone;
	}
	public void setUphone(long uphone) {
		this.uphone = uphone;
	}
	public String getUfirstName() {
		return ufirstName;
	}
	public void setUfirstName(String ufirstName) {
		this.ufirstName = ufirstName;
	}
	public String getUlastName() {
		return ulastName;
	}
	public void setUlastName(String ulastName) {
		this.ulastName = ulastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUimage() {
		return uimage;
	}
	public void setUimage(String uimage) {
		this.uimage = uimage;
	}
	@Override
	public String toString() {
		return "User [uiD=" + uiD + ", age=" + age + ", uphone=" + uphone + ", ufirstName=" + ufirstName
				+ ", ulastName=" + ulastName + ", gender=" + gender + ", uemail=" + uemail + ", uimage=" + uimage + "]";
	}
	
	

}
