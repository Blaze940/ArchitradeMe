package com.esgi.architrademe.hexagonalArchi.infrastructure.postgresql.entity;

import com.esgi.architrademe.hexagonalArchi.domain.enums.ModalityEnum;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "consultant")
public class ConsultantEntity {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    public String name ;
    public String usernameCredentials ;
    public String passwordCredentials ;
    public String description ;
    public int experienceInYears;
    public int pricePerDay ;
    public int pricePerExtraDay ;
    public String rib ;

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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
