package kz.dar.academy.backend.controller;

import kz.dar.academy.backend.model.ClientResponse;
import kz.dar.academy.backend.service.ClientService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Data
@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;
    @GetMapping("/check")
    public String check() {
        return "client-core-api is working";
    }

    @GetMapping("/{clientId}")
    public ClientResponse getClientById() {
        return getClientById();
    }

    @GetMapping("/{clientId}")
    public ClientResponse getClientById(@PathVariable String clientId) {

        return clientService.getClientById(clientId);

    }
    @GetMapping("/all")
    private List<Object> getAllClients() {

        return clientService.getAllClients();

    }

    @PostMapping
    public ClientResponse createClientById() {
            return createClient();
        }

    @PostMapping
    public ClientResponse createClient() {

        return clientService.createClient();

    }

    @DeleteMapping("/{clientId}")
    public void deleteClient(@PathVariable String clientId) {



    }
}
