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
    public Student findByName(String name);

    /**
     * 插入学生，用于注册
     * @param student
     */
    public void insert(Student student);

    /**
     * 删除学生，用于注销
     * @param student
     */
    public void delete(Student student);

    /**
     * 更新学生
     * @param student
     */
    public void update(Student student);

    /**
     * 修改学生密码
     * @param student
     */
    public void updatePassword(Student student);
}
