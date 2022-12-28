package com.esgi.architrademe.hexagonalArchi.domain.model;

import com.esgi.architrademe.hexagonalArchi.domain.ConsultantSkillEnum;
import com.esgi.architrademe.hexagonalArchi.domain.MissionStatusEnum;

import java.time.LocalDate;

public final class Mission {
    private final MissionId id ;
    private final String title ;
    private final Client client ;
    private final String description ;
    private final int nbOfDays ;
    private final int pricePerDayProposal ;
    private final Consultant[] consultants ;
    private final ConsultantSkillEnum[] requiredSkills ;
    private final int requiredExperience ;
    private final LocalDate startDate ;
    private final LocalDate endDate ;
    private final Bill[] bills ;
    private final MissionStatusEnum status ;
    private final boolean isCompleted ;

    public Mission(MissionId id, String title, Client client, String description, int nbOfDays, int pricePerDayProposal, Consultant[] consultants, ConsultantSkillEnum[] requiredSkills, int requiredExperience, LocalDate startDate, LocalDate endDate, Bill[] bills, MissionStatusEnum status, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.client = client;
        this.description = description;
        this.nbOfDays = nbOfDays;
        this.pricePerDayProposal = pricePerDayProposal;
        this.consultants = consultants;
        this.requiredSkills = requiredSkills;
        this.requiredExperience = requiredExperience;
        this.startDate = startDate;
        this.endDate = endDate;
        this.bills = bills;
        this.status = status;
        this.isCompleted = isCompleted;
    }

}
