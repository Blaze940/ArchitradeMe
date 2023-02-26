package com.esgi.architrademe.hexagonalArchi.exposition.requests;

import javax.validation.constraints.NotNull;
import java.util.List;

public final class UpdateConsultantRequest {
    @NotNull
    public String name;
    @NotNull
    public String usernameCredentials;
    @NotNull
    public String passwordCredentials;
    @NotNull
    public String description;
    @NotNull
    public String modality;
    @NotNull
    public int experienceInYears;
    @NotNull
    public int pricePerDay;
    @NotNull
    public int pricePerExtraDay;
    @NotNull
    public String rib;
    public List<String> skills;
    public List<String> availibilities;

    public UpdateConsultantRequest(String name, String usernameCredentials, String passwordCredentials, String description, String modality, int experienceInYears, int pricePerDay, int pricePerExtraDay, String rib, List<String> skills, List<String> availibilities) {
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
}
