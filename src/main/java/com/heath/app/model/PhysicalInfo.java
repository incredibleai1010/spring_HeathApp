package com.heath.app.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name="physical_info")
public class PhysicalInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;
    @Column(name = "user_id",nullable = false)
    private Integer userId ;
    @Column(name = "height_cm",nullable = false)
    private Double  heightCm;
    @Column(name = "weight_kg",nullable = false)
    private Double weightKg ;
    @Column(name = "bmi",nullable = false)
    private Double bmi ;
    @Column(name = "body_fat_percentage",nullable = false)
    private Double bodyFatPercentage ;
    @Column(name = "medical_condition",nullable = false)
    private boolean medicalCondition ;
    @Column(name = "current_fitness_level",nullable = false)
    private String current_fitness_level ;
    @Column(name = "created_at",nullable = false)
    private LocalDateTime createdAt ;
    @Column(name = "updated_at",nullable = false)
    private LocalDateTime updatedAt ;
    @Column(name = "created_by",nullable = false)
    private String  createdBy ;
    @Column(name = "updated_by",nullable = false)
    private String updatedBy ;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id",insertable = false, updatable = false)
    private UserLoginData userLoginData;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Double getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(Double heightCm) {
        this.heightCm = heightCm;
    }

    public Double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(Double weightKg) {
        this.weightKg = weightKg;
    }

    public Double getBmi() {
        return bmi;
    }

    public void setBmi(Double bmi) {
        this.bmi = bmi;
    }

    public Double getBodyFatPercentage() {
        return bodyFatPercentage;
    }

    public void setBodyFatPercentage(Double bodyFatPercentage) {
        this.bodyFatPercentage = bodyFatPercentage;
    }

    public boolean isMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(boolean medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public String getCurrent_fitness_level() {
        return current_fitness_level;
    }

    public void setCurrent_fitness_level(String current_fitness_level) {
        this.current_fitness_level = current_fitness_level;
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

    public UserLoginData getUserLoginData() {
        return userLoginData;
    }

    public void setUserLoginData(UserLoginData userLoginData) {
        this.userLoginData = userLoginData;
    }

    @Override
    public String toString() {
        return "PhysicalInfo{" +
                "id=" + id +
                ", userId=" + userId +
                ", heightCm=" + heightCm +
                ", weightKg=" + weightKg +
                ", bmi=" + bmi +
                ", bodyFatPercentage=" + bodyFatPercentage +
                ", medicalCondition=" + medicalCondition +
                ", current_fitness_level='" + current_fitness_level + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", createdBy='" + createdBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", userLoginData=" + userLoginData +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PhysicalInfo that = (PhysicalInfo) o;
        return medicalCondition == that.medicalCondition && Objects.equals(id, that.id) && Objects.equals(userId, that.userId) && Objects.equals(heightCm, that.heightCm) && Objects.equals(weightKg, that.weightKg) && Objects.equals(bmi, that.bmi) && Objects.equals(bodyFatPercentage, that.bodyFatPercentage) && Objects.equals(current_fitness_level, that.current_fitness_level) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(createdBy, that.createdBy) && Objects.equals(updatedBy, that.updatedBy) && Objects.equals(userLoginData, that.userLoginData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, heightCm, weightKg, bmi, bodyFatPercentage, medicalCondition, current_fitness_level, createdAt, updatedAt, createdBy, updatedBy, userLoginData);
    }
}
