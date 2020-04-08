package com.jiangpeisi.domain.dataWrapper;

public class CourseOfferingTest {
    Integer courseOfferingId;
    Integer courseTestId;

    public Integer getCourseOfferingId() {
        return courseOfferingId;
    }

    public void setCourseOfferingId(Integer courseOfferingId) {
        this.courseOfferingId = courseOfferingId;
    }

    public Integer getCourseTestId() {
        return courseTestId;
    }

    public void setCourseTestId(Integer courseTestId) {
        this.courseTestId = courseTestId;
    }

    @Override
    public String toString() {
        return "CourseOfferingTest{" +
                "courseOfferingId=" + courseOfferingId +
                ", courseTestId=" + courseTestId +
                '}';
    }
}
