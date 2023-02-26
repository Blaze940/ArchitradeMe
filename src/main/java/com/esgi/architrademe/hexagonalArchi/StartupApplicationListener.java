package com.esgi.architrademe.hexagonalArchi;

import com.esgi.architrademe.hexagonalArchi.application.CreateConsultantCommand;
import com.esgi.architrademe.hexagonalArchi.application.UpdateConsultantCommand;
import com.esgi.architrademe.hexagonalArchi.application.events.ConsultantCreatedApplicationEvent;
import com.esgi.architrademe.hexagonalArchi.application.events.ConsultantCreatedEventHandler;
import com.esgi.architrademe.hexagonalArchi.application.events.ConsultantUpdatedApplicationEvent;
import com.esgi.architrademe.hexagonalArchi.application.events.ConsultantUpdatedEventHandler;
import com.esgi.architrademe.hexagonalArchi.application.services.CreateConsultantService;
import com.esgi.architrademe.hexagonalArchi.application.services.UpdateConsultantService;
import com.esgi.architrademe.hexagonalArchi.application.SearchConsultantQuery;
import com.esgi.architrademe.hexagonalArchi.application.events.ConsultantCreatedApplicationEvent;
import com.esgi.architrademe.hexagonalArchi.application.events.ConsultantCreatedEventHandler;
import com.esgi.architrademe.hexagonalArchi.application.events.ConsultantFoundEventHandler;
import com.esgi.architrademe.hexagonalArchi.application.services.CreateConsultantService;
import com.esgi.architrademe.hexagonalArchi.application.services.SearchConsultantService;
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
    private final CreateConsultantService createConsultantService;

    private final UpdateConsultantService updateConsultantService;
    private final EventDispatcher eventDispatcher;
    private final ConsultantCreatedEventHandler consultantCreatedEventHandler;

    private final ConsultantUpdatedEventHandler consultantUpdatedEventHandler;

    private final SearchConsultantService searchConsultantService;

    private final ConsultantFoundEventHandler consultantFoundEventHandler;




    public StartupApplicationListener(CommandBus commandBus, QueryBus queryBus, CreateConsultantService createConsultantService, EventDispatcher eventDispatcher, ConsultantCreatedEventHandler consultantCreatedEventHandler, ConsultantCreatedEventHandler consultantUpdatedEventHandler, ConsultantUpdatedEventHandler consultantUpdatedEventHandler1, SearchConsultantService searchConsultantService, ConsultantFoundEventHandler consultantFoundEventHandler) {
        this.commandBus = commandBus;
        this.queryBus = queryBus;
        this.createConsultantService = createConsultantService;
        this.eventDispatcher = eventDispatcher;
        this.consultantCreatedEventHandler = consultantCreatedEventHandler;
        this.updateConsultantService = updateConsultantService;
        this.consultantUpdatedEventHandler = consultantUpdatedEventHandler1;

        this.searchConsultantService = searchConsultantService;
        this.consultantFoundEventHandler = consultantFoundEventHandler;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        eventDispatcher.register(ConsultantCreatedApplicationEvent.class, consultantCreatedEventHandler);
        eventDispatcher.register(ConsultantFoundEventHandler.class, consultantFoundEventHandler);

        commandBus.register(CreateConsultantCommand.class, createConsultantService);
        queryBus.register(SearchConsultantQuery.class, searchConsultantService);

        eventDispatcher.register(ConsultantUpdatedApplicationEvent.class, consultantUpdatedEventHandler);

        commandBus.register(UpdateConsultantCommand.class, updateConsultantService);
    }
}
