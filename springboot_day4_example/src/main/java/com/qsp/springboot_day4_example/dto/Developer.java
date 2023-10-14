package com.qsp.springboot_day4_example.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Developer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int developoerId;
	private String developerName;
	private double developerSalary;
	private long mblNum;
	private String developerCompany;
	private String developerAddress;

	public int getDevelopoerId() {
		return developoerId;
	}

	public void setDevelopoerId(int developoerId) {
		this.developoerId = developoerId;
	}

	public String getDeveloperName() {
		return developerName;
	}

	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}

	public double getDeveloperSalary() {
		return developerSalary;
	}

	public void setDeveloperSalary(double developerSalary) {
		this.developerSalary = developerSalary;
	}

	public long getMblNum() {
		return mblNum;
	}

	public void setMblNum(long mblNum) {
		this.mblNum = mblNum;
	}

	public String getDeveloperCompany() {
		return developerCompany;
	}

	public void setDeveloperCompany(String developerCompany) {
		this.developerCompany = developerCompany;
	}

	public String getDeveloperAddress() {
		return developerAddress;
	}

	public void setDeveloperAddress(String developerAddress) {
		this.developerAddress = developerAddress;
	}

}
