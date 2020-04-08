package com.jiangpeisi.controller;

import com.jiangpeisi.domain.Student;
import com.jiangpeisi.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;


@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping("/insert")
    public @ResponseBody
    String insert(@RequestBody Student student) {
        System.out.println("Controller /user/insert 执行");
        return studentService.insert(student);
    }

    @RequestMapping("/login")
    public @ResponseBody
    Map<String, String> login(@RequestBody Student student) {
        System.out.println("Controller /user/login 执行");
        Map<String, String> result = studentService.login(student);

        return result;
    }

    @RequestMapping("/updatePassword")
    public @ResponseBody
    String updatePassword(@RequestBody Student student) {
        System.out.println("Controller /user/updatePassword执行");
        return studentService.updatePassword(student);
    }

    @RequestMapping("/update")
    public @ResponseBody
    String update(@RequestBody Student student) {
        System.out.println("Controller /user/update 执行");
        return studentService.update(student);
    }

    @RequestMapping("/delete")
    public @ResponseBody
    String delete(@RequestBody Student student) {
        System.out.println("Controller /user/delete 执行");
        return studentService.delete(student);
    }

    @RequestMapping("/findByName")
    public @ResponseBody
    Student findByName(@RequestBody Student student) {
        System.out.println("Controller /user/findByName 执行");
        return studentService.findByName(student.getUsername());
    }

    /*
    @RequestMapping("/chooseCourse")
    public @ResponseBody  String chooseCourse(@RequestBody Course_Choose course_choose){
        System.out.println("Controller /user/chooseCourse 执行");
        return studentService.chooseCourse(course_choose);
}*/

    @RequestMapping("/findChooseCourse")
    public @ResponseBody
    Student findChooseCourse(@RequestBody Student student) {
        System.out.println("Controller /user/findChooseCourse 执行");
        return studentService.findChooseCourse(student);
    }
}
