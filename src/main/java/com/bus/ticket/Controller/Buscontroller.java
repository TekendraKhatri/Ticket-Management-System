package com.bus.ticket.Controller;


import com.bus.ticket.Passengerservice.PassengerService;
import com.bus.ticket.Entity.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Buscontroller {
    @Autowired
private PassengerService passengerService;

    @GetMapping("/findticket")
      public List<Passenger> getTicket(){
        return this.passengerService.getTicket();
    }
    @GetMapping("/findticketonebyone")
    public  Passenger getTicket(@PathVariable String passengerId){
        return this.passengerService.getTicket(Integer.parseInt(passengerId));
    }
    @PostMapping ("/passenger")
    public Passenger addTicket(@RequestBody Passenger passenger){
        return  this.passengerService.addTicket(passenger);
    }
    @PutMapping("/passenger/{passengerId}")
    public  Passenger updateTicket(@RequestBody Passenger passenger,@PathVariable Integer passengerId){
        return  this.passengerService.updateTicket(passenger,passengerId);
    }
    @DeleteMapping("/passenger/{passengerId}")
    public void deleteTicket(@PathVariable Integer passengerId){
        this.passengerService.deleteTicket(passengerId);
    }
}

