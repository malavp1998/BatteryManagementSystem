package com.example.dataGraph.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CalculatedData {
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable = false, updatable = false)
	private Long id;
	double  kwhRemaining;
	double avgTime;
	double maxTemp;
	double minTemp;
	double avgVoltage;
	double maxVoltage;
	double minVoltage;
	double avgDsgCurrent;
	double maxDsgCurrent;
	double maxChargeCurrent;
	double power;
 	String status;
 	double timeToCharge;
 	String timeToDischarge;
 	String lowCharge;
 	String overload;
 	String HighTemp;
 	String lowTemp;
 	String cellIssue;
 	String BmsIssue;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getKwhRemaining() {
		return kwhRemaining;
	}
	public void setKwhRemaining(double kwhRemaining) {
		this.kwhRemaining = kwhRemaining;
	}
	public double getAvgTime() {
		return avgTime;
	}
	public void setAvgTime(double avgTime) {
		this.avgTime = avgTime;
	}
	public double getMaxTemp() {
		return maxTemp;
	}
	public void setMaxTemp(double maxTemp) {
		this.maxTemp = maxTemp;
	}
	public double getMinTemp() {
		return minTemp;
	}
	public void setMinTemp(double minTemp) {
		this.minTemp = minTemp;
	}
	public double getAvgVoltage() {
		return avgVoltage;
	}
	public void setAvgVoltage(double avgVoltage) {
		this.avgVoltage = avgVoltage;
	}
	public double getMaxVoltage() {
		return maxVoltage;
	}
	public void setMaxVoltage(double maxVoltage) {
		this.maxVoltage = maxVoltage;
	}
	public double getMinVoltage() {
		return minVoltage;
	}
	public void setMinVoltage(double minVoltage) {
		this.minVoltage = minVoltage;
	}
	public double getAvgDsgCurrent() {
		return avgDsgCurrent;
	}
	public void setAvgDsgCurrent(double avgDsgCurrent) {
		this.avgDsgCurrent = avgDsgCurrent;
	}
	public double getMaxDsgCurrent() {
		return maxDsgCurrent;
	}
	public void setMaxDsgCurrent(double maxDsgCurrent) {
		this.maxDsgCurrent = maxDsgCurrent;
	}
	public double getMaxChargeCurrent() {
		return maxChargeCurrent;
	}
	public void setMaxChargeCurrent(double maxChargeCurrent) {
		this.maxChargeCurrent = maxChargeCurrent;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getTimeToCharge() {
		return timeToCharge;
	}
	public void setTimeToCharge(double timeToCharge) {
		this.timeToCharge = timeToCharge;
	}
	public String getTimeToDischarge() {
		return timeToDischarge;
	}
	public void setTimeToDischarge(String timeToDischarge) {
		this.timeToDischarge = timeToDischarge;
	}
	public String getLowCharge() {
		return lowCharge;
	}
	public void setLowCharge(String lowCharge) {
		this.lowCharge = lowCharge;
	}
	public String getOverload() {
		return overload;
	}
	public void setOverload(String overload) {
		this.overload = overload;
	}
	public String getHighTemp() {
		return HighTemp;
	}
	public void setHighTemp(String highTemp) {
		HighTemp = highTemp;
	}
	public String getLowTemp() {
		return lowTemp;
	}
	public void setLowTemp(String lowTemp) {
		this.lowTemp = lowTemp;
	}
	public String getCellIssue() {
		return cellIssue;
	}
	public void setCellIssue(String cellIssue) {
		this.cellIssue = cellIssue;
	}
	public String getBmsIssue() {
		return BmsIssue;
	}
	public void setBmsIssue(String bmsIssue) {
		BmsIssue = bmsIssue;
	}
 	
 	
 	
 	
}
