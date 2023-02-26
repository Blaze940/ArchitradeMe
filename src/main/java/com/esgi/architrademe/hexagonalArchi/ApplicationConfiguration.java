package com.esgi.architrademe.hexagonalArchi;

import com.esgi.architrademe.hexagonalArchi.application.events.ConsultantCreatedEventHandler;
import com.esgi.architrademe.hexagonalArchi.application.events.ConsultantFoundEventHandler;
import com.esgi.architrademe.hexagonalArchi.application.events.ConsultantUpdatedEventHandler;
import com.esgi.architrademe.hexagonalArchi.application.services.CreateConsultantService;
import com.esgi.architrademe.hexagonalArchi.application.services.SearchConsultantService;
import com.esgi.architrademe.hexagonalArchi.application.services.UpdateConsultantService;
import com.esgi.architrademe.hexagonalArchi.infrastructure.LogNotifications;
import com.esgi.architrademe.hexagonalArchi.infrastructure.postgresql.adapter.JPAConsultants;
import com.esgi.architrademe.hexagonalArchi.infrastructure.postgresql.repository.ConsultantEntityRepository;
import kernel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
    @Autowired
    private ConsultantEntityRepository consultantRepository;
    @Bean
    public EventDispatcher eventDispatcher() {
        return DefaultEventDispatcher.create();
    }
    @Bean
    public LogNotifications notifications() {
        return new LogNotifications();
    }

    @Bean
    public JPAConsultants consultants() {
        return new JPAConsultants(consultantRepository);
    }
    @Bean
    public CommandBus commandBus() {
        return BusFactory.defaultCommandBus();
    }

    @Bean
    public QueryBus queryBus() {
        return BusFactory.defaultQueryBus();
    }

    @Bean
    public CreateConsultantService createConsultantService() {
        return new CreateConsultantService(consultants(), eventDispatcher());
    }
    @Bean
    public UpdateConsultantService updateConsultantService() {
        return new UpdateConsultantService(consultants(), eventDispatcher());
    }

    @Bean
    public ConsultantCreatedEventHandler consultantCreatedEventHandler() {
        return new ConsultantCreatedEventHandler(notifications());
    }

    @Bean
    public SearchConsultantService searchConsultantService() {
        return new SearchConsultantService(consultants(), eventDispatcher());
    }

    @Bean
    public ConsultantFoundEventHandler consultantFoundEventHandler() {
        return new ConsultantFoundEventHandler(notifications());
    }

    @Bean
    public ConsultantUpdatedEventHandler consultantUpdatedEventHandler() {
        return new ConsultantUpdatedEventHandler(notifications());
    }
}