package com.playground.test.SimpleCRUD.service;

import org.springframework.http.ResponseEntity;

public interface StudentService {

	ResponseEntity<?> getStudent(String sId, String sName);

}
