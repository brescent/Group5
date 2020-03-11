package com.project.controller;


import com.project.util.StringUtil;
import com.project.vo.UserVO;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;


@RestController
public class UserController {

    @RequestMapping(value = "find/{name}",method = RequestMethod.GET)
    public   String findUser(@PathVariable("name") String name){
        //调用服务器数据，所以它对于浏览器属于后端，对于后端服务器属于客户端
        //1、创建httpclient 对象
        HttpClient httpClient= HttpClients.createDefault();
        //创建get对象
        HttpGet httpGet=new HttpGet("http://localhost:8081/SpringSer/find/"+name);
        //执行get请求,并获取返回
        try {
            HttpResponse httpResponse= httpClient.execute(httpGet);
            //获取返回的实体
            HttpEntity httpEntity= httpResponse.getEntity();
            //获取实体对象中的字符,,也就是后端返回的json
            String json=   EntityUtils.toString(httpEntity,"utf-8");

            return json;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  null;
    }

    @RequestMapping("addUser")
    public ModelAndView addUser(UserVO userVO){
        ModelAndView mv=new ModelAndView("addUser");
        mv.addObject("info", StringUtil.USER_ADD_OK);
        //post提交到后端
        //1、创建httpclient
        HttpClient httpClient=HttpClients.createDefault();
        //创建post请求
        HttpPost post=new HttpPost("http://localhost:8081/SpringSer0310/addUser");
        //post放入参数
        List<BasicNameValuePair> listParm=new ArrayList<>();
        listParm.add(new BasicNameValuePair("name",userVO.getName()));
        listParm.add(new BasicNameValuePair("age",String.valueOf(userVO.getAge())));
        listParm.add(new BasicNameValuePair("pwd",userVO.getPwd()));

        try {
            post.setEntity(new UrlEncodedFormEntity(listParm,"utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        //执行psot请求
        try {
            HttpResponse httpResponse=  httpClient.execute(post);
            HttpEntity entity=    httpResponse.getEntity();
            String result=    EntityUtils.toString(entity,"utf-8");
            if(!result.equals("ok")){
                //如果没成功就返回login
                mv.setViewName("login");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  mv;
    }


}
