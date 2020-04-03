package com.jiangpeisi.test;

import com.google.gson.JsonObject;
import org.junit.Test;

import java.io.IOException;

public class StudentTest {
    Http http =new Http();
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
