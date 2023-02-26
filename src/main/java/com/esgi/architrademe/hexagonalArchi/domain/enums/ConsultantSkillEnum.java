package com.esgi.architrademe.hexagonalArchi.domain.enums;

public enum ConsultantSkillEnum {
     MANAGEMENT("Management"),
     PYTHON("Python"),
    JAVA("Java"),
    SQL("SQL"),
    C("C"),
    ENGLISH("English"),
    GIT("Git") ;
    public final String label;


    ConsultantSkillEnum(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}

