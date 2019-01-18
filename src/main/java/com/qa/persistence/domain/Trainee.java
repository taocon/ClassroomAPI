package com.qa.persistence.domain;

import javax.persistence.Entity;
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
	private int classroomId;
	
	
//	 @JoinColumn(name="classroomId", nullable=false)
//	    @ManyToOne
//	    private Classroom trainer;
	
	public Trainee() {

	}

	public Trainee(String trainerFullName, int classroomId) {
		
		this.setTrainerFullName(trainerFullName);
		this.setClassroomId(classroomId);
		
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

	public int getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(int classroomId) {
		this.classroomId = classroomId;
	}
}
