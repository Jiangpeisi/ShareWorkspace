package com.jiangpeisi.service;

import com.jiangpeisi.domain.*;

public interface ITeacherService {
    public String insert(Teacher teacher);

    public String delete(Teacher teacher);

    public String update(Teacher teacher);

    public String login(Teacher teacher);

    public String updatePassword(Teacher teacher);

    public Teacher findByName(String name);

    public String createCourse(Course course);

    public String offerCourse(CourseOffering courseOffering);

    public CourseOffering findChooseStudent(CourseOffering course_offering);

    public String uploadResource(CourseResource courseResource);

    public String quoteResource(CourseOffering courseOffering, CourseResource courseResource);

    public CourseOffering findQuoteResource(CourseOffering course_offering);
}
