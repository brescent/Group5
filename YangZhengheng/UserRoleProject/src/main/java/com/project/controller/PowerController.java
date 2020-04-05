package com.project.controller;

import com.project.entity.PowerEntity;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PowerController {

    @RequestMapping(value = "sing")
    public ModelAndView sing(){
        ModelAndView mv=new ModelAndView("PowerInfo");
        PowerEntity power=new PowerEntity();
        power.setPowerName("唱歌");
        power.setPowerUrl("sing");
        mv.addObject("power",power);
        return mv;
    }

    @RequestMapping(value = "add")
    public ModelAndView addUser(){
        ModelAndView mv=new ModelAndView("PowerInfo");
        PowerEntity power=new PowerEntity();
        power.setPowerName("添加用户");
        power.setPowerUrl("add");
        return mv;
    }
}
