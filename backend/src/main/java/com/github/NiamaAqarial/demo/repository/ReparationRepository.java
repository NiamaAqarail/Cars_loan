package com.github.NiamaAqarial.demo.repository;

import com.github.NiamaAqarial.demo.model.Reparation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReparationRepository extends JpaRepository<Reparation, Long> {
}
