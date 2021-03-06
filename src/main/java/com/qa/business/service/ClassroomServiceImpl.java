package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.repository.ClassroomRepository;

public class ClassroomServiceImpl implements ClassroomService{

	@Inject
	private ClassroomRepository classroomRepo;
	
	@Override
	public String createClassroom(String classroom) {
		return classroomRepo.createClassroom(classroom);
	}

	
	public String getAllClassrooms() {
		return classroomRepo.getAllClassrooms();
	}


	
}
