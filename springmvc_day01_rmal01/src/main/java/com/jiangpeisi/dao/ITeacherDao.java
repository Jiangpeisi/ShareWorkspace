package com.jiangpeisi.dao;

import com.jiangpeisi.domain.Teacher;
import org.springframework.stereotype.Repository;

/**
 * 持久层教师接口
 */
@Repository
public interface ITeacherDao{
    public Teacher findTeacher(Teacher teacher);
}
