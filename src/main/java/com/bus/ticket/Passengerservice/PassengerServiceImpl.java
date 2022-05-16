package com.bus.ticket.Passengerservice;

import com.bus.ticket.Entity.Passenger;
import com.bus.ticket.Repository.Passengerrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerServiceImpl implements PassengerService {
    @Autowired
    private Passengerrepo passengerrepo;

    @Override
    public List<Passenger> getTicket() {
        return passengerrepo.findAll();
    }

    @Override
    public Passenger getTicket(Integer passengerId) {
        return passengerrepo.findById(passengerId).get();

    }

    @Override
    public Passenger addTicket(Passenger passenger) {
        return passengerrepo.save(passenger);
    }

    @Override
    public Passenger updateTicket(Passenger passenger, Integer passengerId) {
        com.bus.ticket.Entity.Passenger p = passengerrepo.getById(passengerId);
        p.setId(passenger.getId());
        p.setName(passenger.getName());
        p.setPhone(passenger.getPhone());
        p.setRoute(passenger.getRoute());
        return this.passengerrepo.save(p);
    }

    @Override
    public void deleteTicket(Integer passengerId) {
        Passenger p = passengerrepo.getById(passengerId);
        this.passengerrepo.delete(p);
    }
}
