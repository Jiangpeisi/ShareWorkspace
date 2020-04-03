package com.jiangpeisi.test;

import com.google.gson.JsonObject;
import org.junit.Test;

import java.io.IOException;

public class TeacherTest {
    Http http =new Http();
    @Test
    public void createCourse(){
        JsonObject jsonObject=new JsonObject();
        jsonObject.addProperty("name","计算机组成原理");
        jsonObject.addProperty("description","测试创建课程");
        String url="http://localhost:8080/springmvc_day01_rmal01_war/teacher/createCourse";
        try {
            System.out.println(http.post(url,jsonObject.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void delete(){
        JsonObject jsonObject=new JsonObject();
        jsonObject.addProperty("username","10");
        jsonObject.addProperty("password","10");
        jsonObject.addProperty("findkey","10");
        String url="http://localhost:8080/springmvc_day01_rmal01_war/teacher/delete";
        try {
            System.out.println(http.post(url,jsonObject.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void teacherlogin(){
        String url="http://localhost:8080/springmvc_day01_rmal01_war/teacher/login";
        try {
            JsonObject jsonObject=new JsonObject();
            jsonObject.addProperty("username","10");
            jsonObject.addProperty("password","10");
            System.out.println(http.post(url,jsonObject.toString()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
