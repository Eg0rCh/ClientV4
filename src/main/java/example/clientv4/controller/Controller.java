package example.clientv4.controller;


import example.clientv4.model.Client;
import example.clientv4.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client")
public class Controller {


   private final ClientService clientService;

    public Controller(ClientService clientService) {
        this.clientService = clientService;
    }
    @PostMapping
    public void createClient(@RequestBody ClientRequest clientRequest){
        clientService.createClient(clientRequest);
 //       return clientRequest.getId();
    }
    @GetMapping
    public List<Client> getClientById(@RequestParam long id){
        return clientService.findClientById(id);
    }

    // добавить Update @Put


    @DeleteMapping
    public void deleteClientById(@RequestParam long id){
        clientService.deleteClientById(id);
    }


//    @GetMapping
//    private Iterable<Client> filterByType(
//            List<Client> clients, Type type){
//        return clients
//                .stream()
//                .filter(x-> x.getType().equals(type))
//                .collect(Collectors.toList());
//    }
//    @GetMapping
//    public Iterable<Client> findAll(){
//        return clientRepository.findAll();
//    }





}
