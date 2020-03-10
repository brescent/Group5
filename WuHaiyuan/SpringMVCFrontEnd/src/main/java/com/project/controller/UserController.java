package com.project.controller;

import com.project.entity.UserEntity;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

import java.io.IOException;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping(value = "findUserBefore/{name}", method = RequestMethod.GET)
    public String findByName(@PathVariable("name") String name) {
        //1、创建httpclient 对象
        HttpClient httpClient = HttpClients.createDefault();
        //创建get对象
        HttpGet httpGet = new HttpGet("http://localhost:8082/service/findUserAfter/" + name);
        //执行get请求,并获取返回
        try {
            HttpResponse httpResponse = httpClient.execute(httpGet);
            //获取返回的实体
            HttpEntity httpEntity = httpResponse.getEntity();
            //获取实体对象中的字符，也就是后端返回的json
            String json = EntityUtils.toString(httpEntity, "utf-8");
            return json;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("addUserBefore")
    public String addUser(UserEntity user) {
        //1、创建httpclient 对象
        HttpClient httpClient = HttpClients.createDefault();
        //2,创建post对象
        HttpPost httpPost = new HttpPost("http://localhost:8082/service/addUserAfter");
        //3,利用阿里的fastjson，将Object转换为json字符串;
        String jsonString = JSON.toJSONString(user);
        StringEntity entity = new StringEntity(jsonString, "UTF-8");

        //4. post请求是将参数放在请求体里面传过去的;这里将entity放入post请求体中
        httpPost.setEntity(entity);

        httpPost.setHeader("Content-Type", "application/json;charset=utf8");

        // 5,由客户端执行(发送)Post请求
        try {
            HttpResponse httpResponse = httpClient.execute(httpPost);
            //获取返回的实体
            HttpEntity httpEntity = httpResponse.getEntity();
            //获取实体对象中的字符，也就是后端返回的json
            String json = EntityUtils.toString(httpEntity, "utf-8");
            return json;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    @RequestMapping("findAllBefore")
    public String findAll(){
        //1、创建httpclient 对象
        HttpClient httpClient = HttpClients.createDefault();
        //创建get对象
        HttpGet httpGet = new HttpGet("http://localhost:8082/service/findAllAfter");
        //执行get请求,并获取返回
        try {
            HttpResponse httpResponse = httpClient.execute(httpGet);
            //获取返回的实体
            HttpEntity httpEntity = httpResponse.getEntity();
            //获取实体对象中的字符，也就是后端返回的json
            String json = EntityUtils.toString(httpEntity, "utf-8");
            return json;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
