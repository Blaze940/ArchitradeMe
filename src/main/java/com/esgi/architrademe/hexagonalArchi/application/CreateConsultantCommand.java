package com.esgi.architrademe.hexagonalArchi.application;

import com.esgi.architrademe.hexagonalArchi.domain.Credentials;
import com.esgi.architrademe.hexagonalArchi.domain.enums.ConsultantSkillEnum;
import com.esgi.architrademe.hexagonalArchi.domain.enums.DaysEnum;
import com.esgi.architrademe.hexagonalArchi.domain.enums.ModalityEnum;
import com.esgi.architrademe.hexagonalArchi.domain.model.ConsultantId;
import com.esgi.architrademe.hexagonalArchi.domain.model.other.Mission;
import kernel.Command;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CreateConsultantCommand implements Command {
    public String name ;
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
        this.description = description;
        this.modality = modality;
        this.experienceInYears = experienceInYears;
        this.pricePerDay = pricePerDay;
        this.pricePerExtraDay = pricePerExtraDay;
        this.rib = rib;
        this.credentials = new Credentials(usernameCredentials, passwordCredentials);
        this.skills = skills;
        this.availibilities = availibilities;
    }
}
