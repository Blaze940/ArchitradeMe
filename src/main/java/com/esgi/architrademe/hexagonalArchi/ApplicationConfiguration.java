package com.esgi.architrademe.hexagonalArchi;

import com.esgi.architrademe.hexagonalArchi.application.events.ConsultantCreatedEventHandler;
import com.esgi.architrademe.hexagonalArchi.application.services.CreateConsultantService;
import com.esgi.architrademe.hexagonalArchi.infrastructure.LogNotifications;
import com.esgi.architrademe.hexagonalArchi.infrastructure.postgresql.adapter.JPAConsultants;
import com.esgi.architrademe.hexagonalArchi.infrastructure.postgresql.repository.ConsultantEntityRepository;
//import fr.esgi.al.account.step19.application.events.ConsultantCreatedEventHandler;
//import fr.esgi.al.account.step19.application.events.TransferAcceptedEventHandler;
//import fr.esgi.al.account.step19.application.services.CreateConsultantService;
//import fr.esgi.al.account.step19.application.services.GetConsultantBalanceService;
//import fr.esgi.al.account.step19.application.services.SendMoneyService;
//import fr.esgi.al.account.step19.domain.ConsultantConfiguration;
//import fr.esgi.al.account.step19.infrastructure.ConsultantEntityRepository;
//import fr.esgi.al.account.step19.infrastructure.LogNotifications;
import kernel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@SuppressWarnings("all")
//public class ApplicationConfiguration {
//
//    @Autowired
//    private ConsultantEntityRepository consultantRepository;
//
//    @Bean
//    public JPAConsultants accounts() {
//        return new JPAConsultants(consultantRepository);
//    }
//
//    @Bean
//    public CommandBus commandBus() {
//        return BusFactory.defaultCommandBus();
//    }
//
//    @Bean
//    public QueryBus queryBus() {
//        return BusFactory.defaultQueryBus();
//    }
//
//    @Bean
//    public EventDispatcher eventDispatcher() {
//        return DefaultEventDispatcher.create();
//    }
//
//    @Bean
//    public CreateConsultantService createConsultantService() {
//        return new CreateConsultantService(accounts(), eventDispatcher());
//    }
//
////    @Bean
////    public SendMoneyService sendMoneyService() {
////        return new SendMoneyService(
////                new ConsultantConfiguration(500), accounts(), eventDispatcher());
////    }
//
////    @Bean
////    public GetConsultantBalanceService accountBalanceService() {
////        return new GetConsultantBalanceService(accounts());
////    }
////
////    @Bean
////    public LogNotifications notifications() {
////        return new LogNotifications();
////    }
//
////    @Bean
////    public TransferAcceptedEventHandler transferAcceptedEventHandler() {
////        return new TransferAcceptedEventHandler(notifications());
////    }
////
////    @Bean
////    public ConsultantCreatedEventHandler accountCreatedEventHandler() {
////        return new ConsultantCreatedEventHandler(notifications());
////    }
//}

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
    public ConsultantCreatedEventHandler accountCreatedEventHandler() {
        return new ConsultantCreatedEventHandler(notifications());
    }

//    @Bean
//    public DefaultHeroesPopulationApi createConsultantService(@Qualifier("JPAConsultants") ConsultantEntityRepository consultantEntityRepository) {
//        return new CreateConsultantService(consultantEntityRepository, eventDispatcher());
//    }
}