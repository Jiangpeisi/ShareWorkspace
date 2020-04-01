package com.jiangpeisi.service.impl;

import com.jiangpeisi.dao.ITeacherDao;
import com.jiangpeisi.domain.Teacher;
import com.jiangpeisi.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("teacherService")
public class TeacherServiceImpl implements ITeacherService {
    @Autowired
    ITeacherDao teacherDao;
    @Override
    public String login(Teacher teacher) {
        if(teacherDao.findTeacher(teacher)!=null)
            return "登陆成功";
        else
            return "账户不存在或密码错误";
    }
}
