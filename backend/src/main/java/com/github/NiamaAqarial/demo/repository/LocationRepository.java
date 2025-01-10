package com.github.NiamaAqarial.demo.repository;

import com.github.NiamaAqarial.demo.model.Location;
import com.github.NiamaAqarial.demo.model.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocationRepository extends JpaRepository<Location, Long> {
    List<Location> findByVoitureId(Long voitureId);

    List<Location> findByVoiture(Voiture voiture);

    List<Location> findAllLocation();
}
