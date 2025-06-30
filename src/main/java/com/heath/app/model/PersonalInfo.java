package com.heath.app.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name="personal_info")
public class PersonalInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;
    @Column(name = "full_name",nullable = false)
    private String fullName ;
    @Column(name = "city_name",nullable = false)
    private String cityName ;
    @Column(name = "pincode",nullable = false)
    private String pincode ;
    @Column(name = "gender",nullable = false)
    private String gender ;
    @Column(name = "profile_image_url",nullable = false)
    private String profileImageUrl ;
    @Column(name = "created_at")
    private LocalDateTime createdAt ;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt ;
    @Column(name = "created_by")
    private String  createdBy ;
    @Column(name = "updated_by")
    private String updatedBy ;
    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private UserLoginData user;

    public UserLoginData getUser() {
        return user;
    }

    public void setUser(UserLoginData user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
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



    @Override
    public String toString() {
        return "PersonalInfo{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", pincode='" + pincode + '\'' +
                ", gender='" + gender + '\'' +
                ", profileImageUrl='" + profileImageUrl + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", createdBy='" + createdBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +

                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonalInfo that = (PersonalInfo) o;
        return Objects.equals(id, that.id) && Objects.equals(fullName, that.fullName) && Objects.equals(cityName, that.cityName) && Objects.equals(pincode, that.pincode) && Objects.equals(gender, that.gender) && Objects.equals(profileImageUrl, that.profileImageUrl) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(createdBy, that.createdBy) && Objects.equals(updatedBy, that.updatedBy) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, cityName, pincode, gender, profileImageUrl, createdAt, updatedAt, createdBy, updatedBy);
    }
}
