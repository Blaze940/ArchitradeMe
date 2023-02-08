package com.esgi.architrademe.hexagonalArchi.domain.model;

import com.esgi.architrademe.hexagonalArchi.domain.Credentials;

import java.util.List;
import java.util.Objects;

public final class Client {
    private final ClientId id ;
    private final String name ;
    private final Credentials credentials ;
    private final String description ;
    private final String rib ;

    private final List<Mission> listeMissions ;

    public Client(ClientId id, String name, Credentials credentials, String description, String rib, List<Mission> listeMissions) {
        this.id = id;
        this.name = name;
        this.credentials = credentials;
        this.description = description;
        this.rib = rib;
        this.listeMissions = listeMissions;
    }


    public ClientId id() {
        return id;
    }

    public String name() {
        return name;
    }

    public Credentials credentials() {
        return credentials;
    }

    public String description() {
        return description;
    }

    public String rib() {
        return rib;
    }

    public List<Mission> listeMissions() {
        return listeMissions;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                '}';
    }

}
