package example.clientv4.service;

import example.clientv4.controller.ClientRequest;
import example.clientv4.model.Client;
import example.clientv4.model.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Long createClient(ClientRequest clientrequest) {
        Client client = new Client();     //засунуть в сервис и переписать на репозиторий (spring data jdbc repository)
        client.setName(clientrequest.getName());
        client.setQualified(clientrequest.isQualified());
        client.setEmail(clientrequest.getEmail());
        client.setType(clientrequest.getType());
        client = clientRepository.save(client);
        return client.getId();
    }

    public List<Client> findClientById(long id){
        return clientRepository.findClientById(id);
    }

    public void deleteClientById(long id){
        clientRepository.deleteById(id);

    }



}
