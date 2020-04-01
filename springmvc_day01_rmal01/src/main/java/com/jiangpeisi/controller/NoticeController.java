package com.jiangpeisi.controller;

import com.jiangpeisi.domain.Notice;
import com.jiangpeisi.service.INoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    INoticeService noticeService;
    @RequestMapping("/findAll")
    public @ResponseBody List<Notice> findAll(){
        System.out.println("findall执行了");
        return noticeService.findAll();
    }
    @RequestMapping("/insert")
    public @ResponseBody String insert(@RequestBody Notice notice){
        System.out.println("insert执行了");
        return noticeService.insert(notice);
    }
}
