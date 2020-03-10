package com.project.controller;


import com.alibaba.fastjson.JSON;
import com.project.dao.IUserDao;
import com.project.entity.UserEntity;
import com.project.entity.UserInfoEntity;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


//整个类的方法不会再做视图渲染，只返回数据
@RestController
public class UserController {

@Autowired
private IUserDao dao;

@RequestMapping("getAllUser")

public String getAllUser(){
    //调用服务器数据，所以它对于浏览器属于后端，对于后端服务器属于客户端
    //1、创建httpclient 对象
    HttpClient httpClient= HttpClients.createDefault();





    //创建get对象
    HttpGet httpGet=new HttpGet("http://localhost:8081/springService/getAllUser");



    //执行get请求,并获取返回


    try {
        HttpResponse httpResponse= httpClient.execute(httpGet);
        //获取返回的实体
        HttpEntity httpEntity= httpResponse.getEntity();
        //获取实体对象中的字符，也就是后端返回的json
        String json=   EntityUtils.toString(httpEntity,"utf-8");

        return json;
    } catch (IOException e) {
        e.printStackTrace();
    }
    return  null;
}


    @RequestMapping("getUserInfo")
    //@ResponseBody //不做视图渲染，只返回数据
    public String getUserInfo(HttpServletRequest request){
        //调用服务器数据，所以它对于浏览器属于后端，对于后端服务器属于客户端
        //1、创建httpclient 对象
        HttpClient httpClient= HttpClients.createDefault();

       String  name=request.getParameter("name");



        //创建get对象
        HttpGet httpGet=new HttpGet("http://localhost:8081/springService/getUserInfo/"+name);



        //执行get请求,并获取返回


        try {
            HttpResponse httpResponse= httpClient.execute(httpGet);
            //获取返回的实体
            HttpEntity httpEntity= httpResponse.getEntity();
            //获取实体对象中的字符，也就是后端返回的json
            String json=   EntityUtils.toString(httpEntity,"utf-8");

            return json;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  null;
    }


    @RequestMapping("register")
    public void register(HttpServletRequest request){

        //调用服务器数据，所以它对于浏览器属于后端，对于后端服务器属于客户端
        //1、创建httpclient 对象
        HttpClient httpClient= HttpClients.createDefault();
//参数
        String name =request.getParameter("name");
        String pwd=request.getParameter("pwd");
        int age=Integer.parseInt(request.getParameter("age"));





        UserEntity  user=new UserEntity(name,pwd,age);


        //创建get对象
        HttpPost httpPost=new HttpPost("http://localhost:8081/springService/register");

        String jsonString = JSON.toJSONString(user);
        StringEntity entity = new StringEntity(jsonString, "UTF-8");

        httpPost.setEntity(entity);
        httpPost.setHeader("Content-Type","application/json;charset=utf-8");
        CloseableHttpResponse response = null;
        try {
            response = (CloseableHttpResponse) httpClient.execute(httpPost);
            HttpEntity responseEntity = response.getEntity();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(response!=null){
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

@RequestMapping("addInfo")
    public void addInfo(HttpServletRequest request){

        HttpClient httpClient= HttpClients.createDefault();
//参数
        String job=request.getParameter("job");
        int salary=Integer.parseInt(request.getParameter("salary"));

        UserInfoEntity userInfo=new UserInfoEntity(job,salary);

        //创建get对象
        HttpPost httpPost=new HttpPost("http://localhost:8081/springService/addInfo");

        String jsonString = JSON.toJSONString(userInfo);
        StringEntity entity = new StringEntity(jsonString, "UTF-8");

        httpPost.setEntity(entity);
        httpPost.setHeader("Content-Type","application/json;charset=utf-8");
        CloseableHttpResponse response = null;
        try {
            response = (CloseableHttpResponse) httpClient.execute(httpPost);
            HttpEntity responseEntity = response.getEntity();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(response!=null){
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
