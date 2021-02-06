package com.example.dataGraph.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Battery {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable = false, updatable = false)
	private Long id;
	@Column(name="currentt",nullable = true)
	private int current;
	@Column(nullable = true)
	private String voltage;
	@Column(nullable = true)
	private double charge;
	public Battery() {
		
	}
	public Long getId() {
		return id; 
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public String getVoltage() {
		return voltage;
	}
	public void setVoltage(String voltage) {
		this.voltage = voltage;
	}
	public double getCharge() {
		return charge;
	}
	public void setCharge(double charge) {
		this.charge = charge;
	}
    

	
	
}
