package com.jiangpeisi.domain;

/**
 * 开课课程包含的资源
 */
public class Course_Offering_Resource {
    private Integer course_offering_id;
    private Integer course_resource_id;

    @Override
    public String toString() {
        return "Course_Offering_Resource{" +
                "course_offering_id=" + course_offering_id +
                ", course_resource_id=" + course_resource_id +
                '}';
    }

    public Integer getCourse_offering_id() {
        return course_offering_id;
    }

    public void setCourse_offering_id(Integer course_offering_id) {
        this.course_offering_id = course_offering_id;
    }

    public Integer getCourse_resource_id() {
        return course_resource_id;
    }

    public void setCourse_resource_id(Integer course_resource_id) {
        this.course_resource_id = course_resource_id;
    }
}
