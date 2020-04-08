package com.jiangpeisi.service;

import com.jiangpeisi.domain.CourseOffering;
import com.jiangpeisi.domain.CourseResource;
import com.jiangpeisi.domain.Student;

import java.util.List;
import java.util.Map;

public interface IStudentService {

    public String insert(Student student);
    public String delete(Student student);
    public String update(Student student);
    public String login(Student student);
    public String updatePassword(Student student);
    public Student findByName(String name);
    public String chooseCourse(CourseOffering co, Student student);
    public List<CourseOffering> findChooseCourse(Student student);
}
