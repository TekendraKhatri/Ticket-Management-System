package com.bus.ticket.Passengerservice;

import com.bus.ticket.Entity.Passenger;

import java.util.List;

public interface PassengerService {

     public List<Passenger> getTicket();
     public  Passenger getTicket(Integer passengerId);
     public  Passenger addTicket(Passenger passenger);
     public  Passenger updateTicket(Passenger passenger ,  Integer passengerId);
     public  void deleteTicket( Integer passengerId);
}
