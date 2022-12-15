package com.esgi.architrademe.domain;

public class ADR {
    Double value;
    String currency;
    Double nbHours;

    private ADR(Double value, String currency, Double nbHours) {
        this.value = value;
        this.currency = currency;
        this.nbHours = nbHours;
    }

    public static ADR of(Double value, String currency, Double nbHours){
        return new ADR(value, currency, nbHours);
    }

    public ADR changeValue(Double newValue){
        return new ADR(newValue, currency, nbHours);
    }

    public ADR changeCurrency(String newCurrency){
        return new ADR(value, newCurrency, nbHours);
    }

    public ADR changeNbHours(Double newNbHours){
        return new ADR(value, currency, newNbHours);
    }

    public static ADR generateADR(){
        return ADR.of(300., "EUR", 7.);
    }

    @Override
    public String toString() {
        return "ADR{" +
                "value=" + value +
                ", currency='" + currency + '\'' +
                ", nbHours=" + nbHours +
                '}';
    }
}
