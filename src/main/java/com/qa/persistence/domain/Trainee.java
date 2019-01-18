package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Trainee {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long classroomId;


	private String trainerFullName;
	
	public Trainee() {

	}

	public Trainee(String trainerFullName) {
		
		this.trainerFullName= trainerFullName;
	}
}
