package com.esgi.architrademe.hexagonalArchi.application.events;

import com.esgi.architrademe.hexagonalArchi.domain.model.ConsultantId;
import kernel.Event;

public record ConsultantCreatedApplicationEvent(ConsultantId consultantId) implements Event {
}
