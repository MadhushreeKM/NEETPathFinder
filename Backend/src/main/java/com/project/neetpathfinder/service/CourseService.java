package com.project.neetpathfinder.service;

import java.util.List;

import com.project.neetpathfinder.model.Course;


public interface CourseService {

    public List<Course> getCourses();
    //	public Course getCourseById();
    public List<Course> getCourse(String state,String courseId,Long rank);
//	public Course addCourse(Course course);
//	public Course updateCourse(Course course);
//	public void deleteCourse(long parseLong);
}
