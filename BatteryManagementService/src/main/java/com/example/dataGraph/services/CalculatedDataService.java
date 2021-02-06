package com.example.dataGraph.services;

import java.util.List;

import com.example.dataGraph.models.RealTimeData;

public interface CalculatedDataService {

	double calculation();
	List<RealTimeData> getAllRealTimeData();
}
