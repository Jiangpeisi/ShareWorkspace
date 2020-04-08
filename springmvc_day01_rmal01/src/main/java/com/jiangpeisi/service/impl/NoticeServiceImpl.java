package com.jiangpeisi.service.impl;

import com.jiangpeisi.dao.INoticeDao;
import com.jiangpeisi.domain.Notice;
import com.jiangpeisi.service.INoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import java.util.List;

/**
 * Notice服务实现类
 */
@Service("noticeService")
public class NoticeServiceImpl implements INoticeService {
    @Autowired
    INoticeDao noticeDao;

    @Override
    public List<Notice> findAll() {
        return  noticeDao.findAll();
    }

    @Override
    public String insert(Notice notice) {
        noticeDao.insert(notice);
        return "发布成功";
    }
}