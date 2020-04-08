package com.jiangpeisi.service;

import com.jiangpeisi.domain.CourseOffering;
import com.jiangpeisi.domain.CourseResource;
import com.jiangpeisi.domain.Student;

import java.util.Map;

public interface IStudentService {
    public String insert(Student student);
    public String delete(Student student);
    public String update(Student student);
    public Map<String, String> login(Student student);
    public String updatePassword(Student student);
    public Student findByName(String name);
    public String chooseCourse(CourseOffering co, Student student);
    public Student findChooseCourse(Student student);
    public CourseResource findCourseById(int id);
}
