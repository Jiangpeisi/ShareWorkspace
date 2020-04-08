package com.jiangpeisi.service.impl;


import com.jiangpeisi.dao.ICourseEnrollmentDao;
import com.jiangpeisi.dao.ICourseResourceDao;
import com.jiangpeisi.dao.IStudentDao;
import com.jiangpeisi.domain.CourseOffering;
import com.jiangpeisi.domain.CourseResource;
import com.jiangpeisi.domain.Student;
import com.jiangpeisi.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service("studentService")
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentDao studentDao;
    @Autowired
    private ICourseEnrollmentDao courseEnrollmentDao;
    @Autowired
    private ICourseResourceDao course_resourceDao;

    /**
     * 注册用户
     * @param student
     * @return
     */
    @Override
    public String insert(Student student) {
        if (studentDao.findByName(student.getUsername()) != null)
            return "注册失败，" + student.getUsername() + "已经存在";
        else {
            studentDao.insert(student);
            return "注册成功";
        }
    }

    /**
     * 删除用户
     * @param student
     * @return
     */
    @Override
    public String delete(Student student) {
        studentDao.delete(student);
        return "删除成功";
    }

    /**
     * 更改用户密码
     * @param student
     * @return
     */
    @Override
    public String updatePassword(Student student) {
        Student temp = studentDao.findByName(student.getUsername());
        if (temp == null) {
            return "更改失败,用户不存在";
        } else if (temp.getFindkey().equals(student.getFindkey())) {
            studentDao.updatePassword(student);
            return "更改成功";
        } else {
            return "更改失败，密钥错误";
        }
    }

    /**
     * 更新用户信息
     * @param student
     */
    @Override
    public String update(Student student) {
        studentDao.update(student);
        return "信息更新成功";
    }

    /**
     * 用户登陆
     * @param student
     * @return
     */
    @Override
    public String login(Student student) {
        Student temp = studentDao.findByName(student.getUsername());
        if (temp == null) {
            return "账户不存在";
        } else if (temp.getPassword().equals(student.getPassword())) {
            return "登陆成功";
        } else {
            return "密码错误";
        }
    }

    /**
     * 根据username查询用户信息
     * @param name
     * @return
     */
    @Override
    public Student findByName(String name) {
        return studentDao.findByName(name);
    }

    /**
     * 选课
     * @param co
     * @param student
     * @return
     */
    @Override
    public String chooseCourse(CourseOffering co,Student student) {
        courseEnrollmentDao.insert(co.getId(),student.getId());
        return "选课成功";
    }

    /**
     * 获取已经选的课程
     * @param student
     * @return
     */
    @Override
    public List<CourseOffering> findChooseCourse(Student student) {
        return courseEnrollmentDao.findByStudent(student);
    }
}
