package com.jiangpeisi.dao;

import com.jiangpeisi.domain.Student;
import org.springframework.stereotype.Repository;

/**
 * 持久层学生接口
 */
@Repository
public interface IStudentDao {
    /**
     * 根据学生名查询
     * @param name
     * @return
     */
    Student findByName(String name);

    //todo
    Student findById(Integer id);


    /**
     * 插入学生，用于注册
     * @param student
     */
    void insert(Student student);

    /**
     * 删除学生，用于注销
     * @param student
     */
    void delete(Student student);

    /**
     * 更新学生
     * @param student
     */
    void update(Student student);

    /**
     * 修改学生密码
     * @param student
     */
    void updatePassword(Student student);

    Student get_choose_course(Student student);
}
