package com.github.NiamaAqarial.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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