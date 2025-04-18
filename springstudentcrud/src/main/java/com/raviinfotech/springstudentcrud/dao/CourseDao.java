package com.raviinfotech.springstudentcrud.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.raviinfotech.springstudentcrud.dto.Course;
import com.raviinfotech.springstudentcrud.dto.Student;
import com.raviinfotech.springstudentcrud.repository.CourseRepository;

@Repository
public class CourseDao {
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private StudentDao studentDao;
	
	public List<Course> saveCourse(List<Course> course) {
		List<Course> courses = new ArrayList<>(); 
		for (Course course2 : course) {
			courses.add(courseRepository.save(course2));
		}
		return courses;
		
	}
	
	
	
	

}
