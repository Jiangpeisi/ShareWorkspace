package com.jiangpeisi.dao;

import com.jiangpeisi.domain.Notice;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface INoticeDao {
    public List<Notice> findAll();
    public void insert(Notice notice);
}
