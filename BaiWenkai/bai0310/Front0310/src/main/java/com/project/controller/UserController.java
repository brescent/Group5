package com.project.controller;

import com.alibaba.fastjson.JSON;
import com.project.entity.UserEntity;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@RestController("user")
public class UserController {

    @RequestMapping("addUser")
    public void addUSer(UserEntity user) throws IOException {
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost post = new HttpPost("http://localhost:8080/AfterEnd/user/addUser");

        List<BasicNameValuePair> listParm=new ArrayList<>();
        listParm.add(new BasicNameValuePair("name",user.getName()));
        listParm.add(new BasicNameValuePair("age",user.getAge()));
        listParm.add(new BasicNameValuePair("pwd",user.getPwd()));

        try {
            post.setEntity(new UrlEncodedFormEntity(listParm,"utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        String json = JSON.toJSONString(user);
        StringEntity entity = new StringEntity(json, "UTF-8");

        post.setEntity(entity);

        HttpResponse response = httpClient.execute(post);

        return;
    }

    @RequestMapping("findById/{id}")
    public String findById(@PathVariable("id") int id) throws IOException {
        HttpClient httpClient = HttpClients.createDefault();
        HttpGet get = new HttpGet("http://localhost:8080/After0310/user/findById/"+id);

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

    @RequestMapping("findByUserId/{userId}")
    public String findByUserId(@PathVariable("userId") int userId) throws IOException {
        HttpClient httpClient = HttpClients.createDefault();
        HttpGet get = new HttpGet("http://localhost:8080/After0310/user/findByUserId/"+userId);

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
}
