package com.raviinfotech.springstudentcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.raviinfotech.springstudentcrud.dao.CourseDao;
import com.raviinfotech.springstudentcrud.dao.StudentDao;
import com.raviinfotech.springstudentcrud.dto.Course;
import com.raviinfotech.springstudentcrud.dto.Student;
import com.raviinfotech.springstudentcrud.exception.IdNotFound;
import com.raviinfotech.springstudentcrud.util.ResponseStructureCourse;

@Service
public class CourseService {
	@Autowired
	private CourseDao dao;
	
	
	private ResponseStructureCourse<Course> structure = new ResponseStructureCourse();
	
	public ResponseEntity<ResponseStructureCourse<Course>> saveCourse(List<Course> course) {
			List<Course> list=dao.saveCourse(course);
			structure.setData(list);
			structure.setMsg("course saved");
			structure.setStatusCode(HttpStatus.CREATED.value());
			return new ResponseEntity<ResponseStructureCourse<Course>>(structure,HttpStatus.CREATED);
	}
	
	

}
