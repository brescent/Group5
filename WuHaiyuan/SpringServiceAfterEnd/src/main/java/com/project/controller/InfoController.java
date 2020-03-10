package com.project.controller;

import com.project.entity.InfoEntity;
import com.project.service.IInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @Autowired
    private IInfoService infoService;
    @RequestMapping(value = "addInfo",method = RequestMethod.POST)
    public void addInfo(@RequestBody InfoEntity info){
        infoService.add(info);
    }
}
