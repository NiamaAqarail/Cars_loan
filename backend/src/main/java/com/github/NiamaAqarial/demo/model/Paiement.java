package com.github.NiamaAqarial.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import org.antlr.v4.runtime.misc.LogManager;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDateTime date;

    @OneToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    private double montant;
    // Explicit getters and setters
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }


}