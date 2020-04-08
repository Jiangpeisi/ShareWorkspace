package com.jiangpeisi.service.impl;

import com.jiangpeisi.dao.ICourseEnrollmentDao;
import com.jiangpeisi.dao.ICourseOfferingDao;
import com.jiangpeisi.dao.ICourseOfferingResourceDao;
import com.jiangpeisi.domain.CourseOffering;
import com.jiangpeisi.domain.CourseResource;
import com.jiangpeisi.domain.Student;
import com.jiangpeisi.service.ICourseOfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("courseOfferingService")
public class CourseOfferingServiceImpl implements ICourseOfferingService {
    @Autowired
    ICourseEnrollmentDao courseEnrollmentDao;
    @Autowired
    ICourseOfferingResourceDao courseOfferingResourceDao;
    @Autowired
    ICourseOfferingDao courseOfferingDao;
    @Override
    public List<Student> findStudents(CourseOffering co) {
        return courseEnrollmentDao.findByCourseOffering(co);
    }

    @Override
    public List<CourseResource> findCourseResources(CourseOffering co) {
        return courseOfferingResourceDao.findByCourseOffering(co);
    }

    @Override
    public List<CourseOffering> findAll() {
        return courseOfferingDao.findAll();
    }
}

