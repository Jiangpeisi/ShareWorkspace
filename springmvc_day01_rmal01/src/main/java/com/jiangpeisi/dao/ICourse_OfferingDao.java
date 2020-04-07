package com.jiangpeisi.dao;

import com.jiangpeisi.domain.Course_Offering;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourse_OfferingDao {
    /**
     * 开课
     * @param course_offering
     */
    void insert(Course_Offering course_offering);

    /**
     * 删除开课
     * @param course_offering
     */
    void delete(Course_Offering course_offering);

    /**
     * 获取选课学生信息
     * @param course_offering
     * @return
     */
    Course_Offering get_choose_student(Course_Offering course_offering);

    /**
     * 获取课程引用资料信息
     * @param course_offering
     * @return
     */
    Course_Offering get_quote_resource(Course_Offering course_offering);

    /**
     * 根据id查找
     * @param course_offering
     * @return
     */
    Course_Offering findById(Course_Offering course_offering);
}
