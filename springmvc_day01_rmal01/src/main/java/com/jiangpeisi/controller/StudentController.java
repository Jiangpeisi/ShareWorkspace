package com.jiangpeisi.controller;

import com.jiangpeisi.domain.Student;
import com.jiangpeisi.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping("/insert")
    public  @ResponseBody String insert(@RequestBody Student student){
        System.out.println("Controller /user/insert 执行");
        return studentService.insert(student);
    }

    @RequestMapping("/login")
    public  @ResponseBody String login(@RequestBody Student student){
        System.out.println("Controller /user/login 执行");
        return studentService.login(student);
    }
    @RequestMapping("/updatePassword")
    public @ResponseBody String updatePassword(@RequestBody Student student){
        System.out.println("Controller /user/updatePassword执行");
        return studentService.updatePassword(student);
    }
    @RequestMapping("/update")
    public @ResponseBody String update(@RequestBody Student student) {
        System.out.println("Controller /user/update 执行");
        return studentService.update(student);
    }

    @RequestMapping("/delete")
    public @ResponseBody String delete(@RequestBody Student student) {
        System.out.println("Controller /user/delete 执行");
        return studentService.delete(student);
    }
    @RequestMapping("/findByName")
    public @ResponseBody
    Student findByName(@RequestBody Student student){
        System.out.println("Controller /user/findByName 执行");
        return studentService.findByName(student.getUsername());
    }
}
