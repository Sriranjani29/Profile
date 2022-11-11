package com.travel.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "profiles")

public class Profile {

	private String fullName;
	private long phoneNo;
    private String email;
	private int flatNo;
	private String streetName;
	private String landMark;
	private String city;
	private String state;
	private String country;
	
	
	
	
	
	
	
	
	
}
