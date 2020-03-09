package com.project.controller;


import com.project.dao.IUserDao;
import com.project.entity.UserEntity;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

//整个类的方法不会再做视图渲染，只返回数据
@RestController
public class UserController {

@Autowired
private IUserDao dao;


    @RequestMapping(value = "getUserInfo/{name}", method = RequestMethod.GET)
    //@ResponseBody //不做视图渲染，只返回数据
    public String getUserInfo(@PathVariable("name") String name){
        //调用服务器数据，所以它对于浏览器属于后端，对于后端服务器属于客户端
        //1、创建httpclient 对象
        HttpClient httpClient= HttpClients.createDefault();





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
}
