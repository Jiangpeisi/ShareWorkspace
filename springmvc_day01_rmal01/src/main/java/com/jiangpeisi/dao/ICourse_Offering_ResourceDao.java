package com.jiangpeisi.dao;

import com.jiangpeisi.domain.Course_Offering_Resource;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourse_Offering_ResourceDao {
    void insert(Course_Offering_Resource course_offering_resource);
}
