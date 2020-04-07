package com.jiangpeisi.dao;

import com.jiangpeisi.domain.CourseOffering;
import com.jiangpeisi.domain.CourseResource;
import com.jiangpeisi.domain.dataWrapper.CourseOfferingResource;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICourseOfferingResourceDao {

    @Insert("insert into course_offering_resource (course_offering_id,course_resource_id) values (#{course_offering.id},#{course_resource.id})")
    void insert(@Param("course_offering") CourseOffering co, @Param("course_resource") CourseResource cr);

    @Select("select * from course_offering_resource")
    @Results(id = "courseOfferingResourceMap",
            value = {
                    @Result(id = true, column = "course_offering_id", property = "courseOfferingId"),
                    @Result(id = true, column = "course_resource_id", property = "courseResourceId")
            }
    )
    List<CourseOfferingResource> findAll();

    @Select("select course_offering_id from course_offering_resource where course_resource_id=#{id}")
    @Results(value = {
            @Result(id = true, column = "course_offering_id", one = @One(select = "com.jiangpeisi.dao.ICourseOfferingDao.findById"))
    })
    List<CourseOffering> findByCourseResource(CourseResource courseResource);

    @Select("select course_resource_id from course_offering_resource where course_offering_id=#{id}")
    @Results(value = {
            @Result(id = true, column = "course_resource_id", one = @One(select = "com.jiangpeisi.dao.ICourseResourceDao.findById"))
    })
    List<CourseResource> findByCourseOffering(CourseOffering courseOffering);

}
