package com.jiangpeisi.test;

import com.google.gson.JsonObject;
import org.junit.Test;

import java.io.IOException;

public class TeacherTest {
    Http http =new Http();
    @Test
    public void findquote(){
        JsonObject jsonObject=new JsonObject();
        jsonObject.addProperty("id",3);
        String url="http://localhost:8080/springmvc_day01_rmal01_war/teacher/findQuoteResource";
        try {
            System.out.println(http.post(url,jsonObject.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void quote(){
        JsonObject jsonObject=new JsonObject();
        jsonObject.addProperty("course_offering_id",3);
        jsonObject.addProperty("course_resource_id",3);
        String url="http://localhost:8080/springmvc_day01_rmal01_war/teacher/quote_Resource";
        try {
            System.out.println(http.post(url,jsonObject.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void uploadresource(){
        JsonObject jsonObject=new JsonObject();
        jsonObject.addProperty("course_id",3);
        jsonObject.addProperty("url","testurl");
        jsonObject.addProperty("name","测试名称");
        jsonObject.addProperty("type","video");
        String url="http://localhost:8080/springmvc_day01_rmal01_war/teacher/uploadResource";
        try {
            System.out.println(http.post(url,jsonObject.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void findchoosestudent(){
        JsonObject jsonObject=new JsonObject();
        jsonObject.addProperty("id",4);
        String url="http://localhost:8080/springmvc_day01_rmal01_war/teacher/findChooseStudent";
        try {
            System.out.println(http.post(url,jsonObject.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void offerCourse(){
        JsonObject jsonObject=new JsonObject();
        jsonObject.addProperty("course_id",2);
        jsonObject.addProperty("teacher_id",2);
        String url="http://localhost:8080/springmvc_day01_rmal01_war/teacher/offerCourse";
        try {
            System.out.println(http.post(url,jsonObject.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void createCourse(){
        JsonObject jsonObject=new JsonObject();
        jsonObject.addProperty("name","网络工程");
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
