package com.esgi.architrademe.hexagonalArchi.exposition.responses;

import com.esgi.architrademe.hexagonalArchi.domain.model.Consultant;

import java.util.List;

public class SearchConsultantResponse {
    public final List<Consultant> consultantsFound;


    public SearchConsultantResponse(List<Consultant> consultantsFound) {
        this.consultantsFound = consultantsFound;
    }

}
