package com.jiangpeisi.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 教师
 */
public class Teacher implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private String findkey;
    private String address;
    private String sex;
    private String tel;
    private String email;
    private String signature;
    private String nickname;
    private String age;
    private String avatar;
    private List<Course> offering_courses;

    public List<Course> getOffering_courses() {
        return offering_courses;
    }

    public void setOffering_courses(List<Course> offering_courses) {
        this.offering_courses = offering_courses;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", findkey='" + findkey + '\'' +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", signature='" + signature + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age='" + age + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFindkey() {
        return findkey;
    }

    public void setFindkey(String findkey) {
        this.findkey = findkey;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
