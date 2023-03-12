package kz.dar.academy.backend.service;

import kz.dar.academy.backend.model.ClientRequest;
import kz.dar.academy.backend.model.ClientResponse;
import org.apache.catalina.Session;
import org.apache.catalina.Store;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

@Service
public abstract class ClientService extends ClientServiceImpl {
    @Autowired
    private ClientRepository clientRepository;


    @Override
    public List<Object> getAllClients() {

        Optional mapper = null;
        Object ClientResponse = new Object();
        List<Object> objects = Collections.singletonList(clientRepository.getClientEntitiesBy()
                .stream().map(entity -> mapper.map((Function) ClientResponse))
                .toList());
        return objects;

    }

    public Optional createTask(ClientRequest task) throws IOException {

        Logger log = null;
        log.info("Client request: " + task);
        task.setClientId(UUID.randomUUID().toString());

        Optional<Object> mapper = Optional.empty();
        Function<? super Object, ?> client = null;
        Optional<?> clientEntity = mapper.map(client);
        log.info("Task entity: " + clientEntity);
        Store clientRepository = null;
        Session clientId = null;
        ClientEntity result;
        clientRepository.save(null);

        Function<? super Object, ?> ClientResponse = null;
        return mapper.map(null);

    }


    @Override
    public void deleteClientById(String clientId) {

        Object clientResponse = null;
        clientRepository.deleteClientById(clientResponse);

    }


    public ClientResponse getClientById(String clientId) {
        return null;
    }
}
