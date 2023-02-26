package com.esgi.architrademe.hexagonalArchi.application.services;

import com.esgi.architrademe.hexagonalArchi.application.UpdateConsultantCommand;
import com.esgi.architrademe.hexagonalArchi.application.events.ConsultantUpdatedApplicationEvent;
import com.esgi.architrademe.hexagonalArchi.domain.model.ConsultantId;
import com.esgi.architrademe.hexagonalArchi.domain.ports.server.Consultants;
import kernel.CommandHandler;
import kernel.Event;
import kernel.EventDispatcher;

public final class UpdateConsultantService implements CommandHandler<UpdateConsultantCommand, Void> {

    private final Consultants consultants;
    private final EventDispatcher<? super Event> eventDispatcher;

    public UpdateConsultantService(Consultants consultants, EventDispatcher<? super Event> eventDispatcher) {
        this.consultants = consultants;
        this.eventDispatcher = eventDispatcher;
    }

    @Override
    public Void handle(UpdateConsultantCommand command) {
        var consultantId = new ConsultantId(command.consultantId);
        var consultantOptional = consultants.findById(consultantId);

        consultantOptional.ifPresent(consultant -> {
            consultant.setName(command.name);
            consultant.setUsernameCredentials(command.usernameCredentials);
            consultant.setUsernameCredentials(command.passwordCredentials);
            consultant.setDescription(command.description);
            consultant.setExperienceInYears(command.experienceInYears);
            consultant.setPricePerDay(command.pricePerDay);
            consultant.setPricePerExtraDay(command.pricePerExtraDay);
            consultant.setModality(command.modality);
            consultant.setRib(command.rib);
            consultant.setSkills(command.skills);
            consultant.setAvailabilities(command.availabilities);
            consultants.updateConsultant(consultant);
            eventDispatcher.dispatch(new ConsultantUpdatedApplicationEvent(consultantId));
        });
        return null;
    }
}
