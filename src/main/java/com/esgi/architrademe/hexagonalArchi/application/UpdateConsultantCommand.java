package com.esgi.architrademe.hexagonalArchi.application;

import kernel.Command;

import java.util.List;
import java.util.UUID;

public class UpdateConsultantCommand implements Command {
    public UUID consultantId;

    public String name;

    public String usernameCredentials;

    public String passwordCredentials;

    public String description;
    public String modality;
    public int experienceInYears;
    public int pricePerDay;
    public int pricePerExtraDay;
    public String rib;
    public List<String> skills;
    public List<String> availabilities;

    public UpdateConsultantCommand(String consultantId, String name, String usernameCredentials, String passwordCredentials, String description, int experienceInYears, int pricePerDay, int pricePerExtraDay, String rib, List<String> skills, List<String> availabilities) {
        this.consultantId = UUID.fromString(consultantId);
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
        this.availabilities = availabilities;
    }

    public UUID getConsultantId() {
        return consultantId;
    }

    public void setConsultantId(String consultantId) {
        this.consultantId = UUID.fromString(consultantId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getUsernameCredentials() {
        return usernameCredentials;
    }

    public String getPasswordCredentials() {
        return passwordCredentials;
    }

    public void setUsernameCredentials(String usernameCredentials) {
        this.usernameCredentials = usernameCredentials;
    }

    public void setPasswordCredentials(String passwordCredentials) {
        this.passwordCredentials = passwordCredentials;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<String> getAvailabilities() {
        return availabilities;
    }

    public void setAvailabilities(List<String> availabilities) {
        this.availabilities = availabilities;
    }
}
