package com.jiangpeisi.controller;

import com.jiangpeisi.domain.*;
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
    @RequestMapping("/createCourse")
    public @ResponseBody String createCourse(@RequestBody Course course){
        System.out.println("Controller /teacher/createCourse 执行");
        return teacherService.createCourse(course);
    }
    @RequestMapping("/offerCourse")
    public @ResponseBody String offerCourse(@RequestBody Course_Offering course_offering){
        System.out.println(course_offering);
        System.out.println("Controller /teacher/offerCourse 执行");
        return teacherService.offerCourse(course_offering);
    }
    @RequestMapping("/findChooseStudent")
    public @ResponseBody Course_Offering findChooseStudent(@RequestBody Course_Offering course_offering){
        System.out.println("Controller /teacher/findChooseStudent 执行");
        return teacherService.findChooseStudent(course_offering);
    }

    @RequestMapping("/quote_Resource")
    public @ResponseBody String quote_Resource(@RequestBody Course_Offering_Resource course_offering_resource){
        System.out.println("Controller /teacher/quote_Resource 执行");
        return teacherService.quote_Resource(course_offering_resource);
    }
    @RequestMapping("/findQuoteResource")
    public @ResponseBody Course_Offering findQuoteResource(@RequestBody Course_Offering course_offering){
        System.out.println("Controller /teacher/findQuoteResource 执行");
        return teacherService.findQuoteResource(course_offering);
    }
}
