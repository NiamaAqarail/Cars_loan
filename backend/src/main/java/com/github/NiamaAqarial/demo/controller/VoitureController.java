package com.github.NiamaAqarial.demo.controller;


import com.github.NiamaAqarial.demo.model.Voiture;
import com.github.NiamaAqarial.demo.service.VoitureService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/voitures")
public class VoitureController {
    private final VoitureService voitureService;
    public VoitureController(VoitureService voitureService){
        this.voitureService = voitureService;
    }
    @GetMapping
    public List<Voiture> getAllVoitures() {
        return voitureService.getAllVoitures();
    }

    @PostMapping
    public Voiture saveVoiture(@RequestBody Voiture voiture) {
        return voitureService.saveVoiture(voiture);
    }

    @DeleteMapping("/{id}")
    public void deleteVoiture(@PathVariable Long id) {
        voitureService.deleteVoiture(id);
    }
}
