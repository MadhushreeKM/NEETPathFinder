package com.project.neetpathfinder.dao;

import com.project.neetpathfinder.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CourseDao extends JpaRepository<Course,String> {

}
