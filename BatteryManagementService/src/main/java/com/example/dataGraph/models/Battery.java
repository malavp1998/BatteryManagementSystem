package com.example.dataGraph.models;

public class Battery {

	
	int current[]= {65, 60, 40, 80, 83, 45, 55, 40, 78, 0};
	int voltage[]= {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
	public Battery(int[] voltage, int[] current) {
		super();
		this.voltage = voltage;
		this.current = current;
	}
	public Battery() {
		
	}
	public int[] getVolatage() {
		return voltage;
	}
	public void setVolatage(int[] volatage) {
		this.voltage = volatage;
	}
	public int[] getCurrent() {
		return current;
	}
	public void setCurrent(int[] current) {
		this.current = current;
	}
	
}
