package com.example.dataGraph.services.impl;

import com.example.dataGraph.models.RealTimeData;
import com.example.dataGraph.services.CalculatedDataService;
import org.springframework.stereotype.Service;

@Service("SumCalculatorService")
public class SumCalculatorService implements CalculatedDataService {
    @Override
    public double calculate(RealTimeData realTimeData) {
        return realTimeData.getCellVoltage1() + realTimeData.getCellVoltage2();
    }
}
