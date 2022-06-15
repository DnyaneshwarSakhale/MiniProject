package com.zensar.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cabs")
public class Cab {
	@Id
	private int cabId;
	private String cabType;
	private float perKmRate;
	public Cab(int cabId, String cabType, float perKmRate) {
		super();
		this.cabId = cabId;
		this.cabType = cabType;
		this.perKmRate = perKmRate;
	}
	
	public Cab() {
		super();
	}

	public int getCabId() {
		return cabId;
	}
	public void setCabId(int cabId) {
		this.cabId = cabId;
	}
	public String getCabType() {
		return cabType;
	}
	public void setCabType(String cabType) {
		this.cabType = cabType;
	}
	public float getPerKmRate() {
		return perKmRate;
	}
	public void setPerKmRate(float perKmRate) {
		this.perKmRate = perKmRate;
	}
	@Override
	public String toString() {
		return "Cab [cabId=" + cabId + ", cabType=" + cabType + ", perKmRate=" + perKmRate + "]";
	}
	

}
