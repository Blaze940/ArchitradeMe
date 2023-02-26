package com.esgi.architrademe.hexagonalArchi.domain.model;

import com.esgi.architrademe.hexagonalArchi.domain.Credentials;

import java.util.List;
import java.util.Objects;

public final class Consultant {
    private final ConsultantId id;
    private final String name ;
    private final Credentials credentials ;
    private final String description ;
    private final int experienceInYears;
    private final int pricePerDay ;
    private final int pricePerExtraDay ;
    private final List<String> skills ;
    private final List<String> availibilities ; //ArrayList less efficient than array
    private final String modality ;
    private final String rib ;

    public Consultant(ConsultantId id, String name, Credentials credentials, String description, int experienceInYears, int pricePerDay, int pricePerExtraDay, String modality, String rib, List<String> skills, List<String> availibilities) {
        this.id = id;
        this.name = name;
        this.credentials = credentials;
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

    public Credentials getCredentials() {
        return credentials;
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
