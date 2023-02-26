package com.esgi.architrademe.hexagonalArchi.domain.model;

import java.util.List;
import java.util.Objects;

public class ConsultantSearchCriteria {
    public String name;
    public String modality;
    public int experienceInYears;
    public int pricePerDay;
    public int pricePerExtraDay;
    public String rib;
    public List<String> skills;
    public List<String> availibilities;

    private ConsultantSearchCriteria(Builder builder) {
        this.name = builder.name;
        this.modality = builder.modality;
        this.experienceInYears = builder.experienceInYears;
        this.pricePerDay = builder.pricePerDay;
        this.pricePerExtraDay = builder.pricePerExtraDay;
        this.rib = builder.rib;
        this.skills = builder.skills;
        this.availibilities = builder.availibilities;
    }

    //builder with self reset

    public static class Builder {
        private String name;
        private String modality;
        private int experienceInYears;
        private int pricePerDay;
        private int pricePerExtraDay;
        private String rib;
        private List<String> skills;
        private List<String> availibilities;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withModality(String modality) {
            this.modality = modality;
            return this;
        }

        public Builder withExperienceInYears(int experienceInYears) {
            this.experienceInYears = experienceInYears;
            return this;
        }

        public Builder withPricePerDay(int pricePerDay) {
            this.pricePerDay = pricePerDay;
            return this;
        }

        public Builder withPricePerExtraDay(int pricePerExtraDay) {
            this.pricePerExtraDay = pricePerExtraDay;
            return this;
        }

        public Builder withRib(String rib) {
            this.rib = rib;
            return this;
        }

        public Builder withSkills(List<String> skills) {
            this.skills = skills;
            return this;
        }

        public Builder withAvailibilities(List<String> availibilities) {
            this.availibilities = availibilities;
            return this;
        }

        public ConsultantSearchCriteria done() {
            ConsultantSearchCriteria consultantSearchCriteria = new ConsultantSearchCriteria(this);
            this.reset();
            return consultantSearchCriteria;
        }

        private void reset() {
            this.name = null;
            this.modality = null;
            this.experienceInYears = 0;
            this.pricePerDay = 0;
            this.pricePerExtraDay = 0;
            this.rib = null;
            this.skills = null;
            this.availibilities = null;
        }
    }


    public boolean matchAll(Consultant consultant) {
        boolean match = true;
        if (this.name != null) {
            match = match && this.name.equals(consultant.getName());
        }
        if (this.modality != null) {
            match = match && this.modality.equals(consultant.getModality());
        }
        if (this.experienceInYears != 0) {
            match = match && this.experienceInYears == consultant.getExperienceInYears();
        }
        if (this.pricePerDay != 0) {
            match = match && this.pricePerDay == consultant.getPricePerDay();
        }
        if (this.pricePerExtraDay != 0) {
            match = match && this.pricePerExtraDay == consultant.getPricePerExtraDay();
        }
        if (this.rib != null) {
            match = match && this.rib.equals(consultant.getRib());
        }
        if (this.skills != null) {
            match = match && this.skills.equals(consultant.getSkills());
        }
        if (this.availibilities != null) {
            match = match && this.availibilities.equals(consultant.getAvailibilities());
        }
        return match;
    }



    //GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    //EQUALS AND HASHCODE


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConsultantSearchCriteria that = (ConsultantSearchCriteria) o;
        return experienceInYears == that.experienceInYears && pricePerDay == that.pricePerDay && pricePerExtraDay == that.pricePerExtraDay && Objects.equals(name, that.name) && Objects.equals(modality, that.modality) && Objects.equals(rib, that.rib) && Objects.equals(skills, that.skills) && Objects.equals(availibilities, that.availibilities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, modality, experienceInYears, pricePerDay, pricePerExtraDay, rib, skills, availibilities);
    }

    //TO STRING


    @Override
    public String toString() {
        return "ConsultantSearchCriteria{" +
                "name='" + name + '\'' +
                ", modality='" + modality + '\'' +
                ", experienceInYears=" + experienceInYears +
                ", pricePerDay=" + pricePerDay +
                ", pricePerExtraDay=" + pricePerExtraDay +
                ", rib='" + rib + '\'' +
                ", skills=" + skills +
                ", availibilities=" + availibilities +
                '}';
    }

}
