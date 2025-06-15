package com.heath.app.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name="gym_registration")
public class GymRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gym_id", nullable = false, unique = true)
    private Integer id;
    @Column(name = "gym_name",nullable = false)
    private String gymName ;
    @Column(name = "address",nullable = false)
    private String address ;
    @Column(name = "city",nullable = false)
    private String city ;
    @Column(name = "state",nullable = false)
    private String state ;
    @Column(name = "pincode",nullable = false)
    private String pincode ;
    @Column(name = "google_maps_url",nullable = false)
    private String googleMapsUrl ;
    @Column(name = "contact_number",nullable = false)
    private String contactNumber ;
    @Column(name = "email_address",nullable = false)
    private String emailAddress ;
    @Column(name = "website",nullable = false)
    private String website ;
    @Column(name = "certified",nullable = false)
    private boolean certified ;
    @Column(name = "certification_details",nullable = false)
    private String certification_details ;
    @Column(name = "established_year",nullable = false)
    private int establishedYear ;
    @Column(name = "owner_name",nullable = false)
    private String ownerName ;
    @Column(name = "manager_name",nullable = false)
    private String managerName ;
    @Column(name = "emergency_contact",nullable = false)
    private String emergencyContact ;
    @Column(name = "created_at",nullable = false)
    private LocalDateTime  createdAt ;
    @Column(name = "updated_at",nullable = false)
    private LocalDateTime updatedAt ;
    @Column(name = "created_by",nullable = false)
    private String  createdBy ;
    @Column(name = "updated_by",nullable = false)
    private String updatedBy ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGymName() {
        return gymName;
    }

    public void setGymName(String gymName) {
        this.gymName = gymName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getGoogleMapsUrl() {
        return googleMapsUrl;
    }

    public void setGoogleMapsUrl(String googleMapsUrl) {
        this.googleMapsUrl = googleMapsUrl;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public boolean isCertified() {
        return certified;
    }

    public void setCertified(boolean certified) {
        this.certified = certified;
    }

    public String getCertification_details() {
        return certification_details;
    }

    public void setCertification_details(String certification_details) {
        this.certification_details = certification_details;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
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
        return "GymData{" +
                "id=" + id +
                ", gymName='" + gymName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode='" + pincode + '\'' +
                ", googleMapsUrl='" + googleMapsUrl + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", website='" + website + '\'' +
                ", certified=" + certified +
                ", certification_details='" + certification_details + '\'' +
                ", establishedYear=" + establishedYear +
                ", ownerName='" + ownerName + '\'' +
                ", managerName='" + managerName + '\'' +
                ", emergencyContact='" + emergencyContact + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", createdBy='" + createdBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GymRegistration gymData = (GymRegistration) o;
        return certified == gymData.certified && establishedYear == gymData.establishedYear && Objects.equals(id, gymData.id) && Objects.equals(gymName, gymData.gymName) && Objects.equals(address, gymData.address) && Objects.equals(city, gymData.city) && Objects.equals(state, gymData.state) && Objects.equals(pincode, gymData.pincode) && Objects.equals(googleMapsUrl, gymData.googleMapsUrl) && Objects.equals(contactNumber, gymData.contactNumber) && Objects.equals(emailAddress, gymData.emailAddress) && Objects.equals(website, gymData.website) && Objects.equals(certification_details, gymData.certification_details) && Objects.equals(ownerName, gymData.ownerName) && Objects.equals(managerName, gymData.managerName) && Objects.equals(emergencyContact, gymData.emergencyContact) && Objects.equals(createdAt, gymData.createdAt) && Objects.equals(updatedAt, gymData.updatedAt) && Objects.equals(createdBy, gymData.createdBy) && Objects.equals(updatedBy, gymData.updatedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gymName, address, city, state, pincode, googleMapsUrl, contactNumber, emailAddress, website, certified, certification_details, establishedYear, ownerName, managerName, emergencyContact, createdAt, updatedAt, createdBy, updatedBy);
    }
}
