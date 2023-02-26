package com.esgi.architrademe.hexagonalArchi.application;

import com.esgi.architrademe.hexagonalArchi.domain.model.ConsultantSearchCriteria;
import kernel.Query;

public class SearchConsultantQuery implements Query {
    public ConsultantSearchCriteria consultantSearchCriteria;

    public SearchConsultantQuery(ConsultantSearchCriteria consultantSearchCriteria) {
        this.consultantSearchCriteria = consultantSearchCriteria;
    }



}
