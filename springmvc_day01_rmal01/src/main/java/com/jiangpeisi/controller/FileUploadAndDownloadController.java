package com.jiangpeisi.controller;

import com.jiangpeisi.domain.Course_Resource;
import com.jiangpeisi.service.IStudentService;
import com.jiangpeisi.service.ITeacherService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.net.URLEncoder;
import java.util.List;

@Controller
public class FileUploadAndDownloadController {
    String server="http://localhost:8080/springmvc_day01_rmal01_war/";
//    String server="http://47.107.103.142:8080/springmvc_day01_rmal01/";
    @Autowired
    ITeacherService teacherService;
    @Autowired
    IStudentService studentService;
    @RequestMapping("uploadCourseResource")
    public @ResponseBody String uploadCourseResource(@RequestParam("course_id") int course_id, @RequestParam("uploadfile") List<MultipartFile> uploadfile, HttpServletRequest request){
        if(!uploadfile.isEmpty()&&uploadfile.size()>0){
            for (MultipartFile multipartFile : uploadfile) {
                String filename=multipartFile.getOriginalFilename();
                String path=request.getSession().getServletContext().getRealPath("/Resource/"+course_id+"/");
                File filePath=new File(path);
                if (!filePath.exists()) {
                    filePath.mkdirs();
                }
                try {
                    multipartFile.transferTo(new File(path +filename));
                    Course_Resource course_resource=new Course_Resource();
                    course_resource.setCourse_id(course_id);
                    course_resource.setResource_url(server+"Resource/"+course_id+"/"+filename);
                    course_resource.setResource_name(filename);
                    String [] type=filename.split("\\.");
                    course_resource.setResource_type(type[type.length-1]);
                    teacherService.uploadResource(course_resource);
                    System.out.println(filename+"上传成功");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println(filename+"上传失败");
                    return filename+"上传失败";
                }
            }
            System.out.println("全部上传成功");
            return "上传成功";
        }
        else {
            System.out.println("上传失败，选择文件为空");
            return "上传失败，选择文件为空";
        }
    }
    @RequestMapping("/fileUpload")
    public String handleFormUpload(@RequestParam("name") String name,
                                   @RequestParam("uploadfile") List<MultipartFile> uploadfile, HttpServletRequest request) {
        if (!uploadfile.isEmpty() && uploadfile.size() > 0) {
            for (MultipartFile file : uploadfile) {
                String originalFilename = file.getOriginalFilename();
                String dirPath = request.getSession().getServletContext().getRealPath("/upload/");
                File filePath = new File(dirPath);
                if (!filePath.exists()) {
                    filePath.mkdirs();
                }

                String newFilename = name +"_" + originalFilename;
                try {
                    file.transferTo(new File(dirPath +newFilename));
                } catch (Exception e) {
                    e.printStackTrace();
                    return "error";
                }
            }
            return "success";
        } else {
            return "error";
        }
    }
    @RequestMapping("/download")
    public ResponseEntity<byte[]> filedownload(HttpServletRequest request,String filename) throws Exception{
        String path = request.getSession().getServletContext().getRealPath("/upload");
        File file = new File(path+File.separator+filename);
        //防止文件名乱码
        //filename = this.getFilename(request,filename);
        HttpHeaders headers = new HttpHeaders();
        //设置返回文件的名称
        headers.setContentDispositionFormData("attachment",filename);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.OK);
    }

    //防止文件乱码
    public String getFilename(HttpServletRequest request,String filename) throws Exception{
        String[] IEBrowserKeyWord = {"MSIE","Trident","Edge"};
        String userAgent = request.getHeader("User-Agent");
        for(String keyWord:IEBrowserKeyWord){
            if(userAgent.contains(keyWord)){
                return URLEncoder.encode(filename,"UTF-8");
            }
        }
        return new String(filename.getBytes("UTF-8"),"ISO-8859-1");
    }
}
