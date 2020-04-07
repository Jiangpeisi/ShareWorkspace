package com.jiangpeisi.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseEnrollmentDao {

    @Insert("insert into course_choose(course_offering_id,student_id) values(#{course_offering_id},#{student_id})")
    public void insert(@Param("course_offering_id") Integer courseOfferingId, @Param("student_id") Integer studentId);


    @Delete("delete from course_choose where course_offering_id=#{course_offering_id} and student_id=#{student_id}")
    public void delete(@Param("course_offering_id") Integer courseOfferingId, @Param("student_id") Integer studentId);


}
