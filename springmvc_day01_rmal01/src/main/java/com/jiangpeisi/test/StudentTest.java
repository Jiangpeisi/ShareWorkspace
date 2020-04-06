package com.jiangpeisi.test;

import com.google.gson.JsonObject;
import org.junit.Test;

import java.io.IOException;

public class StudentTest {
    Http http =new Http();
    @Test
    public void choosecourse(){
        JsonObject jsonObject=new JsonObject();
        jsonObject.addProperty("course_offering_id",4);
        jsonObject.addProperty("student_id",4);
        String url="http://localhost:8080/springmvc_day01_rmal01_war/student/chooseCourse";
        try {
            System.out.println(http.post(url,jsonObject.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void get(){
        String url="http://localhost:8080/springmvc_day01_rmal01_war/upload/1_head.jpg";
        try {
            System.out.println(http.get(url));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void getchoosecourse(){
        JsonObject jsonObject=new JsonObject();
        jsonObject.addProperty("id",3);
        String url="http://localhost:8080/springmvc_day01_rmal01_war/student/findChooseCourse";
        try {
            System.out.println(http.post(url,jsonObject.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void updatepassword(){
        JsonObject jsonObject=new JsonObject();
        jsonObject.addProperty("username","10");
        jsonObject.addProperty("password","12");
        jsonObject.addProperty("findkey","11");
        String url="http://localhost:8080/springmvc_day01_rmal01_war/teacher/updatePassword";
        try {
            System.out.println(http.post(url,jsonObject.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
