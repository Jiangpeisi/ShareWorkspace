package com.jiangpeisi.domain.dataWrapper;

import com.jiangpeisi.domain.Course;
import com.jiangpeisi.domain.CourseOffering;
import com.jiangpeisi.domain.CourseResource;

import java.io.Serializable;

public class CourseOfferingResource implements Serializable {
    Integer courseOfferingId;
    Integer courseResourceId;

    public Integer getCourseOfferingId() {
        return courseOfferingId;
    }

    public void setCourseOfferingId(Integer courseOfferingId) {
        this.courseOfferingId = courseOfferingId;
    }

    public Integer getCourseResourceId() {
        return courseResourceId;
    }

    public void setCourseResourceId(Integer courseResourceId) {
        this.courseResourceId = courseResourceId;
    }

    @Override
    public String toString() {
        return "CourseOfferingResource{" +
                "courseOfferingId=" + courseOfferingId +
                ", courseResourceId=" + courseResourceId +
                '}';
    }
}
