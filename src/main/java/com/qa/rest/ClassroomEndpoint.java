package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;

import com.qa.business.service.ClassroomService;

@Path("/classroom")
public class ClassroomEndpoint {
	
	@Inject
	private ClassroomService service;

	@Path("/getAllClassrooms")
	@GET
	@Produces({ "application/json" })
	public String getAllClassrooms() {
		return service.getAllClassrooms();
	}

	@Path("/createClassrooms")
	@POST
	@Produces({ "application/json" })
	public String addClassroom(String classroom) {
		return service.addClassroom(classroom);
	}

	@Path("/deleteClassroom/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteClassroom(@PathParam("id") Long id) {
		return service.deleteClassroom(id);
	}
	
	@Path("/updateClassroom/{id}")
	@PUT
	@Produces ({ "application/json"})
	public String updateClassroom(@PathParam("id") Long id, String input) {
		
	
		return service.updateClassroom(id, input);
		
		
		
	}
	

	public void setService(ClassroomService service) {
		this.service = service;
	}

}
