package com.jiangpeisi.dao;

import com.jiangpeisi.domain.Course_Resource;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourse_ResourceDao {
    /**
     * 插入资料
     * @param course_resource
     */
    void insert(Course_Resource course_resource);

    /**
     * 删除资料
     * @param course_resource
     */
    void delete(Course_Resource course_resource);

    /**
     * 根据id查找资料
     * @param id
     * @return
     */
    Course_Resource findById(int id);
}
