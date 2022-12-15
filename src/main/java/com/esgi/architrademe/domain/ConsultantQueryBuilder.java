package com.esgi.architrademe.domain;

import java.util.Objects;

public class ConsultantQueryBuilder {

    private String select;
    private String from;
    private String where;
    private String orderBy;

    public ConsultantQueryBuilder select(String select) {
        ConsultantQueryBuilder builder = new ConsultantQueryBuilder();
        builder.select = Objects.requireNonNull(select);
        builder.from = from;
        builder.where = where;
        builder.orderBy = orderBy;
        return builder;
    }

    public ConsultantQueryBuilder from(String from) {
        ConsultantQueryBuilder builder = new ConsultantQueryBuilder();
        builder.select = select;
        builder.from = Objects.requireNonNull(from);
        builder.where = where;
        builder.orderBy = orderBy;
        return builder;
    }

    public ConsultantQueryBuilder where(String where) {
        ConsultantQueryBuilder builder = new ConsultantQueryBuilder();
        builder.select = select;
        builder.from = from;
        builder.where = Objects.requireNonNull(where);
        builder.orderBy = orderBy;
        return builder;
    }

    public ConsultantQueryBuilder orderBy(String orderBy) {
        ConsultantQueryBuilder builder = new ConsultantQueryBuilder();
        builder.select = select;
        builder.from = from;
        builder.where = where;
        builder.orderBy = Objects.requireNonNull(orderBy);
        return builder;
    }

    public ConsultantQuery build() {
        return new ConsultantQuery(select, from, where, orderBy);
    }
}
