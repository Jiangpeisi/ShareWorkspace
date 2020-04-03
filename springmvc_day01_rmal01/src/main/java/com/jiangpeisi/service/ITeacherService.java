package com.jiangpeisi.service;

import com.jiangpeisi.domain.Course;
import com.jiangpeisi.domain.Student;
import com.jiangpeisi.domain.Teacher;

public interface ITeacherService {
    public String insert(Teacher teacher);
    public String delete(Teacher teacher);
    public String update(Teacher teacher);
    public String login(Teacher teacher);
    public String updatePassword(Teacher teacher);
    public Teacher findByName(String name);
    public String createCourse(Course course);
}
