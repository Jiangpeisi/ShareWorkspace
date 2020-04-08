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

    @Override
    public String toString() {
        return "CourseOffering{" +
                "id=" + id +
                ", course=" + course +
                ", teacher=" + teacher +
                '}';
    }
}
