package com.playground.test.SimpleCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.playground.test.SimpleCRUD.entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long>{

	@Query("SELECT SId, SName FROM StudentEntity WHERE SId=?1 AND SName=?2")
	public StudentEntity getStudentProfile(String id, String name);
}
