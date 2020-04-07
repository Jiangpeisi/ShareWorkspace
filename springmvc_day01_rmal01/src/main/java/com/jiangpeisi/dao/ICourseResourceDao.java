package com.jiangpeisi.dao;

import com.jiangpeisi.domain.CourseResource;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICourseResourceDao {

    @Insert("insert into course_resource (course_id,resource_url,resource_name,resource_type) values (#{courseId},#{resourceURL},#{resourceName},#{resourceType})")
    void insert(CourseResource cr);

    @Delete("delete from course_resource where id=#{id}")
    void delete(CourseResource cr);

    @Select("select * from course_resource where id=#{id}")
    @Results(id = "courseResourceMap",
            value = {@Result(id = true, column = "id", property = "id"),
                    @Result(column = "course_id", property = "courseId"),
                    @Result(column = "resource_url", property = "resourceURL"),
                    @Result(column = "resource_name", property = "resourceName"),
                    @Result(column = "resource_type", property = "resourceType"),
            }
    )
    CourseResource findById(int id);

    @Select("select * from course_resource")
    @ResultMap("courseResourceMap")
    List<CourseResource> findAll();

}
