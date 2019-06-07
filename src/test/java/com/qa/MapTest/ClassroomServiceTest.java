package com.qa.MapTest;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import com.qa.persistence.domain.Classroom;
import com.qa.persistence.repository.ClassroomMapRepository;
import com.qa.util.JSONUtil;

public class ClassroomServiceTest {

	private ClassroomMapRepository cmr;
	private JSONUtil util;
	private Classroom classroom1 = new Classroom(1, "Matt Hunt");
	private Classroom classroom2 = new Classroom(2, "Chester Gardner");
	
	
	@Before
	public void setup() {
		cmr = new ClassroomMapRepository();
		util = new JSONUtil();	
	}
	
	@Ignore
	@Test
	public void getAllAccountsTest() {
		assertEquals("{}", cmr.getAllClassrooms());
	}
	
	@Ignore
	@Test
	public void getAllAccountsTest2() {
		cmr.getClassroomMap().put(1, classroom1);
		assertEquals("{\"1\":{\"classroomID\":1,\"trainer\":\"Matt Hunt\"}}", cmr.getAllClassrooms());
	}
	@Ignore
	@Test
	public void getAllAccountsTest3() {
		cmr.getClassroomMap().put(1, classroom1);
		cmr.getClassroomMap().put(2, classroom2);
		assertEquals("{\"1\":{\"classroomID\":1,\"trainer\":\"Matt Hunt\"},\"2\":{\"classroomID\":2,\"trainer\":\"Chester Gardner\"}}", cmr.getAllClassrooms());
	}
	
	@Ignore
	@Test
	public void addClassroomTest() {
		String classToAdd = util.getJSONForObject(classroom1);
		assertEquals(cmr.createClassroom(classToAdd), "Classroom successfully created");
		assertEquals(cmr.getClassroomMap().size(), 1);
	}
	@Ignore
	@Test
	public void addClassroomTest2() {
	
		assertEquals(cmr.createClassroom(util.getJSONForObject(classroom1)), "Classroom successfully created");
		assertEquals(cmr.createClassroom(util.getJSONForObject(classroom2)), "Classroom successfully created");
		assertEquals(cmr.getClassroomMap().size(), 2);
	}

	
}
