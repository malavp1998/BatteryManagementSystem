package com.example.dataGraph.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dataGraph.models.Battery;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BatteryController {

	
	@GetMapping("/battery/voltage")
	public Battery getVoltage()
	{
		return new Battery();
	}
}