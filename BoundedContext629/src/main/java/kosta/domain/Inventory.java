package kosta.domain;

import kosta.BoundedContext629Application;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Inventory_table")
@Data

public class Inventory  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String id;
    
    
    
    
    
    private String name;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private Integer price;


    public static InventoryRepository repository(){
        InventoryRepository inventoryRepository = BoundedContext629Application.applicationContext.getBean(InventoryRepository.class);
        return inventoryRepository;
    }






}
