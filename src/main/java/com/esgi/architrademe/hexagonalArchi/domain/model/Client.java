package com.esgi.architrademe.hexagonalArchi.domain.model;

import com.esgi.architrademe.hexagonalArchi.domain.Credentials;

public final class Client {
    private final ClientId id ;
    private final String name ;
    private final Credentials credentials ;
    private final String description ;
    private final String rib ;
    private final Mission[] missions ;

    public Client(ClientId id, String name, Credentials credentials, String description, String rib, Mission[] missions) {
        this.id = id;
        this.name = name;
        this.credentials = credentials;
        this.description = description;
        this.rib = rib;
        this.missions = missions;
    }

}
