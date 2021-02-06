package com.example.dataGraph.services.impl;

import com.example.dataGraph.models.RealTimeData;
import com.example.dataGraph.services.CalculatedDataService;
import org.springframework.stereotype.Service;

@Service("AvgCalculatorService")
public class AvgCalculatorService implements CalculatedDataService {
    @Override
    public double calculate(RealTimeData realTimeData) {
        return (realTimeData.getBatteryCurrent() + realTimeData.getBatteryVoltage())/2;
    }
}
