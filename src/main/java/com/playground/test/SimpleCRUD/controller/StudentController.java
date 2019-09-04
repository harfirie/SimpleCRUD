package com.playground.test.SimpleCRUD.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.playground.test.SimpleCRUD.service.StudentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api")
public class StudentController {

	Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	StudentService service;
	
	@RequestMapping(method=RequestMethod.GET, value="/student/get")
	public ResponseEntity<?> getStudentController(@RequestParam String SId, @RequestParam String SName){
		log.info("");
		logger.info("");
		ResponseEntity<?> response = null;
		
		if(!SId.isEmpty() && !SName.isEmpty()) {
			response = service.getStudent(SId, SName);
		}
		else {
//			throw error
		}
		
		return response;
	}
}
