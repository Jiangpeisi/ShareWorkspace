package com.jiangpeisi.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.net.URLEncoder;
import java.util.List;

@Controller
public class FileUploadAndDownloadController {

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
