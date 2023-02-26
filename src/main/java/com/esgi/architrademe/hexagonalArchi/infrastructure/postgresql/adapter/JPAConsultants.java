package com.esgi.architrademe.hexagonalArchi.infrastructure.postgresql.adapter;

import com.esgi.architrademe.hexagonalArchi.application.ConsultantApplicationException;
import com.esgi.architrademe.hexagonalArchi.domain.exceptions.ConsultantException;
import com.esgi.architrademe.hexagonalArchi.domain.model.Consultant;
import com.esgi.architrademe.hexagonalArchi.domain.model.ConsultantId;
import com.esgi.architrademe.hexagonalArchi.domain.model.ConsultantSearchCriteria;
import com.esgi.architrademe.hexagonalArchi.domain.ports.server.Consultants;
import com.esgi.architrademe.hexagonalArchi.infrastructure.postgresql.entity.ConsultantEntity;
import com.esgi.architrademe.hexagonalArchi.infrastructure.postgresql.mapper.ConsultantEntityMapper;
import com.esgi.architrademe.hexagonalArchi.infrastructure.postgresql.repository.ConsultantEntityRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class JPAConsultants implements Consultants {
    ConsultantEntityRepository consultantRepository;

    public JPAConsultants(ConsultantEntityRepository consultantRepository) {
        this.consultantRepository = consultantRepository;
    }

    @Override
    public void add(Consultant consultant) {
        var consultantEntity = ConsultantEntityMapper.fromDomain(consultant);
        consultantRepository.save(consultantEntity);
    }

    @Override
    public List<Consultant> findByCriteria(ConsultantSearchCriteria criteria) {
        var listConsultant = new ArrayList<Consultant>();
        var resultAllConsultant = consultantRepository.findAll() ;

        if(!resultAllConsultant.isEmpty()) {
            //All consultants who have criterias which are in the list
            for (ConsultantEntity consultantEntity : resultAllConsultant) {
                var consultant = ConsultantEntityMapper.toDomain(consultantEntity);
                if(criteria.matchAll(consultant)) {
                    listConsultant.add(consultant);
                }
            }
        }else {
            throw ConsultantApplicationException.notFoundConsultant();
        }

        if(listConsultant.isEmpty()) throw ConsultantApplicationException.notFoundConsultantWithCriteria(criteria);

        return listConsultant ;
    }

    @Override
    public Optional<Consultant> findById(ConsultantId consultantId) {
//        return consultantRepository.findById(consultantId).map(ConsultantEntityMapper::toDomain);
        UUID consultantId1 = UUID.fromString(consultantId.value());
        final Optional<ConsultantEntity> optionalConsultantEntity = consultantRepository.findById(consultantId1);
        if (optionalConsultantEntity.isPresent()) {
            var consultantEntity = optionalConsultantEntity.get();

            return Optional.of(ConsultantEntityMapper.toDomain(consultantEntity));
        }
        throw ConsultantException.notFoundConsultantId(consultantId);
    }

    @Override
    public void remove(ConsultantId consultantId) {

    }

    @Override
    public ConsultantId nextId() {
        return ConsultantId.of(UUID.randomUUID());
    }
}
