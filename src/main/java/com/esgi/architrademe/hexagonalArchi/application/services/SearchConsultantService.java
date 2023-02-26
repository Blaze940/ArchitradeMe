package com.esgi.architrademe.hexagonalArchi.application.services;


import com.esgi.architrademe.hexagonalArchi.application.SearchConsultantQuery;
import com.esgi.architrademe.hexagonalArchi.domain.model.Consultant;
import com.esgi.architrademe.hexagonalArchi.domain.ports.server.Consultants;
import kernel.Event;
import kernel.EventDispatcher;
import kernel.QueryHandler;

import java.util.List;

public class SearchConsultantService implements QueryHandler<SearchConsultantQuery, List<Consultant>> {
    private final Consultants consultants;

    private EventDispatcher<? super Event> eventDispatcher;




    public SearchConsultantService(Consultants consultants, EventDispatcher<? super Event> eventDispatcher) {
        this.consultants = consultants;
        this.eventDispatcher = eventDispatcher;

    }

    @Override
    public List<Consultant> handle(SearchConsultantQuery query) {
        var searchConsultantCriteria = query.consultantSearchCriteria;
        var consultantsFound = consultants.findByCriteria(searchConsultantCriteria);
        //eventDispatcher.register(ConsultantFoundApplicationEvent.class, consultantFoundEventHandler);

        return consultantsFound;
    }
}
