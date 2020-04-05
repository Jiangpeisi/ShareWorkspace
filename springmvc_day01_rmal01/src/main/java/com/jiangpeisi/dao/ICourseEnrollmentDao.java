package com.jiangpeisi.dao;

import com.jiangpeisi.domain.CourseEnrollment;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseEnrollmentDao {
    public void insert(CourseEnrollment _courseChoose);
    public void delete(CourseEnrollment _courseChoose);
}
