package com.jiangpeisi.dao;

import com.jiangpeisi.domain.Course_Choose;
import org.springframework.stereotype.Repository;

@Repository
public interface IChoose_CourseDao {
    public void insert(Course_Choose _courseChoose);
    public void delete(Course_Choose _courseChoose);
}
