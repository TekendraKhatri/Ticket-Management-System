package com.bus.ticket.Repository;

import com.bus.ticket.Entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Passengerrepo extends JpaRepository<Passenger, Integer> {

    }

