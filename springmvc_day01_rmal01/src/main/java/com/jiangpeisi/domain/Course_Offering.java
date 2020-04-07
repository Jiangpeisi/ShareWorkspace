package com.jiangpeisi.domain;

import java.util.List;

/**
 * 已开课程
 */
public class Course_Offering {
    private Integer id;
    private Integer course_id;
    private Integer teacher_id;
    private List<Student> students;
    private List<Course_Resource> resources;
    private Course course;
    private Teacher teacher;


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Course_Resource> getResources() {
        return resources;
    }

    public void setResources(List<Course_Resource> resources) {
        this.resources = resources;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course_Offering{" +
                "id=" + id +
                ", course_id=" + course_id +
                ", teacher_id=" + teacher_id +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }
}
