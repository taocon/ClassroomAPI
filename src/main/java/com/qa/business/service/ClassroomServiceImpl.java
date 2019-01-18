package com.qa.business.service;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.persistence.domain.Classroom;
import com.qa.persistence.repository.ClassroomRepository;
import com.qa.util.JSONUtil;

public class ClassroomServiceImpl implements ClassroomService {

	@Inject
	private ClassroomRepository repo;

	@Inject
	private JSONUtil util;

	public String getAllClassrooms() {
		return repo.getAllClassrooms();
	}

	public String addClassroom(String account) {
			return repo.createClassroom(account);
		}
	

	public String deleteClassroom(Long id) {
		return repo.deleteClassroom(id);
	}

	public void setRepo(ClassroomRepository repo) {
		this.repo = repo;
	}

	public String updateClassroom(Long id, String input) {
	
		return repo.updateClassroom(id, input);
	}
}
