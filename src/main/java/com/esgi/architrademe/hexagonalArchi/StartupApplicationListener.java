package com.esgi.architrademe.hexagonalArchi;

import com.esgi.architrademe.hexagonalArchi.application.CreateConsultantCommand;
import com.esgi.architrademe.hexagonalArchi.application.SearchConsultantQuery;
import com.esgi.architrademe.hexagonalArchi.application.UpdateConsultantCommand;
import com.esgi.architrademe.hexagonalArchi.application.events.*;
import com.esgi.architrademe.hexagonalArchi.application.services.CreateConsultantService;
import com.esgi.architrademe.hexagonalArchi.application.services.SearchConsultantService;
import com.esgi.architrademe.hexagonalArchi.application.services.UpdateConsultantService;
import kernel.CommandBus;
import kernel.EventDispatcher;
import kernel.QueryBus;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
@SuppressWarnings("all")
public class StartupApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    private final CommandBus commandBus;
    private final QueryBus queryBus;
    private final EventDispatcher eventDispatcher;
    private final CreateConsultantService createConsultantService;
    private final UpdateConsultantService updateConsultantService;
    private final SearchConsultantService searchConsultantService;
    private final ConsultantCreatedEventHandler consultantCreatedEventHandler;
    private final ConsultantUpdatedEventHandler consultantUpdatedEventHandler;
    private final ConsultantFoundEventHandler consultantFoundEventHandler;

    public StartupApplicationListener(CommandBus commandBus, QueryBus queryBus, EventDispatcher eventDispatcher, CreateConsultantService createConsultantService, UpdateConsultantService updateConsultantService, SearchConsultantService searchConsultantService, ConsultantCreatedEventHandler consultantCreatedEventHandler, ConsultantUpdatedEventHandler consultantUpdatedEventHandler, ConsultantFoundEventHandler consultantFoundEventHandler) {
        this.commandBus = commandBus;
        this.queryBus = queryBus;
        this.eventDispatcher = eventDispatcher;
        this.createConsultantService = createConsultantService;
        this.updateConsultantService = updateConsultantService;
        this.searchConsultantService = searchConsultantService;
        this.consultantCreatedEventHandler = consultantCreatedEventHandler;
        this.consultantUpdatedEventHandler = consultantUpdatedEventHandler;
        this.consultantFoundEventHandler = consultantFoundEventHandler;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        eventDispatcher.register(ConsultantCreatedApplicationEvent.class, consultantCreatedEventHandler);
        commandBus.register(CreateConsultantCommand.class, createConsultantService);

        eventDispatcher.register(ConsultantFoundEventHandler.class, consultantFoundEventHandler);
        queryBus.register(SearchConsultantQuery.class, searchConsultantService);

        eventDispatcher.register(ConsultantUpdatedApplicationEvent.class, consultantUpdatedEventHandler);
        commandBus.register(UpdateConsultantCommand.class, updateConsultantService);
    }
}
