package com.jiangpeisi.dao;

import com.jiangpeisi.domain.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICourseDao {
    void insert(Course course);
    void update(Course course);
    void delete(Course course);
    Course findByName(String name);
    Course findById(Integer id);
    List<Course> findAll();
}
