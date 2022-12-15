package com.esgi.architrademe.domain;

public final class ConsultantQuery {

    private final String select;
    private final String from;
    private final String where;
    private final String orderBy;

    public ConsultantQuery(String select, String from, String where, String orderBy) {
        this.select = select;
        this.from = from;
        this.where = where;
        this.orderBy = orderBy;
    }

    public static ConsultantQueryBuilder create() {
        return new ConsultantQueryBuilder();
    }

    @Override
    public String toString() {
        return "Query{" +
                "select='" + select + '\'' +
                ", from='" + from + '\'' +
                ", where='" + where + '\'' +
                ", orderBy='" + orderBy + '\'' +
                '}';
    }
}
