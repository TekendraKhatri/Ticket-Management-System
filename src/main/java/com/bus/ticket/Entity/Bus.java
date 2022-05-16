package com.bus.ticket.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
public class Bus {

    private  int time;
    private int price;
    private String route;
    private int schedule;
    private  int id;


    public Bus (int time, int price, int schedule, String route , int id ){
        super();
        this.time = time;
        this.price =price;
        this.route = route;
        this.schedule= schedule;
        this.id= id;

    }

    public Bus() {
        super();
    }
}
