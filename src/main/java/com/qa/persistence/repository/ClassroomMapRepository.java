package com.qa.persistence.repository;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import com.qa.persistence.domain.Classroom;
import com.qa.util.JSONUtil;


@Alternative
public class ClassroomMapRepository implements ClassroomRepository {

	private Map<Integer, Classroom> classroomMap = new HashMap<>();
	@Inject
	private JSONUtil util;

//  I have this here so I can carry out my junit tests
//	private JSONUtil util = new JSONUtil();
	public String getAllClassrooms() {
		return util.getJSONForObject(classroomMap);
	}


	@Override
	public String createClassroom(String classroom) {
		Classroom theClassroom = util.getObjectForJSON(classroom, Classroom.class);
		classroomMap.put(theClassroom.getClassroomID(), theClassroom);
		return "Classroom successfully created";
	}

	public Map<Integer, Classroom> getClassroomMap() {
		return classroomMap;
	}
}
