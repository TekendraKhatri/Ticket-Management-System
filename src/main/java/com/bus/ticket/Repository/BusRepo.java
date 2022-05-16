package com.bus.ticket.Repository;

import com.bus.ticket.Entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepo extends JpaRepository <Bus , Integer> {
}
