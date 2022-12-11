package com.esgi.architrademe;

import com.esgi.architrademe.domain.*;

import java.util.ArrayList;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Consultant consultant = Consultant.generateConsultant();
        System.out.println(consultant);
    }
}
