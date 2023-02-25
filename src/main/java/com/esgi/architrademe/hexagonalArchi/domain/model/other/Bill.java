package com.esgi.architrademe.hexagonalArchi.domain.model.other;

import com.esgi.architrademe.hexagonalArchi.domain.enums.BillStatusEnum;
import com.esgi.architrademe.hexagonalArchi.domain.model.ConsultantId;

public final class Bill {
    private final BillId id ;
    private final Mission mission ;
    private final Client clientConcerned ;
    private final ConsultantId consultantConserned ;
    private final int daysWorkedByConsultant ;
    private final int nbOfExtraDays ;
    private final Money totalAmount ;
    private final BillStatusEnum status ;

    public Bill(BillId id, Mission mission, Client clientConcerned, ConsultantId consultantConserned, int daysWorkedByConsultant, int nbOfExtraDays, Money totalAmount, BillStatusEnum status) {
        this.id = id;
        this.mission = mission;
        this.clientConcerned = clientConcerned;
        this.consultantConserned = consultantConserned;
        this.daysWorkedByConsultant = daysWorkedByConsultant;
        this.nbOfExtraDays = nbOfExtraDays;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public BillId id() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bill bill = (Bill) o;
        return id.equals(bill.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

   @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", mission=" + mission +
                ", clientConcerned=" + clientConcerned +
                ", consultantConserned=" + consultantConserned +
                ", daysWorkedByConsultant=" + daysWorkedByConsultant +
                ", nbOfExtraDays=" + nbOfExtraDays +
                ", totalAmount=" + totalAmount +
                ", status=" + status +
                '}';
    }

}
