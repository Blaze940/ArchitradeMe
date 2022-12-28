package com.esgi.architrademe.hexagonalArchi.domain;

public enum ConsultantSkillEnum {
     MANAGEMENT("Management"),
     PYTHON("Python"),
    JAVA("Java"),
    SQL("SQL"),
    C("C"),
    ENGLISH("English"),
    GIT("Git") ;
    private final String label;


    ConsultantSkillEnum(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}

