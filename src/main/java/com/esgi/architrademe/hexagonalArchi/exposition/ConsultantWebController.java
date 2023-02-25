package com.esgi.architrademe.hexagonalArchi.exposition;

//import com.esgi.architrademe.hexagonalArchi.consultant.step19.application.ConsultantBalanceQuery;
//import com.esgi.architrademe.hexagonalArchi.consultant.step19.application.CreateConsultantCommand;
//import com.esgi.architrademe.hexagonalArchi.consultant.step19.application.SendMoneyCommand;
import com.esgi.architrademe.hexagonalArchi.application.CreateConsultantCommand;
import com.esgi.architrademe.hexagonalArchi.exposition.requests.CreateConsultantRequest;
import com.esgi.architrademe.hexagonalArchi.exposition.responses.CreateConsultantResponse;
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
                createConsultantRequest.id,
                createConsultantRequest.name,
                createConsultantRequest.usernameCredentials,
                createConsultantRequest.passwordCredentials,
                createConsultantRequest.description,
                createConsultantRequest.modality,
                createConsultantRequest.experienceInYears,
                createConsultantRequest.pricePerDay,
                createConsultantRequest.pricePerExtraDay,
                createConsultantRequest.rib
        ));
        return new CreateConsultantResponse(consultantId);
    }

//    @PostMapping(value = "/transfer", consumes = MediaType.APPLICATION_JSON_VALUE)
//    public void transfer(@RequestBody @Valid TransferConsultantRequest transferConsultantRequest) {
//        commandBus.post(new SendMoneyCommand(
//                transferConsultantRequest.sourceConsultantId,
//                transferConsultantRequest.targetConsultantId,
//                transferConsultantRequest.amount
//        ));
//    }

//    @GetMapping
//    public GetBalanceResponse getBalance(@RequestParam String consultantId) {
//        var balance = (Double) queryBus.post(new ConsultantBalanceQuery(consultantId));
//        return new GetBalanceResponse(balance);
//    }
}
