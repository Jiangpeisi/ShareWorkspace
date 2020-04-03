package com.jiangpeisi.dao;

import com.jiangpeisi.domain.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICourseDao {
    public void insert(Course course);
    public void update(Course course);
    public void delete(Course course);
    public Course findByName(String name);
    public List<Course> findAll(Course course);
}
