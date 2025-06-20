package com.main.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;


@Entity
public class Person {
	@Id
    private int pId;
    private String pName;
    
    @OneToOne(cascade = CascadeType.ALL)
    private AdharCard ad;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public AdharCard getAd() {
		return ad;
	}

	public void setAd(AdharCard ad) {
		this.ad = ad;
	}
    
    
   
}
