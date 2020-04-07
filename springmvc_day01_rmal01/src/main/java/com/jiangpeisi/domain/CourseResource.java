package com.jiangpeisi.domain;

import java.io.Serializable;

/**
 * 课程资源
 */
public class CourseResource implements Serializable {
   private Integer id;
   private Integer courseId;
   private String resourceURL;
   private String resourceName;
   private String resourceType;

   @Override
   public String toString() {
      return "CourseResource{" +
              "id=" + id +
              ", courseId=" + courseId +
              ", resourceURL='" + resourceURL + '\'' +
              ", resourceName='" + resourceName + '\'' +
              ", resourceType='" + resourceType + '\'' +
              '}';
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public Integer getCourseId() {
      return courseId;
   }

   public void setCourseId(Integer courseId) {
      this.courseId = courseId;
   }

   public String getResourceURL() {
      return resourceURL;
   }

   public void setResourceURL(String resourceURL) {
      this.resourceURL = resourceURL;
   }

   public String getResourceName() {
      return resourceName;
   }

   public void setResourceName(String resourceName) {
      this.resourceName = resourceName;
   }

   public String getResourceType() {
      return resourceType;
   }

   public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
   }
}
