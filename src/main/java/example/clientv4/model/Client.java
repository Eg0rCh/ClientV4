package example.clientv4.model;


import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
public class Client   { //cоздать репозиторий и добавить @Repository
    @Id
    private long id;
    private String name;
    private boolean qualified;
    private String email;

    private Type type;

    //private LocalDateTime created;
     //
    private Date created = new Date(); // разобраться с аннотацией

}
