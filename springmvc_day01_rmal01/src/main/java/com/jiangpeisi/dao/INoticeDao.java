package com.jiangpeisi.dao;

import com.jiangpeisi.domain.Notice;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface INoticeDao {
    @Select("select * from notice")
    List<Notice> findAll();
    @Insert("insert into notice (title, content, release_time, announcer)values (#{title}, #{content}, #{release_time}, #{announcer})")
    void insert(Notice notice);
}
