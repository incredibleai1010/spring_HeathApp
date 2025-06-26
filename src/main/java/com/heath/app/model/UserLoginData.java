package com.heath.app.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name="userlogin")
public class UserLoginData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", nullable = false, unique = true)
	private Integer userId;
	@Column(name = "username",nullable = false)
	private String username ;
	@Column(name = "password",nullable = false)
	private String password ;
	@Column(name = "email", nullable = false, unique = true)
	private String email ;
	@Column(name = "date_joined",nullable = false)
	private LocalDateTime date_joined ;
	@Column(name = "last_login")
	private LocalDateTime last_login ;
	@Column(name = "status")
	private String status ;
	@Column(name = "created_at",nullable = false)
	private LocalDateTime  createdAt ;
	@Column(name = "updated_at",nullable = false)
	private LocalDateTime updatedAt ;
	@Column(name = "created_by",nullable = false)
	private String  createdBy ;
	@Column(name = "updated_by",nullable = false)
	private String updatedBy ;

	@OneToOne(mappedBy = "userLoginData", cascade = CascadeType.ALL)
	private PersonalInfo personalInfo;
	@OneToOne(mappedBy = "userLoginData", cascade = CascadeType.ALL)
	private PhysicalInfo physicalInfo;


	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsernme() {
		return username;
	}

	public void setUsernme(String usernme) {
		this.username = usernme;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getDate_joined() {
		return date_joined;
	}

	public void setDate_joined(LocalDateTime date_joined) {
		this.date_joined = date_joined;
	}

	public LocalDateTime getLast_login() {
		return last_login;
	}

	public void setLast_login(LocalDateTime last_login) {
		this.last_login = last_login;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}

	public PhysicalInfo getPhysicalInfo() {
		return physicalInfo;
	}

	public void setPhysicalInfo(PhysicalInfo physicalInfo) {
		this.physicalInfo = physicalInfo;
	}

	@Override
	public String toString() {
		return "UserLoginData{" +
				"userId=" + userId +
				", usernme='" + username + '\'' +
				", password='" + password + '\'' +
				", email='" + email + '\'' +
				", date_joined=" + date_joined +
				", last_login=" + last_login +
				", status='" + status + '\'' +
				", createdAt=" + createdAt +
				", updatedAt=" + updatedAt +
				", createdBy='" + createdBy + '\'' +
				", updatedBy='" + updatedBy + '\'' +
				", personalInfo=" + personalInfo +
				", physicalInfo=" + physicalInfo +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		UserLoginData that = (UserLoginData) o;
		return Objects.equals(userId, that.userId) && Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(email, that.email) && Objects.equals(date_joined, that.date_joined) && Objects.equals(last_login, that.last_login) && Objects.equals(status, that.status) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(createdBy, that.createdBy) && Objects.equals(updatedBy, that.updatedBy) && Objects.equals(personalInfo, that.personalInfo) && Objects.equals(physicalInfo, that.physicalInfo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(userId, username, password, email, date_joined, last_login, status, createdAt, updatedAt, createdBy, updatedBy, personalInfo, physicalInfo);
	}
}
