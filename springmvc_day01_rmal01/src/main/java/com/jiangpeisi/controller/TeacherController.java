package com.jiangpeisi.controller;

import com.jiangpeisi.domain.Teacher;
import com.jiangpeisi.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    ITeacherService teacherService;
    @RequestMapping("/login")
    public @ResponseBody String login(@RequestBody Teacher teacher){
        System.out.println("/teacher/login执行");
        return teacherService.login(teacher);
    }
}
