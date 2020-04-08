package com.jiangpeisi.dao;

import com.jiangpeisi.domain.Teacher;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.junit.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 持久层教师接口
 */
@Repository
public interface ITeacherDao {
    @Select("select * from teacher where id=#{id}")
    Teacher findById(Integer id);

    @Select("select * from teacher where username=#{name}")
    Teacher findByName(String name);

    @Insert("insert into teacher(username,password,findkey) values (#{username},#{password},#{findkey})")
    void insert(Teacher teacher);

    @Delete("delete from teacher where username=#{username}")
    void delete(Teacher teacher);

    @Update("update teacher set address=#{address},sex=#{sex},tel=#{tel},email=#{email},signature=#{signature},nickname=#{nickname},age=#{age},avatar=#{avatar} where username=#{username}")
    void update(Teacher teacher);

    @Update("update student set password = #{password} where username=#{username}")
    void updatePassword(Teacher teacher);
}
