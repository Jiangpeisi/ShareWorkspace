package com.jiangpeisi.service.impl;

import com.jiangpeisi.dao.IChoose_CourseDao;
import com.jiangpeisi.dao.ICourse_ResourceDao;
import com.jiangpeisi.dao.IStudentDao;
import com.jiangpeisi.domain.Course_Choose;
import com.jiangpeisi.domain.Course_Resource;
import com.jiangpeisi.domain.Student;
import com.jiangpeisi.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("studentService")
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentDao studentDao;
    @Autowired
    private IChoose_CourseDao choose_courseDao;
    @Autowired
    private ICourse_ResourceDao course_resourceDao;
    /**
     * 注册用户
     * @param student
     * @return
     */
    @Override
    public String insert(Student student) {
        if(studentDao.findByName(student.getUsername())!=null)
            return "注册失败，"+ student.getUsername()+"已经存在";
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
        Student temp=studentDao.findByName(student.getUsername());
        if(temp==null){
            return "更改失败,用户不存在";
        }
        else if (temp.getFindkey().equals(student.getFindkey())){
            studentDao.updatePassword(student);
            return "更改成功";
        }
        else {
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
//        User temp=userDao.findByUsername(user.getUsername());
//        if(temp!=null) {
//            temp.setSex(user.getSex());
//            temp.setAddress(user.getAddress());
//            temp.setEmail(user.getEmail());
//            temp.setTel(user.getTel());
//            temp.setSignature(user.getSignature());
//            temp.setNickname(user.getNickname());
//            temp.setAge(user.getAge());
//            temp.setAvatar(user.getAvatar());
//            userDao.update(temp);
//            return "信息更新成功";
//        }
//        else
//        {
//            return "信息更新失败";
//        }
    }

    /**
     * 用户登陆
     * @param student
     * @return
     */
    @Override
    public String login(Student student) {
        Student temp=studentDao.findByName(student.getUsername());
        if (temp==null){
            return "账户不存在";
        }
        else if(temp.getPassword().equals(student.getPassword())){
            return "登陆成功";
        }
        else{
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

    @Override
    public String chooseCourse(Course_Choose course_choose) {
        choose_courseDao.insert(course_choose);
        return "选课成功";
    }

    @Override
    public Student findChooseCourse(Student student) {
        return studentDao.get_choose_course(student);
    }

    @Override
    public Course_Resource findCourseById(int id) {
        return course_resourceDao.findById(id);
    }
}
