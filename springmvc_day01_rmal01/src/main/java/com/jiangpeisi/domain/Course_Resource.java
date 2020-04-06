package com.jiangpeisi.domain;

/**
 * 课程资源
 */
public class Course_Resource {
   private Integer id;
   private Integer course_id;
   private String resource_url;
   private String resource_name;
   private String resource_type;

   @Override
   public String toString() {
      return "Course_Resource{" +
              "id=" + id +
              ", course_id=" + course_id +
              ", resource_url='" + resource_url + '\'' +
              ", resource_name='" + resource_name + '\'' +
              ", resource_type='" + resource_type + '\'' +
              '}';
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public Integer getCourse_id() {
      return course_id;
   }

   public void setCourse_id(Integer course_id) {
      this.course_id = course_id;
   }

   public String getResource_url() {
      return resource_url;
   }

   public void setResource_url(String resource_url) {
      this.resource_url = resource_url;
   }

   public String getResource_name() {
      return resource_name;
   }

   public void setResource_name(String resource_name) {
      this.resource_name = resource_name;
   }

   public String getResource_type() {
      return resource_type;
   }

   public void setResource_type(String resource_type) {
      this.resource_type = resource_type;
   }
}
