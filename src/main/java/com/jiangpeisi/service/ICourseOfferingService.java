package com.jiangpeisi.service;

import com.jiangpeisi.domain.CourseOffering;
import com.jiangpeisi.domain.CourseResource;
import com.jiangpeisi.domain.Student;

import java.util.List;

public interface ICourseOfferingService {
    /**
     * 查询选课的所有学生
     */
    List<Student> findStudents(CourseOffering co);
    /**
     * 查询课程引用的资料
     * @param co
     * @return
     */
    List<CourseResource> findCourseResources(CourseOffering co);
    /**
     * 查询所有已开课程
     * @return
     */
    List<CourseOffering> findAll();
}
