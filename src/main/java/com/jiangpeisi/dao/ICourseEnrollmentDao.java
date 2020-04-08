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

    @Select("SELECT student.* FROM (select student_id from course_choose where course_offering_id=#{id}) AS table1\n" +
            "                 INNER JOIN student ON table1.student_id=student.id")
    List<Student> findByCourseOffering(CourseOffering co);

    @Select("SELECT table2.id, table2.course_id, table2.teacher_id \n" +
            "   FROM (select course_offering_id from course_choose where student_id=#{id}) AS table1\n" +
            "   INNER JOIN course_offering AS table2 ON table1.course_offering_id=table2.id")
    @ResultMap("com.jiangpeisi.dao.ICourseOfferingDao.CourseOfferingMap")
    List<CourseOffering> findByStudent(Student student);
}
