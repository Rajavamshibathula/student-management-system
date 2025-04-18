package com.raviinfotech.springstudentcrud.dao;

import java.util.List;
import java.util.Optional;

import org.aspectj.apache.bcel.generic.ReturnaddressType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.raviinfotech.springstudentcrud.dto.Course;
import com.raviinfotech.springstudentcrud.dto.Student;
import com.raviinfotech.springstudentcrud.repository.CourseRepository;
import com.raviinfotech.springstudentcrud.repository.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	private StudentRepository repository;
	@Autowired
	private CourseRepository courseRepository;
	
	public Student saveStudent(Student student) {
		return repository.save(student);
	}
	
	public Student findStudentById(int id) {
		Optional<Student> student = repository.findById(id);
		if(student.isPresent()) {
			return student.get();
		}else
			return null;
	}
	
	public Student updateStudent(Student student) {
		Student studentdb=findStudentById(student.getId());
		if(studentdb != null) {
			return repository.save(studentdb);
		}else {
			return null;
		}
	}
	public Student addCourseToStudent(int sid,int cid) {
		Optional<Student> student = repository.findById(sid);
		Optional<Course> course = courseRepository.findById(cid);
		if(student.isPresent() && course.isPresent()) {
			Student student1 = student.get();
			Course course1 = course.get();
			List<Course> listCourses = student1.getCourse(); 
			listCourses.add(course1);
			student1.setCourse(listCourses);
			repository.save(student1);
			return student1;
		}else { 
			return null;
		}
	
	
	}
	
	public Student login(String email) {
		return repository.login(email); 
	}
	
	public Student deleteStudent(int sid) {
		Optional<Student> student=repository.findById(sid);
		if (student.isPresent()) {
			Student student1=student.get();
			 repository.delete(student1);
			 return student1; 
		}else {
			return null;
		}
	
		
	}
	
	
	}


