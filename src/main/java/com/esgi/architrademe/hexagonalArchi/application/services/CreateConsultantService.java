package com.esgi.architrademe.hexagonalArchi.application.services;

import com.esgi.architrademe.hexagonalArchi.application.CreateConsultantCommand;
import com.esgi.architrademe.hexagonalArchi.application.events.ConsultantCreatedApplicationEvent;
import com.esgi.architrademe.hexagonalArchi.domain.model.Consultant;
import com.esgi.architrademe.hexagonalArchi.domain.ports.Consultants;
import kernel.CommandHandler;
import kernel.Event;
import kernel.EventDispatcher;

public final class CreateConsultantService implements CommandHandler<CreateConsultantCommand, String> {

    private final Consultants consultants;
    private final EventDispatcher<? super Event> eventDispatcher;

    public CreateConsultantService(Consultants consultants, EventDispatcher<? super Event> eventDispatcher) {
        this.consultants = consultants;
        this.eventDispatcher = eventDispatcher;
    }

    @Override
    public String handle(CreateConsultantCommand command) {
        var consultantId = this.consultants.nextId();

        var consultant = new Consultant(consultantId,
                command.name,
                command.usernameCredentials,
                command.passwordCredentials,
                command.description,
                command.experienceInYears,
                command.pricePerDay,
                command.pricePerExtraDay,
                command.modality,
                command.rib,
                command.skills,
                command.availibilities);
        consultants.add(consultant);
        eventDispatcher.dispatch(new ConsultantCreatedApplicationEvent(consultantId));
        return consultantId.value();
    }
}
