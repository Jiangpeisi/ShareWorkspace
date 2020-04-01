package com.jiangpeisi.service;

import com.jiangpeisi.domain.Notice;

import java.util.List;

public interface INoticeService {
    public List<Notice> findAll();
    public String insert(Notice notice);
}
