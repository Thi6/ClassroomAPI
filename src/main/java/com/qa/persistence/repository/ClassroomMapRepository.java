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

	public String getAllClassrooms() {
		return util.getJSONForObject(classroomMap);
	}

	public Map<Integer, Classroom> getClassroomMap() {
		return classroomMap;
	}

}
