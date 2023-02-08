package com.esgi.architrademe.hexagonalArchi.infrastructure;

import javax.persistence.Embeddable;

@Embeddable // Indispensable pour que Spring puisse créer une table de jointure
public final class CredentialsEntity {
    private String email ;
    private String password ;


    public CredentialsEntity() {
    }

    public CredentialsEntity(String email, String password) {
        this.email = email;
        this.password = password;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
