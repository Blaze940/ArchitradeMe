package com.esgi.architrademe.hexagonalArchi.exposition.requests;

import com.esgi.architrademe.hexagonalArchi.domain.model.ConsultantSearchCriteria;

import java.util.List;

public class SearchConsultantRequest {

    public String name;
    public String modality;
    public int experienceInYears;
    public int pricePerDay;
    public int pricePerExtraDay;
    public String rib;
    public List<String> skills;
    public List<String> availibilities;

    public SearchConsultantRequest(String name, String modality, int experienceInYears, int pricePerDay, int pricePerExtraDay, String rib, List<String> skills, List<String> availibilities) {
        this.name = name;
        this.modality = modality;
        this.experienceInYears = experienceInYears;
        this.pricePerDay = pricePerDay;
        this.pricePerExtraDay = pricePerExtraDay;
        this.rib = rib;
        this.skills = skills;
        this.availibilities = availibilities;
    }

    public ConsultantSearchCriteria toConsultantSearchCriteria() {
        return new ConsultantSearchCriteria.Builder()
                .withName(name)
                .withModality(modality)
                .withExperienceInYears(experienceInYears)
                .withPricePerDay(pricePerDay)
                .withPricePerExtraDay(pricePerExtraDay)
                .withRib(rib)
                .withSkills(skills)
                .withAvailibilities(availibilities)
                .done();
    }

}
