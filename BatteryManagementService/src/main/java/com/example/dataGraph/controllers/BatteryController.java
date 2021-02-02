package com.example.dataGraph.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dataGraph.models.Battery;
import com.example.dataGraph.repositories.BatteryRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BatteryController {

	@Autowired
	BatteryRepository batteryRepository;
	
	@GetMapping("/battery/voltage")
	public List<Battery> getVoltage()
	{
	//  Battery b=batteryRepository.findById((long)1);
		List<Battery> batteryList = batteryRepository.findAll();
		return batteryList;
	}
	
}