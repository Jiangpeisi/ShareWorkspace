package com.jiangpeisi.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 所有课程
 */
public class Course implements Serializable {
    private Integer id;
    private String name;
    private String description;
    private List<CourseResource> courseResources;
    private List<CourseTest> courseTests;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", courseResources=" + courseResources +
                ", courseTests=" + courseTests +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
}
