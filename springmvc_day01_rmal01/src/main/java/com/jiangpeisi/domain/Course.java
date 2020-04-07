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
    private String course_img_url;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", course_img_url='" + course_img_url + '\'' +
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

    public String getCourse_img_url() {
        return course_img_url;
    }

    public void setCourse_img_url(String course_img_url) {
        this.course_img_url = course_img_url;
    }
}
