package com.project.controller;

import com.alibaba.fastjson.JSON;
import com.project.service.IGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("grade")
public class GradeController {

    @Autowired
    private IGradeService gradeService;

    @RequestMapping("getAllGrade")
    public String getAllGrade(){
        String gradeStr = JSON.toJSONString(gradeService.findAll());;
        return gradeStr;
    }
}
