package com.esgi.architrademe.hexagonalArchi.domain.model;

import com.esgi.architrademe.hexagonalArchi.domain.Credentials;

import java.util.List;
import java.util.Objects;

public final class Consultant {
    private final ConsultantId id;
    private String name ;
    private String usernameCredentials ;
    private String passwordCredentials ;

    private String description ;
    private int experienceInYears;
    private int pricePerDay ;
    private int pricePerExtraDay ;
    private List<String> skills ;
    private List<String> availibilities ; //ArrayList less efficient than array
    private String modality ;
    private String rib ;

    public Consultant(ConsultantId id, String name,  String usernameCredentials, String passwordCredentials, String description, int experienceInYears, int pricePerDay, int pricePerExtraDay, String modality, String rib, List<String> skills, List<String> availibilities) {
        this.id = id;
        this.name = name;
        this.usernameCredentials = usernameCredentials;
        this.passwordCredentials = passwordCredentials;
        this.description = description;
        this.skills = skills;
        this.experienceInYears = experienceInYears;
        this.pricePerDay = pricePerDay;
        this.pricePerExtraDay = pricePerExtraDay;
        this.availibilities = availibilities;
        this.modality = modality;
        this.rib = rib;
    }

    public String getName() {
        return name;
    }

    public String getUsernameCredentials() {
        return usernameCredentials;
    }

    public String getPasswordCredentials() {
        return passwordCredentials;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getSkills() {
        return skills;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public int getPricePerExtraDay() {
        return pricePerExtraDay;
    }


    public List<String> getAvailibilities() {
        return availibilities;
    }

    public String getModality() {
        return modality;
    }

    public String getRib() {
        return rib;
    }

    public ConsultantId id() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsernameCredentials(String usernameCredentials) {
        this.usernameCredentials = usernameCredentials;
    }

    public void setPasswordCredentials(String passwordCredentials) {
        this.passwordCredentials = passwordCredentials;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public void setPricePerExtraDay(int pricePerExtraDay) {
        this.pricePerExtraDay = pricePerExtraDay;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public void setAvailabilities(List<String> availibilities) {
        this.availibilities = availibilities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consultant that = (Consultant) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Consultant{" +
                "id=" + id +
                '}';
    }
}
