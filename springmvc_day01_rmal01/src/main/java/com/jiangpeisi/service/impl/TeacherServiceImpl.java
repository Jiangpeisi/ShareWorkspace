package com.jiangpeisi.service.impl;

import com.jiangpeisi.dao.*;
import com.jiangpeisi.domain.*;
import com.jiangpeisi.domain.dataWrapper.CourseOfferingResource;
import com.jiangpeisi.service.ITeacherService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("teacherService")
public class TeacherServiceImpl implements ITeacherService {

    @Autowired
    ITeacherDao teacherDao;
    @Autowired
    ICourseDao courseDao;
    @Autowired
    ICourseOfferingDao courseOfferingDao;
    @Autowired
    ICourseResourceDao course_resourceDao;
    @Autowired
    ICourseOfferingResourceDao courseOfferingResourceDao;

    @Override
    public String insert(Teacher teacher) {
        if (teacherDao.findByName(teacher.getUsername()) == null) {
            teacherDao.insert(teacher);
            return "注册成功";
        } else {
            return "用户已存在";
        }
    }

    @Override
    public String delete(Teacher teacher) {
        teacherDao.delete(teacher);
        return "删除成功";
    }

    @Override
    public String update(Teacher teacher) {
        teacherDao.update(teacher);
        return "信息更新成功";
    }

    @Override
    public String login(Teacher teacher) {
        System.out.println("参数" + teacher);
        Teacher temp = teacherDao.findByName(teacher.getUsername());
        System.out.println("temp" + temp);
        if (temp == null) {
            return "账户不存在";
        } else if (temp.getPassword().equals(teacher.getPassword())) {
            return "登陆成功";
        } else {
            return "密码错误";
        }
    }

    @Override
    public String updatePassword(Teacher teacher) {
        Teacher temp = teacherDao.findByName(teacher.getUsername());
        if (temp == null) {
            return "更改失败,用户不存在";
        } else if (temp.getFindkey().equals(teacher.getFindkey())) {
            teacherDao.updatePassword(teacher);
            return "更改成功";
        } else {
            return "更改失败，密钥错误";
        }
    }

    @Override
    public Teacher findByName(String name) {
        return teacherDao.findByName(name);
    }

    @Override
    public String createCourse(Course course) {
        courseDao.insert(course);
        return "创建成功";
    }

    @Override
    public String offerCourse(CourseOffering courseOffering) {
        courseOfferingDao.insert(courseOffering);
        return "开课成功";
    }

    //TODO
    @Override
    public CourseOffering findChooseStudent(CourseOffering courseOffering) {
        return null;
    }



    @Override
    public String uploadResource(CourseResource courseResource) {
        course_resourceDao.insert(courseResource);
        return "上传成功";
    }

    @Override
    public String quoteResource(CourseOffering courseOffering, CourseResource courseResource) {
        CourseOfferingResource cor = new CourseOfferingResource();
        cor.setCourseResourceId(courseOffering.getId());
        cor.setCourseOfferingId(courseResource.getId());
        courseOfferingResourceDao.insert(cor);
        return "引用成功";
    }


    //TODO
    @Override
    public CourseOffering findQuoteResource(CourseOffering course_offering) {
        return null;
    }

}
