package com.esgi.architrademe.hexagonalArchi.infrastructure.postgresql.mapper;

import com.esgi.architrademe.hexagonalArchi.domain.Credentials;
import com.esgi.architrademe.hexagonalArchi.domain.model.Consultant;
import com.esgi.architrademe.hexagonalArchi.domain.model.ConsultantId;
import com.esgi.architrademe.hexagonalArchi.infrastructure.postgresql.entity.ConsultantEntity;

import java.util.UUID;

public interface ConsultantEntityMapper {
    static ConsultantEntity fromDomain(Consultant consultant){
        return new ConsultantEntity(
                UUID.fromString(consultant.id().value()),
                consultant.getName(),
                consultant.getUsernameCredentials(),
                consultant.getPasswordCredentials(),
                consultant.getDescription(),
                consultant.getModality(),
                consultant.getExperienceInYears(),
                consultant.getPricePerDay(),
                consultant.getPricePerExtraDay(),
                consultant.getRib(),
                consultant.getSkills(),
                consultant.getAvailibilities()
        );
    }
    static Consultant toDomain(ConsultantEntity consultantEntity){
        var consultantId = ConsultantId.of(consultantEntity.getId());
        Credentials credentials = new Credentials(consultantEntity.getUsernameCredentials(), consultantEntity.getPasswordCredentials());
       return new Consultant(
                   consultantId,
                   consultantEntity.getName(),
                    consultantEntity.getUsernameCredentials(),
                   consultantEntity.getPasswordCredentials(),
                   consultantEntity.getDescription(),
                   consultantEntity.getExperienceInYears(),
                   consultantEntity.getPricePerDay(),
                   consultantEntity.getPricePerExtraDay(),
                    consultantEntity.getModality(),
                   consultantEntity.getRib(),
                    consultantEntity.getSkills(),
                    consultantEntity.getAvailibilities());
    }
}
