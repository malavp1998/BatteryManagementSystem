package com.example.dataGraph.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dataGraph.models.RealTimeData;

@Repository
public interface RealTimeDataRepository extends JpaRepository<RealTimeData, Long>{
 
}
