package com.github.NiamaAqarial.demo.repository;

import com.github.NiamaAqarial.demo.model.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}
