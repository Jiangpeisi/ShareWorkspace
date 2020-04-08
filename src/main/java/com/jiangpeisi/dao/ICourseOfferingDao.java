package com.jiangpeisi.dao;

import com.jiangpeisi.domain.CourseOffering;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICourseOfferingDao {

    @Insert("insert into course_offering( course_id, teacher_id) values( #{course.id}, #{teacher.id})")
    void insert(CourseOffering co);

    @Update("update course_offering set course_id=#{course.id}, teacher_id=#{teacher.id} where id=#{id}")
    void update(CourseOffering co);

    @Delete("delete from course_offering where id = #{id}")
    void delete(CourseOffering co);

    @Select("select * from course_offering where id=#{id}")
    @Results(id = "CourseOfferingMap",
            value = {
                    @Result(id = true, column = "id", property = "id"),
                    @Result(column = "course_id", property = "course",
                            one = @One(select = "com.jiangpeisi.dao.ICourseDao.findById")),
                    @Result(column = "teacher_id", property = "teacher",
                            one = @One(select = "com.jiangpeisi.dao.ITeacherDao.findById")),
            })
    CourseOffering findById(Integer id);

    @Select("select * from course_offering")
    @ResultMap("CourseOfferingMap")
    List<CourseOffering> findAll();

    @Select("select * from course_offering where course_id=#{id}")
    @ResultMap("CourseOfferingMap")
    List<CourseOffering> findByCourse(Integer id);

    @Select("select * from course_offering where teacher_id=#{id}")
    @ResultMap("CourseOfferingMap")
    List<CourseOffering> findByTeacher(Integer id);

   }
