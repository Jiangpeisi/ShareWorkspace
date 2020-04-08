package com.jiangpeisi.dao;

import com.jiangpeisi.domain.Course;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICourseDao {

    @Insert("insert into course (name,description,course_img_url) values (#{name},#{description})")
    public void insert(Course course);

    @Update("update course set name=#{name}, description = #{description} ,course_img_url=#{course_img_url} where id=#{id}")
    public void update(Course course);

    @Delete("delete from course where id={#id}")
    public void delete(Course course);

    @Select("select * from course where id=#{id}")
    public Course findById(Integer id);

    @Select("select * from course where name=#{name}")
    public List<Course> findByName(String name);

    @Select("select * from course")
    public List<Course> findAll(Course course);
}
