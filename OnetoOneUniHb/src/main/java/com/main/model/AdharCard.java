package com.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AdharCard {
	
	@Id
	private int adharNo;
	private String adharName;
	public int getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(int adharNo) {
		this.adharNo = adharNo;
	}
	public String getAdharName() {
		return adharName;
	}
	public void setAdharName(String adharName) {
		this.adharName = adharName;
	}
	
	

}
