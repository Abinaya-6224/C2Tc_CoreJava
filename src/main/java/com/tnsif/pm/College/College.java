package com.tnsif.pm.College;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class College {
	private long id;
	private String name;
	private String address;
	private String accreditation;
	private LocalDate establishedDate;
	
	public College() {
		
	}
	public College(long id, String name, String address, String accreditation, LocalDate establishment) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.accreditation = accreditation;
		this.establishedDate = establishedDate;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAccreditation() {
		return accreditation;
	}
	public void setAccreditation(String accreditation) {
		this.accreditation = accreditation;
	}
	public LocalDate getEstablishedDate() {
		return establishedDate;
	}
	public void setEstablishedDate(LocalDate establishedDate) {
		this.establishedDate = establishedDate;
	}
}	