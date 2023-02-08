package com.esgi.architrademe.hexagonalArchi.infrastructure;

import com.esgi.architrademe.hexagonalArchi.domain.Credentials;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_CONSULTANT")
public final class ConsultantEntity {

    @Id
    private String id;

    private String name;
    private CredentialsEntity credentials;
    private String description;
    private int experienceInYears ;
    private int pricePerDay ;
    private int pricePerExtraDay ;
    private String rib;
    private String modality;
    @ManyToOne //Annotation Clef etrangere
    private MissionEntity mission;

    @ElementCollection
    private List<String> skills ;

    @ElementCollection
    private List<String> availibilitys ;

    public ConsultantEntity() {
    }

    public ConsultantEntity(String id, String name, CredentialsEntity credentials, String description, int experienceInYears, int pricePerDay, int pricePerExtraDay, String rib, String modality, MissionEntity mission, List<String> skills, List<String> availibilitys) {
        this.id = id;
        this.name = name;
        this.credentials = credentials;
        this.description = description;
        this.experienceInYears = experienceInYears;
        this.pricePerDay = pricePerDay;
        this.pricePerExtraDay = pricePerExtraDay;
        this.rib = rib;
        this.modality = modality;
        this.mission = mission;
        this.skills = skills;
        this.availibilitys = availibilitys;
    }

    public MissionEntity getMission() {
        return mission;
    }

    public void setMission(MissionEntity mission) {
        this.mission = mission;
    }

    public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

}
