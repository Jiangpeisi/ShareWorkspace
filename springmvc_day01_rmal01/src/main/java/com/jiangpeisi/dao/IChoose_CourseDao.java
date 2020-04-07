package com.jiangpeisi.dao;

import com.jiangpeisi.domain.Course_Choose;
import org.springframework.stereotype.Repository;

@Repository
public interface IChoose_CourseDao {
    /**
     * 选课
     * @param _courseChoose
     */
    void insert(Course_Choose _courseChoose);

    /**
     * 删除选课
     * @param _courseChoose
     */
    void delete(Course_Choose _courseChoose);
}
