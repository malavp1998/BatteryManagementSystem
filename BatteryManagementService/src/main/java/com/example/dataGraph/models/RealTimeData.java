package com.example.dataGraph.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RealTimeData {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable = false, updatable = false)
	private Long id;
	@Column(nullable = true)
	String status;
	@Column(nullable = true)
	String time;
	@Column(nullable = true)
	double batteryVoltage;
	@Column(nullable = true)
	double batteryCurrent;
	@Column(nullable = true)
	double temperature1;
	@Column(nullable = true)
	double temperature2;
	@Column(nullable = true)
	double temperature3;
	@Column(nullable = true)
	double fullChargeCapacity;
	@Column(nullable = true)
	String soc;
	@Column(nullable = true)
	double cellVoltage1;
	@Column(nullable = true)
	double cellVoltage2;
	@Column(nullable = true)
	double cellVoltage3;
	@Column(nullable = true)
	double cellVoltage4;
	@Column(nullable = true)
	double cellVoltage5;
	@Column(nullable = true)
	double cellVoltage6;
	@Column(nullable = true)
	double cellVoltage7;
	@Column(nullable = true)
	double cellVoltage8;
	@Column(nullable = true)
	double cellVoltage9;
	@Column(nullable = true)
	double cellVoltage10;
	@Column(nullable = true)
	double cellVoltage11;
	@Column(nullable = true)
	double cellVoltage12;
	@Column(nullable = true)
	double cellVoltage13;
	@Column(nullable = true)
	double cellVoltage14;
	@Column(nullable = true)
	double cellVoltage15;
	@Column(nullable = true)
	double cellVoltage16;
	@Column(nullable = true)
	double cellVoltage17;
	@Column(nullable = true)
	double cellVoltage18;
	@Column(nullable = true)
	double cellVoltage19;
	@Column(nullable = true)
	double cellVoltage20;
	@Column(nullable = true)
	double cellVoltage21;
	@Column(nullable = true)
	double cellVoltage22;
	@Column(nullable = true)
	double cellVoltage23;
	@Column(nullable = true)
	double cellVoltage24;
	@Column(nullable = true)
	String  selfDischarge;
	@Column(nullable = true)
	int cycles;
	@Column(nullable = true)
	String chargeFetStatus;
	@Column(nullable = true)
	String dischargeFetStatus;
	@Column(nullable = true)
	double power;
	@Column(nullable = true)
	String shortCircuit;
	
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public double getBatteryCurrent() {
		return batteryCurrent;
	}
	public void setBatteryCurrent(double batteryCurrent) {
		this.batteryCurrent = batteryCurrent;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDate() {
		return time;
	}
	public void setDate(String date) {
		this.time = date;
	}
	public double getBatteryVoltage() {
		return batteryVoltage;
	}
	public void setBatteryVoltage(double batteryVoltage) {
		this.batteryVoltage = batteryVoltage;
	}
	public double getTemperature1() {
		return temperature1;
	}
	public void setTemperature1(double temperature1) {
		this.temperature1 = temperature1;
	}
	public double getTemperature2() {
		return temperature2;
	}
	public void setTemperature2(double temperature2) {
		this.temperature2 = temperature2;
	}
	public double getTemperature3() {
		return temperature3;
	}
	public void setTemperature3(double temperature3) {
		this.temperature3 = temperature3;
	}
	public double getFullChargeCapacity() {
		return fullChargeCapacity;
	}
	public void setFullChargeCapacity(double fullChargeCapacity) {
		this.fullChargeCapacity = fullChargeCapacity;
	}
	public String getSoc() {
		return soc;
	}
	public void setSoc(String soc) {
		this.soc = soc;
	}
	public double getCellVoltage1() {
		return cellVoltage1;
	}
	public void setCellVoltage1(double cellVoltage1) {
		this.cellVoltage1 = cellVoltage1;
	}
	public double getCellVoltage2() {
		return cellVoltage2;
	}
	public void setCellVoltage2(double cellVoltage2) {
		this.cellVoltage2 = cellVoltage2;
	}
	public double getCellVoltage3() {
		return cellVoltage3;
	}
	public void setCellVoltage3(double cellVoltage3) {
		this.cellVoltage3 = cellVoltage3;
	}
	public double getCellVoltage4() {
		return cellVoltage4;
	}
	public void setCellVoltage4(double cellVoltage4) {
		this.cellVoltage4 = cellVoltage4;
	}
	public double getCellVoltage5() {
		return cellVoltage5;
	}
	public void setCellVoltage5(double cellVoltage5) {
		this.cellVoltage5 = cellVoltage5;
	}
	public double getCellVoltage6() {
		return cellVoltage6;
	}
	public void setCellVoltage6(double cellVoltage6) {
		this.cellVoltage6 = cellVoltage6;
	}
	public double getCellVoltage7() {
		return cellVoltage7;
	}
	public void setCellVoltage7(double cellVoltage7) {
		this.cellVoltage7 = cellVoltage7;
	}
	public double getCellVoltage8() {
		return cellVoltage8;
	}
	public void setCellVoltage8(double cellVoltage8) {
		this.cellVoltage8 = cellVoltage8;
	}
	public double getCellVoltage9() {
		return cellVoltage9;
	}
	public void setCellVoltage9(double cellVoltage9) {
		this.cellVoltage9 = cellVoltage9;
	}
	public double getCellVoltage10() {
		return cellVoltage10;
	}
	public void setCellVoltage10(double cellVoltage10) {
		this.cellVoltage10 = cellVoltage10;
	}
	public double getCellVoltage11() {
		return cellVoltage11;
	}
	public void setCellVoltage11(double cellVoltage11) {
		this.cellVoltage11 = cellVoltage11;
	}
	public double getCellVoltage12() {
		return cellVoltage12;
	}
	public void setCellVoltage12(double cellVoltage12) {
		this.cellVoltage12 = cellVoltage12;
	}
	public double getCellVoltage13() {
		return cellVoltage13;
	}
	public void setCellVoltage13(double cellVoltage13) {
		this.cellVoltage13 = cellVoltage13;
	}
	public double getCellVoltage14() {
		return cellVoltage14;
	}
	public void setCellVoltage14(double cellVoltage14) {
		this.cellVoltage14 = cellVoltage14;
	}
	public double getCellVoltage15() {
		return cellVoltage15;
	}
	public void setCellVoltage15(double cellVoltage15) {
		this.cellVoltage15 = cellVoltage15;
	}
	public double getCellVoltage16() {
		return cellVoltage16;
	}
	public void setCellVoltage16(double cellVoltage16) {
		this.cellVoltage16 = cellVoltage16;
	}
	public double getCellVoltage17() {
		return cellVoltage17;
	}
	public void setCellVoltage17(double cellVoltage17) {
		this.cellVoltage17 = cellVoltage17;
	}
	public double getCellVoltage18() {
		return cellVoltage18;
	}
	public void setCellVoltage18(double cellVoltage18) {
		this.cellVoltage18 = cellVoltage18;
	}
	public double getCellVoltage19() {
		return cellVoltage19;
	}
	public void setCellVoltage19(double cellVoltage19) {
		this.cellVoltage19 = cellVoltage19;
	}
	public double getCellVoltage20() {
		return cellVoltage20;
	}
	public void setCellVoltage20(double cellVoltage20) {
		this.cellVoltage20 = cellVoltage20;
	}
	public double getCellVoltage21() {
		return cellVoltage21;
	}
	public void setCellVoltage21(double cellVoltage21) {
		this.cellVoltage21 = cellVoltage21;
	}
	public double getCellVoltage22() {
		return cellVoltage22;
	}
	public void setCellVoltage22(double cellVoltage22) {
		this.cellVoltage22 = cellVoltage22;
	}
	public double getCellVoltage23() {
		return cellVoltage23;
	}
	public void setCellVoltage23(double cellVoltage23) {
		this.cellVoltage23 = cellVoltage23;
	}
	public double getCellVoltage24() {
		return cellVoltage24;
	}
	public void setCellVoltage24(double cellVoltage24) {
		this.cellVoltage24 = cellVoltage24;
	}
	public String getSelfDischarge() {
		return selfDischarge;
	}
	public void setSelfDischarge(String selfDischarge) {
		this.selfDischarge = selfDischarge;
	}
	public int getCycles() {
		return cycles;
	}
	public void setCycles(int cycles) {
		this.cycles = cycles;
	}
	public String getChargeFetStatus() {
		return chargeFetStatus;
	}
	public void setChargeFetStatus(String chargeFetStatus) {
		this.chargeFetStatus = chargeFetStatus;
	}
	public String getDischargeFetStatus() {
		return dischargeFetStatus;
	}
	public void setDischargeFetStatus(String dischargeFetStatus) {
		this.dischargeFetStatus = dischargeFetStatus;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	public String getShortCircuit() {
		return shortCircuit;
	}
	public void setShortCircuit(String shortCircuit) {
		this.shortCircuit = shortCircuit;
	}

}
