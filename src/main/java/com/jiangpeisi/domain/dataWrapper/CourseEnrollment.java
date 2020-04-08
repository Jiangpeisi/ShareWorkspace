package com.jiangpeisi.domain.dataWrapper;

import java.io.Serializable;

public class CourseEnrollment implements Serializable {
    Integer courseOfferingId;
    Integer studentId;

    public Integer getCourseOfferingId() {
        return courseOfferingId;
    }

    public void setCourseOfferingId(Integer courseOfferingId) {
        this.courseOfferingId = courseOfferingId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "CourseEnrollment{" +
                "courseOfferingId=" + courseOfferingId +
                ", studentId=" + studentId +
                '}';
    }
}
