package com.esgi.architrademe.hexagonalArchi.domain;

public class ConsultantException extends RuntimeException {
    public ConsultantException(String message) {
        super(message);
    }
    public static ConsultantException notFoundConsultant(ConsultantId id) {
        return new ConsultantException("Consultant with id " + id + " not found");
    }
}
