package com.jiangpeisi.domain;

/**
 * 选课
 */
public class CourseEnrollment {
    private Integer course_offering_id;
    private Integer student_id;

    @Override
    public String toString() {
        return "Course_Choose{" +
                "course_offering_id=" + course_offering_id +
                ", student_id=" + student_id +
                '}';
    }

    public Integer getCourse_offering_id() {
        return course_offering_id;
    }

    public void setCourse_offering_id(Integer course_offering_id) {
        this.course_offering_id = course_offering_id;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }
}
