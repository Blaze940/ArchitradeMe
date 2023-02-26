package com.esgi.architrademe.hexagonalArchi.application.events;

import com.esgi.architrademe.hexagonalArchi.domain.model.ConsultantSearchCriteria;
import kernel.Event;

public record ConsultantFoundApplicationEvent(ConsultantSearchCriteria consultantSearchCriteria) implements Event {
}