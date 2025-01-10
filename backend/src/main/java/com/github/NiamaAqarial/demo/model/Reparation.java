package com.github.NiamaAqarial.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Null;
import lombok.Data;

import java.time.LocalDate;
@Entity
@Data
public class Reparation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate dateDebut;
    private LocalDate dateFin;

    @ManyToOne
    @JoinColumn(name = "voiture_id", nullable = false)
    private Voiture voiture;

    private String description;
    private double cout;
    private String etat;
}