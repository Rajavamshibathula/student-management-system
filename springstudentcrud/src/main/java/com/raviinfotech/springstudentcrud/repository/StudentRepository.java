package com.raviinfotech.springstudentcrud.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raviinfotech.springstudentcrud.dto.Student;

import jakarta.persistence.Query;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	@org.springframework.data.jpa.repository.Query("select s from Student s where s.email=?1")
	Student login(String email);

	
	
}
