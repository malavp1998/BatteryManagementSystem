package com.example.dataGraph.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dataGraph.models.Battery;

@Repository
public interface BatteryRepository extends JpaRepository<Battery, Long>{

}
