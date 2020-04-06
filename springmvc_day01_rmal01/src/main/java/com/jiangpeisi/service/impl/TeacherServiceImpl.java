package com.jiangpeisi.service.impl;

import com.jiangpeisi.dao.*;
import com.jiangpeisi.domain.*;
import com.jiangpeisi.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("teacherService")
public class TeacherServiceImpl implements ITeacherService {

    @Autowired
    ITeacherDao teacherDao;
    @Autowired
    ICourseDao courseDao;
    @Autowired
    ICourse_OfferingDao course_offeringDao;
    @Autowired
    ICourse_ResourceDao course_resourceDao;
    @Autowired
    ICourse_Offering_ResourceDao course_offering_resourceDao;
    @Override
    public String insert(Teacher teacher) {
        if (teacherDao.findByName(teacher.getUsername())==null){
            teacherDao.insert(teacher);
            return "注册成功";
        }else {
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
        System.out.println("参数"+teacher);
        Teacher temp=teacherDao.findByName(teacher.getUsername());
        System.out.println("temp"+temp);
        if (temp==null){
            return "账户不存在";
        }
        else if(temp.getPassword().equals(teacher.getPassword())){
            return "登陆成功";
        }
        else{
            return "密码错误";
        }
    }

    @Override
    public String updatePassword(Teacher teacher) {
        Teacher temp=teacherDao.findByName(teacher.getUsername());
        if(temp==null){
            return "更改失败,用户不存在";
        }
        else if (temp.getFindkey().equals(teacher.getFindkey())){
            teacherDao.updatePassword(teacher);
            return "更改成功";
        }
        else {
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
    public String offerCourse(Course_Offering course_offering) {
        course_offeringDao.insert(course_offering);
        return "开课成功";
    }

    @Override
    public Course_Offering findChooseStudent(Course_Offering course_offering) {
        return course_offeringDao.get_choose_student(course_offering);
    }

    @Override
    public String uploadResource(Course_Resource course_resource) {
        course_resourceDao.insert(course_resource);
        return "上传成功";
    }

    @Override
    public String quote_Resource(Course_Offering_Resource course_offering_resource) {
        course_offering_resourceDao.insert(course_offering_resource);
        return "引用成功";
    }

    @Override
    public Course_Offering findQuoteResource(Course_Offering course_offering) {
        return course_offeringDao.get_quote_resource(course_offering);
    }
}
