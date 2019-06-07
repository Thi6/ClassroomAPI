package com.qa.persistence.repository;

import java.util.HashMap;
import java.util.Map;

import com.qa.persistence.domain.Classroom;
import com.qa.util.JSONUtil;

public class ClassroomMapRepository implements ClassroomRepository {

	private Map<Integer, Classroom> classroomMap = new HashMap<>();

	private JSONUtil util = new JSONUtil();

	public String getAllClassrooms() {
		return util.getJSONForObject(classroomMap);
	}

	public Map<Integer, Classroom> getClassroomMap() {
		return classroomMap;
	}

}
