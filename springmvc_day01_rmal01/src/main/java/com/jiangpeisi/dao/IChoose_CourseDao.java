package com.jiangpeisi.dao;

import com.jiangpeisi.domain.Course_Choose;
import org.springframework.stereotype.Repository;

@Repository
public interface IChoose_CourseDao {
    void insert(Course_Choose _courseChoose);
    void delete(Course_Choose _courseChoose);
}
