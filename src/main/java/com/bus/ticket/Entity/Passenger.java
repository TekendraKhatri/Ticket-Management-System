package com.bus.ticket.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Table
@Entity
public class Passenger {
@Id
   private String name;
   private int phone;
    private String route;
    private  int id;

    @OneToMany(targetEntity = Passenger.class, cascade =  CascadeType.ALL)
    @JoinColumn(name = "buspas_fk" , referencedColumnName = "id")
     private List<Passenger> passengers;
   /* public Passenger( String name, int phone , String route , int id){
       super();
       this.name= name;
       this.phone =phone;
       this.route= route;
       this.id= id;
    }


    public Passenger() {
        super();
    }

    */
}
