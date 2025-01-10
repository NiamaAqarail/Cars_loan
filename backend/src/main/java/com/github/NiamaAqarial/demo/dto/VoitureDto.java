package com.github.NiamaAqarial.demo.dto;

import lombok.Data;

@Data
public class VoitureDto {
    private long id;
    private String marque;
    private String model;
    private int anneeFab;
    private String carburant;
    private String immatriculation;
    private double prix;
    private String etat;
    private String image;
}