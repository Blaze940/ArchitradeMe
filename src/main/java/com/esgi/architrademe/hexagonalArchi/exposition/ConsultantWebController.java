package com.esgi.architrademe.hexagonalArchi.exposition;

//import com.esgi.architrademe.hexagonalArchi.consultant.step19.application.ConsultantBalanceQuery;
//import com.esgi.architrademe.hexagonalArchi.consultant.step19.application.CreateConsultantCommand;
//import com.esgi.architrademe.hexagonalArchi.consultant.step19.application.SendMoneyCommand;

import com.esgi.architrademe.hexagonalArchi.application.CreateConsultantCommand;
import com.esgi.architrademe.hexagonalArchi.application.SearchConsultantQuery;
import com.esgi.architrademe.hexagonalArchi.domain.model.Consultant;
import com.esgi.architrademe.hexagonalArchi.exposition.requests.CreateConsultantRequest;
import com.esgi.architrademe.hexagonalArchi.exposition.requests.SearchConsultantRequest;
import com.esgi.architrademe.hexagonalArchi.exposition.responses.CreateConsultantResponse;
import com.esgi.architrademe.hexagonalArchi.exposition.responses.SearchConsultantResponse;
import kernel.CommandBus;
import kernel.QueryBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/consultants")
@SuppressWarnings("all")
public class ConsultantWebController {

    private final CommandBus commandBus;
    private final QueryBus queryBus;

    @Autowired
    private ConsultantWebController(CommandBus commandBus, QueryBus queryBus) {
        this.commandBus = commandBus;
        this.queryBus = queryBus;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CreateConsultantResponse create(@RequestBody @Valid CreateConsultantRequest createConsultantRequest) {
        var consultantId = (String) commandBus.post(new CreateConsultantCommand(
                createConsultantRequest.name,
                createConsultantRequest.usernameCredentials,
                createConsultantRequest.passwordCredentials,
                createConsultantRequest.description,
                createConsultantRequest.modality,
                createConsultantRequest.experienceInYears,
                createConsultantRequest.pricePerDay,
                createConsultantRequest.pricePerExtraDay,
                createConsultantRequest.rib,
                createConsultantRequest.skills,
                createConsultantRequest.availibilities
        ));
        return new CreateConsultantResponse(consultantId);
    }

    //Recherches de consultants
    @PostMapping(value = "/search", consumes = MediaType.APPLICATION_JSON_VALUE)
    public SearchConsultantResponse search(@RequestBody @Valid SearchConsultantRequest searchConsultantRequest) {
        var consultantCriteria = searchConsultantRequest.toConsultantSearchCriteria() ;
        var consultantFound = (List<Consultant>)  queryBus.post(new SearchConsultantQuery(consultantCriteria));
        var consultantFoundResponse = new SearchConsultantResponse(consultantFound);
        return consultantFoundResponse;
    }

}
