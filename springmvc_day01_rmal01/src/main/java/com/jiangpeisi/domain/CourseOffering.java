package com.jiangpeisi.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 已开课程
 */
public class CourseOffering implements Serializable {
    private Integer id;
    private Course course;
    private Teacher teacher;
    private List<Student> students;
    private List<CourseResource> courseResources;
    private List<CourseTest> courseTests;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<CourseResource> getCourseResources() {
        return courseResources;
    }

    public void setCourseResources(List<CourseResource> courseResources) {
        this.courseResources = courseResources;
    }

    public List<CourseTest> getCourseTests() {
        return courseTests;
    }

    public void setCourseTests(List<CourseTest> courseTests) {
        this.courseTests = courseTests;
    }

    @Override
    public String toString() {
        return "CourseOffering{" +
                "id=" + id +
                ", course=" + course +
                ", teacher=" + teacher +
                ", students=" + students +
                ", courseResources=" + courseResources +
                ", courseTests=" + courseTests +
                '}';
    }


}
