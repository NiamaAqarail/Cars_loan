package com.github.NiamaAqarial.demo.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class LocationDto {
    private long id;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private long voitureId;
    private long clientId;
    private String etat;
}