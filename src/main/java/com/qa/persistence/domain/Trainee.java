package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

@Entity
public class Trainee {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long traineeId;


	private String trainerFullName;
	
	
	
	 @ManyToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name = "classroomId", insertable = false, updatable = false)
	    private Classroom classroom;
	
	public Trainee() {

	}

	public Trainee(String trainerFullName) {
		
		this.setTrainerFullName(trainerFullName);
	
		
	}

	public String getTrainerFullName() {
		return trainerFullName;
	}

	public void setTrainerFullName(String trainerFullName) {
		this.trainerFullName = trainerFullName;
	}
	
	public Long getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(Long traineeId) {
		this.traineeId = traineeId;
	}


}
