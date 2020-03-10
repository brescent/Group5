package com.project.controller;

import com.alibaba.druid.util.HttpClientUtils;
import com.alibaba.fastjson.JSON;
import com.project.entity.UserEntity;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;
import java.io.IOException;


@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("getUser/{id}")
    @ResponseBody
    String findUser(@PathVariable("id") int id) throws IOException {
        HttpClient httpClient = HttpClients.createDefault();
        HttpGet get = new HttpGet("http://localhost:8080/AfterEnd/user/getUser/"+id);

        HttpResponse response = httpClient.execute(get);

        HttpEntity userEntity = response.getEntity();

        String userJson = null;

        try {
            userJson = EntityUtils.toString(userEntity,"utf-8");
            return userJson;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    @RequestMapping("addUser")
    String addUser(String name,String pwd,String ageStr) throws IOException {
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost post = new HttpPost("http://localhost:8080/AfterEnd/user/addUser");

        UserEntity user = new UserEntity(name,pwd,ageStr);

        String json = JSON.toJSONString(user);
        StringEntity entity = new StringEntity(json, "UTF-8");

        post.setEntity(entity);

        HttpResponse response = httpClient.execute(post);

        System.out.println("add");

        return "index";
    }
}
