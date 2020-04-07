package com.jiangpeisi.dao;

import com.jiangpeisi.domain.CourseOffering;
import com.jiangpeisi.domain.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICourseEnrollmentDao {

    @Insert("insert into course_choose(course_offering_id,student_id) values(#{course_offering_id},#{student_id})")
    void insert(@Param("course_offering_id") Integer courseOfferingId, @Param("student_id") Integer studentId);


    @Delete("delete from course_choose where course_offering_id=#{course_offering_id} and student_id=#{student_id}")
    void delete(@Param("course_offering_id") Integer courseOfferingId, @Param("student_id") Integer studentId);

    @Select("select student_id from course_choose where course_offering_id=#{id}")
    @Results(value = {
            @Result(column = "student_id",
                    one = @One(select = "com.jiangpeisi.dao.ICourseDao.findById")),
    })
    List<Student> findByCourseOffering(CourseOffering co);

    @Select("select course_offering_id from course_choose where student_id=#{id}")
    @Results(
            @Result(column = "course_offering_id",
                    one = @One(select = "com.jiangpeisi.dao.ICourseDao.findById"))
    )
    List<CourseOffering> findByStudent(Student student);
}
