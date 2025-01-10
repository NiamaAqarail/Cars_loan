package com.github.NiamaAqarial.demo.service;

import com.github.NiamaAqarial.demo.model.Voiture;
import com.github.NiamaAqarial.demo.repository.VoitureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoitureService {
    private final VoitureRepository voitureRepository;

    public VoitureService(VoitureRepository voitureRepository) {
        this.voitureRepository = voitureRepository;
    }

    public List<Voiture> getAllVoitures() {
        return voitureRepository.findAll();
    }

    public Voiture saveVoiture(Voiture voiture) {
        return voitureRepository.save(voiture);
    }

    public void deleteVoiture(Long id) {
        voitureRepository.deleteById(id);
    }
}