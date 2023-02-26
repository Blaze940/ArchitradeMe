package com.esgi.architrademe.hexagonalArchi.exposition;

//import com.esgi.architrademe.hexagonalArchi.consultant.step19.application.ConsultantBalanceQuery;
//import com.esgi.architrademe.hexagonalArchi.consultant.step19.application.CreateConsultantCommand;
//import com.esgi.architrademe.hexagonalArchi.consultant.step19.application.SendMoneyCommand;

import com.esgi.architrademe.hexagonalArchi.application.CreateConsultantCommand;
import com.esgi.architrademe.hexagonalArchi.application.UpdateConsultantCommand;
import com.esgi.architrademe.hexagonalArchi.exposition.requests.CreateConsultantRequest;
import com.esgi.architrademe.hexagonalArchi.exposition.requests.UpdateConsultantRequest;
import com.esgi.architrademe.hexagonalArchi.exposition.responses.CreateConsultantResponse;
import com.esgi.architrademe.hexagonalArchi.exposition.responses.UpdateConsultantResponse;
import kernel.CommandBus;
import kernel.QueryBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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

    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public UpdateConsultantResponse update(@PathVariable("id") String id, @RequestBody @Valid UpdateConsultantRequest updateConsultantRequest) {
        commandBus.post(new UpdateConsultantCommand(
                updateConsultantRequest.name,
                updateConsultantRequest.usernameCredentials,
                updateConsultantRequest.passwordCredentials,
                updateConsultantRequest.description,
                updateConsultantRequest.modality,
                updateConsultantRequest.experienceInYears,
                updateConsultantRequest.pricePerDay,
                updateConsultantRequest.pricePerExtraDay,
                updateConsultantRequest.rib,
                updateConsultantRequest.skills,
                updateConsultantRequest.availibilities
        ));
        return new UpdateConsultantResponse("Consultant updated successfully");
    }

}
