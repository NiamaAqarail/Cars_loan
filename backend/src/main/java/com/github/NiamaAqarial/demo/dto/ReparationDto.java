package com.github.NiamaAqarial.demo.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ReparationDto {
    private long id;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private long voitureId;
    private String description;
    private double cout;
    private String etat;
}