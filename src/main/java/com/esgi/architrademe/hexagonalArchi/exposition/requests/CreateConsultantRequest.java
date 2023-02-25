package com.esgi.architrademe.hexagonalArchi.exposition.requests;

import javax.validation.constraints.NotNull;
import java.util.UUID;

public final class CreateConsultantRequest {
    public UUID id;
    public String name ;
    public String usernameCredentials ;
    public String passwordCredentials ;
    public String description ;
    public int experienceInYears;
    public int pricePerDay ;
    public int pricePerExtraDay ;
    public String rib ;

    public CreateConsultantRequest(String name, String usernameCredentials, String passwordCredentials, String description, int experienceInYears, int pricePerDay, int pricePerExtraDay, String rib) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.usernameCredentials = usernameCredentials;
        this.passwordCredentials = passwordCredentials;
        this.description = description;
        this.experienceInYears = experienceInYears;
        this.pricePerDay = pricePerDay;
        this.pricePerExtraDay = pricePerExtraDay;
        this.rib = rib;
    }
}
