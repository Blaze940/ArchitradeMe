package com.esgi.architrademe.hexagonalArchi.domain.exceptions;

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

    public static ConsultantException notFoundConsultantId(ConsultantId consultantId) {
        return new ConsultantException("Consultant with id -> " + consultantId.value() + " not found.");
    }
}
