package com.esgi.architrademe.hexagonalArchi.domain.model;

import java.util.UUID;

public final class ClientId {
    private final UUID value;

    private ClientId(UUID value) {
        this.value = value ;
    }
    public static ClientId of(UUID value) {
        return new ClientId(value);
    }
    public String value() {
        return value.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientId clientId = (ClientId) o;
        return value.equals(clientId.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return "ClientId{" +
                "value=" + value +
                '}';
    }
}
