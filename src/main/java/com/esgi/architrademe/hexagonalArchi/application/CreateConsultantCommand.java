package com.esgi.architrademe.hexagonalArchi.application;

import com.esgi.architrademe.hexagonalArchi.domain.Credentials;
import kernel.Command;

import java.util.List;

public class CreateConsultantCommand implements Command {
    public String name ;

    public String usernameCredentials ;

    public String passwordCredentials ;

    public String description ;
    public String modality;
    public int experienceInYears;
    public int pricePerDay ;
    public int pricePerExtraDay ;
    public String rib ;
    public Credentials credentials ;
    public List<String> skills ;
    public List<String> availibilities ; //ArrayList less efficient than array

    public CreateConsultantCommand(String name, String usernameCredentials, String passwordCredentials, String description, String modality, int experienceInYears, int pricePerDay, int pricePerExtraDay, String rib, List<String> skills, List<String> availibilities) {
        this.name = name;
        this.usernameCredentials=usernameCredentials;
        this.passwordCredentials=passwordCredentials;
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
