package com.jiangpeisi.dao;

import com.jiangpeisi.domain.Course_Offering;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourse_OfferingDao {
    void insert(Course_Offering course_offering);
    void delete(Course_Offering course_offering);
    Course_Offering get_choose_student(Course_Offering course_offering);
    Course_Offering get_quote_resource(Course_Offering course_offering);
}
