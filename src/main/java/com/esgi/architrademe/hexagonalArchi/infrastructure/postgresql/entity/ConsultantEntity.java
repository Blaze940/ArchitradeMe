package com.esgi.architrademe.hexagonalArchi.infrastructure.postgresql.entity;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "T_CONSULTANT")
public class ConsultantEntity {
    @Id
    private UUID id;
//    @ElementCollection
//    private List<EventEntity> recordedEvents;

    private String name ;
    private String usernameCredentials ;
    private String passwordCredentials ;
    private String description ;
    private String modality ;
    private int experienceInYears;
    private int pricePerDay ;
    private int pricePerExtraDay ;
    private String rib ;
    @ElementCollection
    @CollectionTable(name = "consultant_skills", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "skill_id", columnDefinition = "TEXT")
    private List<String> skills ;
    @ElementCollection
    @CollectionTable(name = "consultant_availibilities", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "availibility_id", columnDefinition = "TEXT")
    private List<String> availibilities ;

    public ConsultantEntity(UUID id, String name, String usernameCredentials, String passwordCredentials, String description, String modality, int experienceInYears, int pricePerDay, int pricePerExtraDay, String rib, List<String> skills, List<String> availibilities) {
        this.id = id;
        this.name = name;
        this.usernameCredentials = usernameCredentials;
        this.passwordCredentials = passwordCredentials;
        this.description = description;
        this.modality = modality;
        this.experienceInYears = experienceInYears;
        this.pricePerDay = pricePerDay;
        this.pricePerExtraDay = pricePerExtraDay;
        this.rib = rib;
        this.skills = skills;
        this.availibilities = availibilities;
    }

    public ConsultantEntity() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsernameCredentials() {
        return usernameCredentials;
    }

    public void setUsernameCredentials(String usernameCredentials) {
        this.usernameCredentials = usernameCredentials;
    }

    public String getPasswordCredentials() {
        return passwordCredentials;
    }

    public void setPasswordCredentials(String passwordCredentials) {
        this.passwordCredentials = passwordCredentials;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getPricePerExtraDay() {
        return pricePerExtraDay;
    }

    public void setPricePerExtraDay(int pricePerExtraDay) {
        this.pricePerExtraDay = pricePerExtraDay;
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<String> getAvailibilities() {
        return availibilities;
    }

    public void setAvailibilities(List<String> availibilities) {
        this.availibilities = availibilities;
    }
}
