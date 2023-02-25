package com.esgi.architrademe.hexagonalArchi;

import com.esgi.architrademe.hexagonalArchi.application.CreateConsultantCommand;
import com.esgi.architrademe.hexagonalArchi.application.events.ConsultantCreatedApplicationEvent;
import com.esgi.architrademe.hexagonalArchi.application.events.ConsultantCreatedEventHandler;
import com.esgi.architrademe.hexagonalArchi.application.services.CreateConsultantService;
//import fr.esgi.al.account.step19.application.ConsultantBalanceQuery;
//import fr.esgi.al.account.step19.application.CreateConsultantCommand;
//import fr.esgi.al.account.step19.application.SendMoneyCommand;
//import fr.esgi.al.account.step19.application.events.ConsultantCreatedApplicationEvent;
//import fr.esgi.al.account.step19.application.events.ConsultantCreatedEventHandler;
//import fr.esgi.al.account.step19.application.events.TransferAcceptedApplicationEvent;
//import fr.esgi.al.account.step19.application.events.TransferAcceptedEventHandler;
//import fr.esgi.al.account.step19.application.services.CreateConsultantService;
//import fr.esgi.al.account.step19.application.services.GetConsultantBalanceService;
//import fr.esgi.al.account.step19.application.services.SendMoneyService;
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
    private final EventDispatcher eventDispatcher;
    private final ConsultantCreatedEventHandler consultantCreatedEventHandler;

    public StartupApplicationListener(CommandBus commandBus, QueryBus queryBus, CreateConsultantService createConsultantService, EventDispatcher eventDispatcher, ConsultantCreatedEventHandler consultantCreatedEventHandler) {
        this.commandBus = commandBus;
        this.queryBus = queryBus;
        this.createConsultantService = createConsultantService;
        this.eventDispatcher = eventDispatcher;
        this.consultantCreatedEventHandler = consultantCreatedEventHandler;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        eventDispatcher.register(ConsultantCreatedApplicationEvent.class, consultantCreatedEventHandler);

        commandBus.register(CreateConsultantCommand.class, createConsultantService);
//        queryBus.register(ConsultantBalanceQuery.class, accountBalanceService);
    }
}
