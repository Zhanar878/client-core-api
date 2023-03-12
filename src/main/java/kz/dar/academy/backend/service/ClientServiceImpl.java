package kz.dar.academy.backend.service;


import kz.dar.academy.backend.model.ClientResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public abstract class ClientServiceImpl {
    List<Object> getAllClients() {
        return null;
    }

    public ClientResponse createClient() {
        return null;
    }

    ClientResponse getClientByIdId(String clientId) {
        return null;
    }

    public void deleteClientById(String clientId) {

    }


    public abstract List<ClientResponse> getAllTasks();

    public abstract ClientResponse getClientById(String clientId);



    }

