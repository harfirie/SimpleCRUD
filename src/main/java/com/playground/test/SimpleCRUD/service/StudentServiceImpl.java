package com.playground.test.SimpleCRUD.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.playground.test.SimpleCRUD.entity.StudentEntity;
import com.playground.test.SimpleCRUD.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository repo;
	
	public ResponseEntity<?> getStudent(String sId, String sName) {
		StudentEntity repoResult = null;
		ResponseEntity<?> finalResult = null;
		
		repoResult = repo.getStudentProfile(sId, sName);
		finalResult = ResponseEntity.status(HttpStatus.OK).body(repoResult);
		
		return finalResult;
	}

}
