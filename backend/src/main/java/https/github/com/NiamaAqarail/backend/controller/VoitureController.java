package https.github.com.NiamaAqarail.backend.controller;


import https.github.com.NiamaAqarail.backend.dto.VoitureDTO;
import https.github.com.NiamaAqarail.backend.model.Voiture;
import https.github.com.NiamaAqarail.backend.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voiture")
public class VoitureController {
    @Autowired
    private VoitureService voitureService;

    @PostMapping("/add")
    public String addVoiture(@RequestBody Voiture voiture){
        try{
            voitureService.addVoiture(voiture);
            return "Voiture added successfully";
        }catch (Exception e){
            return "Failed to add the car information";
        }
    }
    @GetMapping("/all")
    public List<Voiture> getVoitures(){
        return voitureService.getVoitures();
    }
    @GetMapping("/get")
    public Voiture getVoiture(@RequestParam Integer id){
        return voitureService.getVoiture(id);
    }
    @PutMapping("/update/{id}")
    public String updateVoiture(@PathVariable Integer id, @RequestBody Voiture voiture){
        try{
            voitureService.updateVoiture(id, voiture);
            return "Car updated successfully";
        }catch (Exception e){
            return "Failed to update the car";
        }
    }
    @DeleteMapping("/delete/{id}")
    public String deleteVoiture(@PathVariable Integer id){
        try{
            voitureService.deleteVoiture(id);
            return "Car deleted successfully";
        }catch(Exception e){
            return "Failed to delete the Car";
        }
    }
    @PatchMapping("/update-marque/{id}")
    public String updateMarque(@PathVariable Integer id, @RequestBody VoitureDTO voitureDTO){
        try{
            voitureService.updateMarque(id, voitureDTO);
            return "Car's brand updated successfully";
        }catch (Exception e){
            return "Failed to update the car's brand "+ e.getMessage();
        }
    }
    @PatchMapping("/update-model/{id}")
    public String updateModel(@PathVariable Integer id, @RequestBody VoitureDTO voitureDTO){
        try{
            voitureService.updateModel(id, voitureDTO);
            return "Car's model updated successfully";
        }catch(Exception e){
            return "Failed to update the car's model " + e.getMessage();
        }
    }
    @PatchMapping("/update-anneefab/{id}")
    public String updateAnneeFab(@PathVariable Integer id, @RequestBody VoitureDTO voitureDTO){
        try{
            voitureService.updateAnneeFab(id, voitureDTO);
            return "Car's manufacturing date updated successfully";
        }catch(Exception e){
            return "Failed to update the car's manufacturing date " + e.getMessage();
        }
    }
    @PatchMapping("/update-carburant/{id}")
    public String updateCarburant(@PathVariable Integer id, @RequestBody VoitureDTO voitureDTO){
        try{
            voitureService.updateCarburant(id, voitureDTO);
            return "Car's fue type updated successfully";
        }catch(Exception e){
            return "Failed to update the car's fuel type " + e.getMessage();
        }
    }
    @PatchMapping("/update-immat/{id}")
    public String updateImmatricuation(@PathVariable Integer id, @RequestBody VoitureDTO voitureDTO){
        try{
            voitureService.updateImmatriculation(id, voitureDTO);
            return "Car's pate number updated successfully";
        }catch(Exception e){
            return "Failed to update the car's pate number " + e.getMessage();
        }
    }
    @PatchMapping("/update-prix/{id}")
    public String updatePrix(@PathVariable Integer id, @RequestBody VoitureDTO voitureDTO){
        try{
            voitureService.updatePrix(id, voitureDTO);
            return "Car's price updated successfully";
        }catch(Exception e){
            return "Failed to update the car's price " + e.getMessage();
        }
    }
    @PatchMapping("/update-etat/{id}")
    public String updateEtat(@PathVariable Integer id, @RequestBody VoitureDTO voitureDTO){
        try{
            voitureService.updateEtat(id, voitureDTO);
            return "Car's state updated successfully";
        }catch(Exception e){
            return "Failed to update the car's state " + e.getMessage();
        }
    }
    @PatchMapping("/update-image/{id}")
    public String updateImage(@PathVariable Integer id, @RequestBody VoitureDTO voitureDTO){
        try{
            voitureService.updateImage(id, voitureDTO);
            return "Car's image updated successfully";
        }catch(Exception e){
            return "Failed to update the car's image " + e.getMessage();
        }
    }

}
