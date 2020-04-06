package com.jiangpeisi.service;

import com.jiangpeisi.domain.Course_Choose;
import com.jiangpeisi.domain.Course_Resource;
import com.jiangpeisi.domain.Student;

public interface IStudentService {
    public String insert(Student student);
    public String delete(Student student);
    public String update(Student student);
    public String login(Student student);
    public String updatePassword(Student student);
    public Student findByName(String name);
    public String chooseCourse(Course_Choose course_choose);
    public Student findChooseCourse(Student student);
    public Course_Resource findCourseById(int id);
}
