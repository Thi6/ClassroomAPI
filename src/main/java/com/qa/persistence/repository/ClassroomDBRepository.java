package com.qa.persistence.repository;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.qa.persistence.domain.Classroom;
import com.qa.util.JSONUtil;


@Default
public class ClassroomDBRepository implements ClassroomRepository{
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil util;
	
	
	public String getAllClassrooms() {
		TypedQuery<Classroom> query = manager.createQuery("SELECT c FROM Classroom c", Classroom.class);
		Collection<Classroom> classrooms = query.getResultList();
		return util.getJSONForObject(classrooms);
	}

}
