package com.esgi.architrademe.domain;

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
            return new ConsultantException(String.format("%s not found.", consultantId.value()));
        }

}
