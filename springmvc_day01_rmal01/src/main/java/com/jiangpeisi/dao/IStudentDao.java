package com.jiangpeisi.dao;

import com.jiangpeisi.domain.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * 持久层学生接口
 */
@Repository
public interface IStudentDao {
    @Select("select * from student where username=#{name}")
    Student findByName(String name);

    @Select("select * from student where id=#{id}")
    Student findById(Integer id);

    @Insert("INSERT INTO student(username,password,findkey) values (#{username},#{password},#{findkey})")
    void insert(Student student);

    @Delete("delete from student where username=#{username}")
    void delete(Student student);

    @Update("update student set address=#{address},sex=#{sex},tel=#{tel},email=#{email},signature=#{signature},nickname=#{nickname},age=#{age},avatar=#{avatar} where username=#{username}")
    void update(Student student);

    @Update("update student set password = #{password} where username=#{username}")
    void updatePassword(Student student);

}
