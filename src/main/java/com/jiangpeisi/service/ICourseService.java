package com.jiangpeisi.service;

import com.jiangpeisi.domain.Course;
import com.jiangpeisi.domain.CourseOffering;
import com.jiangpeisi.domain.Student;

import java.util.List;

public interface ICourseService {

    boolean insert(Student student);

    boolean delete(Student student);

    boolean update(Student student);

    Course findById(Integer id);

    List<Course> findByName(String name);

    List<Course> findAll(Course course);

    boolean offeringCourse(CourseOffering co);


}
