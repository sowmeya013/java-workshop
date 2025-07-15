package com.vetias.java.workshop.temperaturedata.beans;

import java.time.LocalDate;

public record Organization(String name,
    String description,
    String website,
    String email,
    String contactnumber,
    long registerationNumber,
    LocalDate registrationDate){

    }


