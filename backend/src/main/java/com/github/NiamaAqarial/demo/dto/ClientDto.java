package com.github.NiamaAqarial.demo.dto;

import lombok.Data;

@Data
public class ClientDto {
    private long id;
    private String nom;
    private String prenom;
    private String cni;
    private String email;
    private String tel;
    private String adresse;
    private String numPermis;
}