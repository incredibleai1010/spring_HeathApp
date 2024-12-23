package com.heath.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="user_data")
public class UserData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private Integer id;
	@Column(name = "last_name")
	private String LastName ;
	@Column(name = "first_Name")
	private String FirstName ;
	@Column(name = "mail_id", nullable = false, unique = true)
	private String mailId ;
	@Column(name = "passwrd",nullable = false)
	private String passwrd ;
	@Column(name = "height")
	private String height ;
	@Column(name = "weight")
	private String weight ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPasswrd() {
		return passwrd;
	}
	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "UserData [id=" + id + ", LastName=" + LastName + ", FirstName=" + FirstName + ", mailId=" + mailId
				+ ", passwrd=" + passwrd + ", height=" + height + ", weight=" + weight + "]";
	}
	
}
