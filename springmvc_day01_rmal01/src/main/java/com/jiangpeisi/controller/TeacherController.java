package com.jiangpeisi.controller;

import com.jiangpeisi.domain.Course;
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

    @RequestMapping("/insert")
    public  @ResponseBody String insert(@RequestBody Teacher teacher){
        System.out.println("Controller /teacher/insert 执行");
        return teacherService.insert(teacher);
    }

    @RequestMapping("/updatePassword")
    public @ResponseBody String updatePassword(@RequestBody Teacher teacher){
        System.out.println("Controller /teacher/updatePassword执行");
        return teacherService.updatePassword(teacher);
    }
    @RequestMapping("/update")
    public @ResponseBody String update(@RequestBody Teacher teacher) {
        System.out.println("Controller /teacher/update 执行");
        return teacherService.update(teacher);
    }

    @RequestMapping("/delete")
    public @ResponseBody String delete(@RequestBody Teacher teacher) {
        System.out.println("Controller /teacher/delete 执行");
        return teacherService.delete(teacher);
    }
    @RequestMapping("/findByName")
    public @ResponseBody
    Teacher findByName(@RequestBody Teacher teacher){
        System.out.println("Controller /teacher/findByName 执行");
        return teacherService.findByName(teacher.getUsername());
    }
    @RequestMapping("createCourse")
    public @ResponseBody String createCourse(@RequestBody Course course){
        System.out.println("Controller /teacher/createCourse 执行");
        return teacherService.createCourse(course);
    }
}
