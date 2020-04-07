package com.jiangpeisi.dao;

import com.jiangpeisi.domain.Teacher;
import org.junit.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 持久层教师接口
 */
@Repository
public interface ITeacherDao {

    Teacher findById(Integer id);

    /**
     * 根据教师姓名查询
     *
     * @param name
     * @return
     */
    Teacher findByName(String name);

    /**
     * 插入教师
     *
     * @param teacher
     */
    void insert(Teacher teacher);

    /**
     * 删除注销
     *
     * @param teacher
     */
    void delete(Teacher teacher);

    /**
     * 更新信息
     *
     * @param teacher
     */
    void update(Teacher teacher);

    /**
     * 更改密码
     *
     * @param teacher
     */
    void updatePassword(Teacher teacher);
}
