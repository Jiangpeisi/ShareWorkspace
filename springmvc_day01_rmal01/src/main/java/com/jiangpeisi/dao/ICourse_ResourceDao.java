package com.jiangpeisi.dao;

import com.jiangpeisi.domain.Course_Resource;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourse_ResourceDao {
void insert(Course_Resource course_resource);
void delete(Course_Resource course_resource);
Course_Resource findById(int id);
}
