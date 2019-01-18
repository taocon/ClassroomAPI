package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;

import com.qa.business.service.ClassroomService;
import com.qa.persistence.domain.Classroom;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class ClassroomDBRepository implements ClassroomRepository {
	
	
	
	
	
// tells the manager to look in the persistence xml and use the persistence unit called primary
	@PersistenceContext(unitName = "primary")
	
	
	private EntityManager manager;
	@Inject
	private JSONUtil util;

	public String getAllClassrooms() {
//		Query query = manager.createQuery("Select a FROM Account a");
//		Collection<Account> accounts = (Collection<Account>) query.getResultList();
//		return util.getJSONForObject(accounts);
		
		Query query= manager.createQuery("Select a from account a");
		Collection<Classroom> result = (Collection<Classroom>) query.getResultList();
		return util.getJSONForObject(result);
	}

	@Transactional(REQUIRED)
	public String createClassroom(String accout) {
		Classroom aClassroom = util.getObjectForJSON(accout, Classroom.class);
		manager.persist(aClassroom);
		return "{\"message\": \"account has been sucessfully added\"}";
	}
	
	@Transactional(REQUIRED)
	public String updateClassroom(Long id,String accountToUpdate) {
		Classroom updatedClassroom = util.getObjectForJSON(accountToUpdate, Classroom.class);
		Classroom classroomFromDB = findAccount(id);
		if (accountToUpdate != null) {
			classroomFromDB = updatedClassroom;
			manager.merge(classroomFromDB);
		}
		return "{\"MESSAGE\" : \"account was succesfully updated\"}";
	}

	@Transactional(REQUIRED)
	public String deleteClassroom(Long id) {
		Classroom classroomInDB = findAccount(id);
		if (classroomInDB != null) {
			manager.remove(classroomInDB);
		}
		return "{\"message\": \"account sucessfully deleted\"}";
	}

	private Classroom findAccount(Long id) {
		return manager.find(Classroom.class, id);
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}

}
