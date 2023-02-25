package com.esgi.architrademe.hexagonalArchi.application;

import com.esgi.architrademe.hexagonalArchi.domain.Credentials;
import com.esgi.architrademe.hexagonalArchi.domain.enums.ConsultantSkillEnum;
import com.esgi.architrademe.hexagonalArchi.domain.enums.DaysEnum;
import com.esgi.architrademe.hexagonalArchi.domain.enums.ModalityEnum;
import com.esgi.architrademe.hexagonalArchi.domain.model.ConsultantId;
import com.esgi.architrademe.hexagonalArchi.domain.model.other.Mission;
import kernel.Command;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

public class CreateConsultantCommand implements Command {
    public UUID id;
    public String name ;
    public String usernameCredentials ;
    public String passwordCredentials ;
    public String description ;
    public int experienceInYears;
    public int pricePerDay ;
    public int pricePerExtraDay ;
    public String rib ;
//    public Credentials credentials ;
//    public List<ConsultantSkillEnum> skills ;
//    public List<DaysEnum> availibilitys ; //ArrayList less efficient than array
//    public ModalityEnum modality ;
//    public List<Mission> listeConsultantMissions ;


    public CreateConsultantCommand(UUID id, String name, String usernameCredentials, String passwordCredentials, String description, int experienceInYears, int pricePerDay, int pricePerExtraDay, String rib) {
        this.id = id;
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
