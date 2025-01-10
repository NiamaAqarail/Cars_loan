package com.github.NiamaAqarial.demo.service;

import com.github.NiamaAqarial.demo.model.Reparation;
import com.github.NiamaAqarial.demo.repository.ReparationRepository;
import java.util.List;

public class ReparationService {
    private final ReparationRepository reparationRepository;

    public ReparationService(ReparationRepository reparationRepository) {
        this.reparationRepository = reparationRepository;
    }

    // Get all reparations
    public List<Reparation> getAllReparations() {
        return reparationRepository.findAll();
    }

    // Get a reparation by ID
    public Reparation getReparationById(Long id) {
        return reparationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reparation not found with ID: " + id));
    }

    // Save or update a reparation
    public Reparation saveReparation(Reparation reparation) {
        return reparationRepository.save(reparation);
    }

    // Delete a reparation by ID
    public void deleteReparation(Long id) {
        reparationRepository.deleteById(id);
    }
}
