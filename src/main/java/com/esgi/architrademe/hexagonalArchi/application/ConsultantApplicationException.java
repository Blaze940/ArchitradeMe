package com.esgi.architrademe.hexagonalArchi.application;

import kernel.ApplicationException;

public final class ConsultantApplicationException extends ApplicationException {
    private ConsultantApplicationException(String message) {
        super(message);
    }
    public static ConsultantApplicationException create() {
        throw new ConsultantApplicationException("An error occurred.");
    }

    public static ConsultantApplicationException notFoundConsultant(String consultantId) {
        return new ConsultantApplicationException("Consultant with id -> " + consultantId + " not found.");
    }

}
