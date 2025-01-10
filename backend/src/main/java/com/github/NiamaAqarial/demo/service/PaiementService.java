package com.github.NiamaAqarial.demo.service;

import com.github.NiamaAqarial.demo.model.Location;
import com.github.NiamaAqarial.demo.model.Paiement;
import com.github.NiamaAqarial.demo.repository.PaiementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PaiementService {
    @Autowired
    private PaiementRepository paiementRepository;

    public Paiement createPaiement(Location location, double montant) {
        Paiement paiement = new Paiement();
        paiement.setDate(LocalDateTime.now());
        paiement.setLocation(location);
        paiement.setMontant(montant);
        return paiementRepository.save(paiement);
    }

}