package https.github.com.NiamaAqarail.backend.controller;

import https.github.com.NiamaAqarail.backend.dto.ClientDTO;
import https.github.com.NiamaAqarail.backend.model.Client;
import https.github.com.NiamaAqarail.backend.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping("/add/{id}")
    public ResponseEntity<Void> addClient(@PathVariable Integer id, @RequestBody Client client){
        clientService.addClient(id, client);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/all")
    public List<Client> getClient(){
        return  clientService.getClients();
    }
    @GetMapping("/get")
    public Client getClient(@RequestParam Integer id){
        return clientService.getClient(id);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updateClient(@PathVariable Integer id, @RequestBody Client client){
        clientService.updateClient(id, client);
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable Integer id){
        clientService.deleteClient(id);
        return ResponseEntity.noContent().build();
    }
    @PatchMapping("/update-nom/{id}")
    public ResponseEntity<Void> updateNom(@PathVariable Integer id, @RequestBody ClientDTO clientDTO){
        clientService.updateNom(id, clientDTO);
        return ResponseEntity.noContent().build();
    }
    @PatchMapping("/update-prenom/{id}")
    public ResponseEntity<Void> updatePrenom(@PathVariable Integer id,@RequestBody ClientDTO clientDTO){
        clientService.updatePrenom(id, clientDTO);
        return ResponseEntity.noContent().build();
    }
    @PatchMapping("/update-cni/{id}")
    public ResponseEntity<Void> updateCni(@PathVariable Integer id,@RequestBody ClientDTO clientDTO){
        clientService.updateCni(id, clientDTO);
        return ResponseEntity.noContent().build();
    }
    @PatchMapping("/update-tel/{id}")
    public ResponseEntity<Void> updateTel(@PathVariable Integer id,@RequestBody ClientDTO clientDTO){
        clientService.updateTel(id, clientDTO);
        return ResponseEntity.noContent().build();
    }
    @PatchMapping("/update-adresse/{id}")
    public ResponseEntity<Void> updateAdresse(@PathVariable Integer id,@RequestBody ClientDTO clientDTO){
        clientService.updateAdresse(id, clientDTO);
        return ResponseEntity.noContent().build();
    }
    @PatchMapping("/update-numpermis/{id}")
    public ResponseEntity<Void> updateNumPermis(@PathVariable Integer id,@RequestBody ClientDTO clientDTO){
        clientService.updateNumPermis(id, clientDTO);
        return ResponseEntity.noContent().build();
    }
}