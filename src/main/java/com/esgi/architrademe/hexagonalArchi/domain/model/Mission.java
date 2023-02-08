package com.esgi.architrademe.hexagonalArchi.domain.model;

import com.esgi.architrademe.hexagonalArchi.domain.enums.ConsultantSkillEnum;
import com.esgi.architrademe.hexagonalArchi.domain.enums.MissionStatusEnum;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public final class Mission {
    private final MissionId id ;
    private final String title ;
    private final Client client ;
    private final String description ;
    private final int nbOfDays ;
    private final int pricePerDayProposal ;
    private final List<Consultant> listeConsultants ;
    private final List<ConsultantSkillEnum> requiredSkills ;
    private final int requiredExperience ;
    private final LocalDate startDate ;
    private final LocalDate endDate ;
    private final List<Bill> listeBills ;
    private final MissionStatusEnum status ;
    private final boolean isCompleted ;

    public Mission(MissionId id, String title, Client client, String description, int nbOfDays, int pricePerDayProposal, List<Consultant> listeConsultants, List<ConsultantSkillEnum> requiredSkills, int requiredExperience, LocalDate startDate, LocalDate endDate, List<Bill> listeBills, MissionStatusEnum status, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.client = client;
        this.description = description;
        this.nbOfDays = nbOfDays;
        this.pricePerDayProposal = pricePerDayProposal;
        this.listeConsultants = listeConsultants;
        this.requiredSkills = requiredSkills;
        this.requiredExperience = requiredExperience;
        this.startDate = startDate;
        this.endDate = endDate;
        this.listeBills = listeBills;
        this.status = status;
        this.isCompleted = isCompleted;
    }

    public MissionId id() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mission that = (Mission) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Mission{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", client=" + client +
                ", description='" + description + '\'' +
                ", nbOfDays=" + nbOfDays +
                ", pricePerDayProposal=" + pricePerDayProposal +
                ", listeConsultants=" + listeConsultants +
                ", requiredSkills=" + requiredSkills +
                ", requiredExperience=" + requiredExperience +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", listeBills=" + listeBills +
                ", status=" + status +
                ", isCompleted=" + isCompleted +
                '}';
    }




}
