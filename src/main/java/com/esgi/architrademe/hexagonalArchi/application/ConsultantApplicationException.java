package com.esgi.architrademe.hexagonalArchi.application;

import com.esgi.architrademe.hexagonalArchi.domain.model.ConsultantSearchCriteria;
import kernel.ApplicationException;

public final class ConsultantApplicationException extends ApplicationException {
    private ConsultantApplicationException(String message) {
        super(message);
    }
    public static ConsultantApplicationException create() {
        throw new ConsultantApplicationException("An error occurred.");
    }

    public static ConsultantApplicationException notFoundConsultant() {
        return new ConsultantApplicationException("Couldn't find consultant.");
    }

    public static ConsultantApplicationException notFoundConsultant(String consultantId) {
        return new ConsultantApplicationException("Consultant with id -> " + consultantId + " not found.");
    }

    public static ConsultantApplicationException notFoundConsultantWithCriteria(ConsultantSearchCriteria criteria) {
        return new ConsultantApplicationException("Consultant with criteria -> " + criteria + " not found.");
    }
}
