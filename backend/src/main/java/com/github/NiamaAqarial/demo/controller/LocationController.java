package com.github.NiamaAqarial.demo.controller;

import com.github.NiamaAqarial.demo.model.Location;
import com.github.NiamaAqarial.demo.service.LocationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class LocationController {
    private final LocationService reparationService;
    public LocationController(LocationService reparationService){
        this.reparationService = reparationService;
    }
    @GetMapping
    public List<Location> getAllLocations() {
        return reparationService.getAllLocations();
    }

    @PostMapping
    public Location saveLocation(@RequestBody Location reparation) {
        return reparationService.saveLocation(reparation);
    }

    @DeleteMapping("/{id}")
    public void deleteLocation(@PathVariable Long id) {
        reparationService.deleteLocation(id);
    }
}
