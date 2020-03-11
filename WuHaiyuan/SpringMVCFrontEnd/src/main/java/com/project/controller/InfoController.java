package com.project.controller;

import com.alibaba.fastjson.JSON;
import com.project.entity.InfoEntity;
import com.project.entity.UserEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.Date;

@RestController
public class InfoController {
    @RequestMapping("addUserInfo")
    public void addInfo(InfoEntity info){

       info.setChangeDate(new Date(System.currentTimeMillis()));
        //1、创建httpclient 对象
        HttpClient httpClient = HttpClients.createDefault();
        //2,创建post对象
        HttpPost httpPost = new HttpPost("http://localhost:8082/service/addInfo");
        //3,利用阿里的fastjson，将Object转换为json字符串;
        String jsonString = JSON.toJSONString(info);
        StringEntity entity = new StringEntity(jsonString, "UTF-8");

        //4. post请求是将参数放在请求体里面传过去的;这里将entity放入post请求体中
        httpPost.setEntity(entity);

        httpPost.setHeader("Content-Type", "application/json;charset=utf8");

        // 5,由客户端执行(发送)Post请求
        try {
            httpClient.execute(httpPost);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
