package com.esgi.architrademe.hexagonalArchi.infrastructure.postgresql.repository;

import com.esgi.architrademe.hexagonalArchi.domain.model.ConsultantId;
import com.esgi.architrademe.hexagonalArchi.infrastructure.postgresql.entity.ConsultantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

import static org.springframework.transaction.annotation.Propagation.MANDATORY;

@Repository
@Transactional(propagation = MANDATORY)
public interface ConsultantEntityRepository extends JpaRepository<ConsultantEntity, UUID> {
}