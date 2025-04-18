package com.raviinfotech.springstudentcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.raviinfotech.springstudentcrud.dto.Course;
import com.raviinfotech.springstudentcrud.service.CourseService;
import com.raviinfotech.springstudentcrud.util.ResponseStructureCourse;

@RestController
public class CourseController {
	@Autowired
	private CourseService service;
	
	@PostMapping("/savecourse")
	public ResponseEntity<ResponseStructureCourse<Course>> saveCourse(@RequestBody List<Course> course) {
		return service.saveCourse(course);
	}
	

}
