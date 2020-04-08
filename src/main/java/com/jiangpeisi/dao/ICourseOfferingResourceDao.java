package com.jiangpeisi.dao;

import com.jiangpeisi.domain.CourseOffering;
import com.jiangpeisi.domain.CourseResource;
import com.jiangpeisi.domain.dataWrapper.CourseOfferingResource;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICourseOfferingResourceDao {

    @Insert("insert into course_offering_resource (course_offering_id,course_resource_id) values (#{courseOfferingId},#{courseResourceId})")
    void insert(CourseOfferingResource courseOfferingResource);

    @Select("select * from course_offering_resource")
    @Results(id = "courseOfferingResourceMap",
            value = {
                    @Result(id = true, column = "course_offering_id", property = "courseOfferingId"),
                    @Result(id = true, column = "course_resource_id", property = "courseResourceId")
            }
    )
    List<CourseOfferingResource> findAll();

    @Select("SELECT table2.id , table2.course_id, table2.teacher_id\n" +
            "FROM (select course_offering_id from course_offering_resource where course_resource_id = 3) AS table1\n" +
            "         INNER JOIN course_offering AS table2 ON table1.course_offering_id = table2.id")
    @ResultMap("com.jiangpeisi.dao.ICourseOfferingDao.CourseOfferingMap")
    List<CourseOffering> findByCourseResource(CourseResource courseResource);

    @Select("SELECT table2.id, table2.course_id, table2.url, table2.name, table2.type\n" +
            "FROM (select course_resource_id from course_offering_resource where course_offering_id=#{id}) AS table1\n" +
            "INNER JOIN course_resource AS table2 ON table1.course_resource_id = table2.id")
    @ResultMap("com.jiangpeisi.dao.ICourseResourceDao.courseResourceMap")
    List<CourseResource> findByCourseOffering(CourseOffering co);
}
