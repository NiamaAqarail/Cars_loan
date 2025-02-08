package https.github.com.NiamaAqarail.backend.controller;

import https.github.com.NiamaAqarail.backend.dto.ClientDTO;
import https.github.com.NiamaAqarail.backend.dto.LocationDTO;
import https.github.com.NiamaAqarail.backend.dto.VoitureDTO;
import https.github.com.NiamaAqarail.backend.model.Location;
import https.github.com.NiamaAqarail.backend.repository.ClientRepository;
import https.github.com.NiamaAqarail.backend.repository.VoitureRepository;
import https.github.com.NiamaAqarail.backend.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    private LocationService locationService;

    @PostMapping("/add")
    public String addLocation(@RequestBody Location location){
        try{
            locationService.addLocation(location);
            return "Loan added successfully";
        }catch(Exception e){
            return "Failed to add the loan information"+e.getMessage();
        }
    }
    @GetMapping("/all")
    public List<Location> getLocations(){
        return locationService.getLocations();
    }
    @GetMapping("/get")
    public Location getLocation(@RequestParam Integer id){
        return locationService.getLocation(id);
    }
    @PutMapping("/update/{id}")
    public String updateLocation(@PathVariable Integer id, @RequestBody Location location){
        try{
            locationService.updateLocation(id, location);
            return "Loan updated successfully";
        }catch(Exception e){
            return "Failed to update the loan information : "+e.getMessage();
        }
    }
    @DeleteMapping("/delete/{id}")
    public String deleteLocation(@PathVariable Integer id){
        try{
            locationService.deleteLocation(id);
            return "Loan information deleted successfuly";
        }catch(Exception e){
            return "Failed to delete loan information";
        }
    }
    @PatchMapping("/update-client/{id}")
    public String updateLocationClient(@PathVariable Integer id, @RequestBody ClientDTO clientDTO){
        try{
            locationService.updateLocationClient(id,clientDTO);
            return "The loans client was updated successfully";
        }catch (Exception e){
            return "Failed to update the loans client";
        }
    }
    @PatchMapping("/update-voiture/{id}")
    public String updateLocationVoiture(@PathVariable Integer id, @RequestBody VoitureDTO voitureDTO){
       try{
           locationService.updateLocationVoiture(id,voitureDTO);
           return "The loans car was updated successfully";
       } catch(Exception e){
           return "Failed to update the loans cat";
       }
    }
    @PatchMapping("/update-datedebut/{id}")
    public String updateLocationDateDeb(@PathVariable Integer id, @RequestBody LocationDTO locationDTO){
        try{
            locationService.updateLocationDateDeb(id,locationDTO);
            return "loan starting date was updated successfully";
        }catch (Exception e){
            return "Failed to update the starting date for the loan";
        }
    }
    @PatchMapping("/update-datefin/{id}")
    public String updateLocationDateFin(@PathVariable Integer id, @RequestBody LocationDTO locationDTO){
        try{
            locationService.updateLocationDateFin(id,locationDTO);
            return "loan ending date was updated successfully";
        }catch (Exception e){
            return "Failed to update the ending date for the loan";
        }
    }
    @PatchMapping("/update-etat/{id}")
    public String updateLocationEtat(@PathVariable Integer id, @RequestBody LocationDTO locationDTO){

        try{
            locationService.updateLocationEtat(id,locationDTO);
            return "loan state was updated successfully";
        }catch (Exception e){
            return "Failed to update the state for the loan";
        }
    }
}
