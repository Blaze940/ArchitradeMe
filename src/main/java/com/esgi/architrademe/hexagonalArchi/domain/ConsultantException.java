package com.esgi.architrademe.hexagonalArchi.domain;

import com.esgi.architrademe.hexagonalArchi.domain.model.ConsultantId;

public class ConsultantException extends RuntimeException {
    private ConsultantException() {
    }

    private ConsultantException(String message) {
        super(message);
    }

    public static ConsultantException create() {
        throw new ConsultantException();
    }

    public static ConsultantException notFoundConsultant(ConsultantId consultantId) {
        return new ConsultantException("Consultant with id -> " + consultantId.value() + " not found.");
    }
}
