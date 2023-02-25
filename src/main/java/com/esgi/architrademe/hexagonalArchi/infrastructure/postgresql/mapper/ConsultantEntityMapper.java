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

public interface ConsultantEntityMapper {
//    static ConsultantEntity fromDomain(Consultant consultant){
//        return new ConsultantEntity(
//
//        )
//    }
//    static Consultant toDomain(ConsultantEntity consultantEntity){
//        var consultantId = new ConsultantId();
//        Credentials credentials = new Credentials(command.usernameCredentials, command.passwordCredentials);
//        List<DaysEnum> availibilities = new ArrayList<>();
//        List<ConsultantSkillEnum> skills = new ArrayList<>();
//        ModalityEnum modality = ModalityEnum.FULLPRESENCE;
//        List<Mission> listeConsultantMissions = new ArrayList<>();
//       return new Consultant(consultantId,
//                command.name,
//                credentials,
//                command.description,
//                skills,
//                command.experienceInYears,
//                command.pricePerDay,
//                command.pricePerExtraDay,
//                availibilities,
//                modality,
//                command.rib,
//                listeConsultantMissions);
//    }
}
