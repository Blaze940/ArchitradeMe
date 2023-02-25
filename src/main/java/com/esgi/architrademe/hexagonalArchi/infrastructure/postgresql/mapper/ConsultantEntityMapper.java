package com.esgi.architrademe.hexagonalArchi.infrastructure.postgresql.mapper;

import com.esgi.architrademe.hexagonalArchi.domain.Credentials;
import com.esgi.architrademe.hexagonalArchi.domain.enums.ConsultantSkillEnum;
import com.esgi.architrademe.hexagonalArchi.domain.enums.DaysEnum;
import com.esgi.architrademe.hexagonalArchi.domain.enums.ModalityEnum;
import com.esgi.architrademe.hexagonalArchi.domain.model.Consultant;
import com.esgi.architrademe.hexagonalArchi.domain.model.ConsultantId;
import com.esgi.architrademe.hexagonalArchi.domain.model.other.Mission;
import com.esgi.architrademe.hexagonalArchi.infrastructure.postgresql.entity.ConsultantEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public interface ConsultantEntityMapper {
    static ConsultantEntity fromDomain(Consultant consultant){
        return new ConsultantEntity(
                consultant.id().toString(),
                consultant.getName(),
                consultant.getCredentials().email(),
                consultant.getCredentials().password(),
                consultant.getDescription(),
                consultant.getModality(),
                consultant.getExperienceInYears(),
                consultant.getPricePerDay(),
                consultant.getPricePerExtraDay(),
                consultant.getRib()
        );
    }
    static Consultant toDomain(ConsultantEntity consultantEntity){
        var consultantId = ConsultantId.of(UUID.fromString(consultantEntity.getId()));
        Credentials credentials = new Credentials(consultantEntity.usernameCredentials, consultantEntity.passwordCredentials);
        List<DaysEnum> availibilities = new ArrayList<>();
        List<ConsultantSkillEnum> skills = new ArrayList<>();
        String modality = ModalityEnum.FULLPRESENCE.label;
        List<Mission> listeConsultantMissions = new ArrayList<>();
       return new Consultant(
                   consultantId,
                   consultantEntity.getName(),
                    credentials,
                   consultantEntity.getDescription(),
                    skills,
                   consultantEntity.getExperienceInYears(),
                   consultantEntity.getPricePerDay(),
                   consultantEntity.getPricePerExtraDay(),
                    availibilities,
                    modality,
                   consultantEntity.getRib(),
                    listeConsultantMissions);
    }
}
