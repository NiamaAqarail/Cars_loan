package com.github.NiamaAqarial.demo.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PaiementDto {
    private long id;
    private LocalDateTime date;
    private long locationId;
    private double montant;
}
