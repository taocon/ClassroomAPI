package com.qa.business.service;

public interface ClassroomService {

	String getAllClassrooms();

	String addClassroom(String account);

	String deleteClassroom(Long id);
	String updateClassroom(Long id,String input);

}