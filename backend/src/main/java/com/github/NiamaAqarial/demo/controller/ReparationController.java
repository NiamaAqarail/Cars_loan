package com.github.NiamaAqarial.demo.controller;

import com.github.NiamaAqarial.demo.model.Reparation;
import com.github.NiamaAqarial.demo.service.ReparationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ReparationController {
    private final ReparationService reparationService;
    public ReparationController(ReparationService reparationService){
        this.reparationService = reparationService;
    }
    @GetMapping
    public List<Reparation> getAllReparations() {
        return reparationService.getAllReparations();
    }

    @PostMapping
    public Reparation saveReparation(@RequestBody Reparation reparation) {
        return reparationService.saveReparation(reparation);
    }

    @DeleteMapping("/{id}")
    public void deleteReparation(@PathVariable Long id) {
        reparationService.deleteReparation(id);
    }
}
