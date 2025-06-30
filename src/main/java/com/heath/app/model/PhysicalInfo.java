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
    @Column(name = "current_fitness_level")
    private String current_fitness_level ;

    @Column(name = "additional_notes")
    private String additionalNotes ;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
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

    public UserLoginData getUser() {
        return user;
    }

    public void setUser(UserLoginData user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PhysicalInfo that = (PhysicalInfo) o;
        return medicalCondition == that.medicalCondition && Objects.equals(id, that.id) && Objects.equals(heightCm, that.heightCm) && Objects.equals(weightKg, that.weightKg) && Objects.equals(bmi, that.bmi) && Objects.equals(bodyFatPercentage, that.bodyFatPercentage) && Objects.equals(current_fitness_level, that.current_fitness_level) && Objects.equals(additionalNotes, that.additionalNotes) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(createdBy, that.createdBy) && Objects.equals(updatedBy, that.updatedBy) && Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, heightCm, weightKg, bmi, bodyFatPercentage, medicalCondition, current_fitness_level, additionalNotes, createdAt, updatedAt, createdBy, updatedBy, user);
    }

    @Override
    public String toString() {
        return "PhysicalInfo{" +
                "id=" + id +
                ", heightCm=" + heightCm +
                ", weightKg=" + weightKg +
                ", bmi=" + bmi +
                ", bodyFatPercentage=" + bodyFatPercentage +
                ", medicalCondition=" + medicalCondition +
                ", current_fitness_level='" + current_fitness_level + '\'' +
                ", additionalNotes='" + additionalNotes + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", createdBy='" + createdBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", user=" + user +
                '}';
    }
}
