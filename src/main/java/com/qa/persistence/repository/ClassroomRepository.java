package com.qa.persistence.repository;

public interface ClassroomRepository {

	String getAllClassrooms();
	String createClassroom(String accout);
	String deleteClassroom(Long id);
	String updateClassroom(Long id, String accountToUpdate);

}