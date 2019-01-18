package com.qa.persistence.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

@Entity
public class Classroom {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long classroomId;

	private String trainerName;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "classroom")
	private List<Trainee> trainee;

	public Classroom() {

	}

	public Classroom(String trainerName, List<Trainee> trainee) {

		this.setTrainerName(trainerName);
		this.setTrainee(trainee);
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public Long getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(Long classroomId) {
		this.classroomId = classroomId;
	}

	public List<Trainee> getTrainee() {
		return trainee;
	}

	public void setTrainee(List<Trainee> trainee) {
		this.trainee = trainee;
	}

}
