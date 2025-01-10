package com.github.NiamaAqarial.demo.service;

import com.github.NiamaAqarial.demo.model.Location;
import com.github.NiamaAqarial.demo.model.Voiture;
import com.github.NiamaAqarial.demo.repository.LocationRepository;
import java.util.List;
public class LocationService {
    private final LocationRepository locationRepository;
    public LocationService(LocationRepository locationRepository){
        this.locationRepository = locationRepository;
    }
    // Get all locations
    public List<Location> getAllReparations() {
        return locationRepository.findAll();
    }

    // Get a location by ID
    public Location getReparationById(Long id) {
        return locationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Location not found with ID: " + id));
    }
    // Save or update a location
    public Location saveLocation(Location location) {
        return locationRepository.save(location);
    }

    // Delete a location by ID
    public void deleteLocation(Long id) {
        locationRepository.deleteById(id);
    }

    // Get locations by their status
    public List<Location> getLocationsByEtat(Voiture voiture) {
        return locationRepository.findByVoiture(voiture);
    }

    // Get all locations for a specific car
    public List<Location> getLocationsByVoitureId(Long voitureId) {
        return locationRepository.findByVoitureId(voitureId);
    }

    public List<Location> getAllLocations() {
        return locationRepository.findAllLocation();
    }
}
