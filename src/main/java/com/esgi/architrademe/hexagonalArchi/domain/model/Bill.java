package com.esgi.architrademe.hexagonalArchi.domain.model;

import com.esgi.architrademe.hexagonalArchi.domain.*;

public final class Bill {
    private final BillId id ;
    private final Mission mission ;
    private final Client clientConcerned ;
    private final Consultant consultantConserned ;
    private final int daysWorkedByConsultant ;
    private final int nbOfExtraDays ;
    private final Money totalAmount ;
    private final BillStatusEnum status ;

    public Bill(BillId id, Mission mission, Client clientConcerned, Consultant consultantConserned, int daysWorkedByConsultant, int nbOfExtraDays, Money totalAmount, BillStatusEnum status) {
        this.id = id;
        this.mission = mission;
        this.clientConcerned = clientConcerned;
        this.consultantConserned = consultantConserned;
        this.daysWorkedByConsultant = daysWorkedByConsultant;
        this.nbOfExtraDays = nbOfExtraDays;
        this.totalAmount = totalAmount;
        this.status = status;
    }

}
