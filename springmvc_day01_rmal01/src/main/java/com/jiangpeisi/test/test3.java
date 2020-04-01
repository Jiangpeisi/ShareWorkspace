package com.jiangpeisi.test;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.jiangpeisi.domain.User;
import com.jiangpeisi.service.impl.NoticeServiceImpl;
import com.jiangpeisi.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class test3 {
    @Resource(name = "userService")
    private UserServiceImpl userService;
    private com.jiangpeisi.test.Test test=new com.jiangpeisi.test.Test();
    @Test
    public void teacherlogin(){
        String url="http://localhost:8080/springmvc_day01_rmal01_war/teacher/login";
        try {
            JsonObject jsonObject=new JsonObject();
            jsonObject.addProperty("username","1");
            jsonObject.addProperty("password","1");
            System.out.println(test.post(url,jsonObject.toString()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public  void findAll(){
        String url="http://47.107.103.142:8080/springmvc_day01_rmal01/notice/findAll";
        try {
            System.out.println(test.get(url));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void insertnotice(){
        JsonObject jsonObject=new JsonObject();
        jsonObject.addProperty("title","测试通知标题");
        jsonObject.addProperty("content","测试通知内容");
        DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        jsonObject.addProperty("release_time",dFormat.format(new Date()));
        jsonObject.addProperty("announcer","测试发布者");
        System.out.println(jsonObject.toString());
        String url="http://localhost:8080/springmvc_day01_rmal01_war/notice/insert";
        try {
            System.out.println(test.post(url,jsonObject.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void insert(){
        User user=new User();
        user.setUsername("31232321233");
        user.setPassword("123");
        user.setFindkey("123");
        userService.insert(user);
    }
    @Test
    public void updateuser(){
        JsonObject jsonObject=new JsonObject();
        jsonObject.addProperty("username","1");
        jsonObject.addProperty("tel","15651289207");
        jsonObject.addProperty("sex","男");
        jsonObject.addProperty("age","13");
        String url="http://localhost:8080/springmvc_day01_rmal01_war/user/update";
        try {
            System.out.println(test.post(url,jsonObject.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void getuser(){
        JsonObject jsonObject =new JsonObject();
        jsonObject.addProperty("username","1");
        String url="http://localhost:8080/springmvc_day01_rmal01_war/user/findByUsername";
        try {
            System.out.println(test.post(url,jsonObject.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
