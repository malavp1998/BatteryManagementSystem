package com.example.dataGraph.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dataGraph.models.CalculatedData;

@Repository
public interface CalculatedDataRepository extends JpaRepository<CalculatedData, Long>{

}
