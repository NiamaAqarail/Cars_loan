package com.github.NiamaAqarial.demo.repository;
import com.github.NiamaAqarial.demo.model.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {
}
