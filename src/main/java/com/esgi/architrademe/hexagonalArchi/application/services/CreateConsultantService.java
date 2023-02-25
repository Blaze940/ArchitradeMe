package com.esgi.architrademe.hexagonalArchi.application.services;

import com.esgi.architrademe.hexagonalArchi.application.CreateConsultantCommand;
import com.esgi.architrademe.hexagonalArchi.application.events.ConsultantCreatedApplicationEvent;
import com.esgi.architrademe.hexagonalArchi.domain.Credentials;
import com.esgi.architrademe.hexagonalArchi.domain.enums.ConsultantSkillEnum;
import com.esgi.architrademe.hexagonalArchi.domain.enums.DaysEnum;
import com.esgi.architrademe.hexagonalArchi.domain.enums.ModalityEnum;
import com.esgi.architrademe.hexagonalArchi.domain.model.Consultant;
import com.esgi.architrademe.hexagonalArchi.domain.model.other.Mission;
import com.esgi.architrademe.hexagonalArchi.domain.ports.server.Consultants;
import kernel.CommandHandler;
import kernel.Event;
import kernel.EventDispatcher;

import java.util.ArrayList;
import java.util.List;

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
                command.credentials,
                command.description,
                command.skills,
                command.experienceInYears,
                command.pricePerDay,
                command.pricePerExtraDay,
                command.availibilities,
                command.modality,
                command.rib,
                command.listeConsultantMissions);
        consultants.add(consultant);
        eventDispatcher.dispatch(new ConsultantCreatedApplicationEvent(consultantId));
        return consultantId.value();
    }
}
