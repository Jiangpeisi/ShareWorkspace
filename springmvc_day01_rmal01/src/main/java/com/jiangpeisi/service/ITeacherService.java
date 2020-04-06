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
    public String offerCourse(Course_Offering course_offering);
    public Course_Offering findChooseStudent(Course_Offering course_offering);
    public String uploadResource(Course_Resource course_resource);
    public String quote_Resource(Course_Offering_Resource course_offering_resource);
    public Course_Offering findQuoteResource(Course_Offering course_offering);
}
