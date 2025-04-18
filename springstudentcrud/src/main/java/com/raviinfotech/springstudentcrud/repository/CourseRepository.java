package com.raviinfotech.springstudentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raviinfotech.springstudentcrud.dto.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}
