package com.jiangpeisi.controller;

import com.jiangpeisi.domain.User;
import com.jiangpeisi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/insert")
    public  @ResponseBody String insert(@RequestBody User user){
        System.out.println("Controller /user/insert 执行");
        return userService.insert(user);
    }

    @RequestMapping("/login")
    public  @ResponseBody String login(@RequestBody User user){
        System.out.println("Controller /user/login 执行");
        return userService.login(user);
    }
    @RequestMapping("/updatePassword")
    public @ResponseBody String updatePassword(@RequestBody User user){
        System.out.println("Controller /user/updatePassword执行");
        return userService.updatePassword(user);
    }
    @RequestMapping("/update")
    public @ResponseBody String update(@RequestBody User user) {
        System.out.println("Controller /user/update 执行");
        return userService.update(user);
    }

    @RequestMapping("/delete")
    public @ResponseBody String delete(@RequestBody User user) {
        System.out.println("Controller /user/delete 执行");
        return userService.delete(user);
    }
    @RequestMapping("/findByUsername")
    public @ResponseBody User findByUsername(@RequestBody User user){
        System.out.println("Controller /user/findByUsername 执行");
        return userService.findByUsername(user);
    }
}
