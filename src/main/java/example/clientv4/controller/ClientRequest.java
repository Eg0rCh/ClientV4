package example.clientv4.controller;


import example.clientv4.model.Type;
import lombok.Data;

@Data
public class ClientRequest {


    private String name;
    private boolean qualified;
    private String email;

    private Type type;


}
